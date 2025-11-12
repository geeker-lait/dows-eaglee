package org.dows.eaglee;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;
import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Mock数据生成器：支持基本类型、自定义对象、嵌套对象的Mock值生成
 */
public class MockDataGenerator {
    private static final EasyRandom easyRandom;

    static {
        // 配置随机生成规则（可自定义字段生成策略）
        EasyRandomParameters parameters = new EasyRandomParameters()
                .seed(System.currentTimeMillis()) // 随机种子，保证每次生成不同
                .stringLengthRange(5, 20) // 字符串长度范围
                .collectionSizeRange(1, 3); // 集合大小范围
        easyRandom = new EasyRandom(parameters);
    }

    /**
     * 生成响应对象的Mock数据，支持根据请求对象关联字段
     * @param responseType 响应对象类型
     * @param request 请求对象（可为null）
     * @return 生成的Mock对象
     */
    public static <T> T generateMock(Class<T> responseType, Object request) {
        try {
            // 1. 生成基础Mock对象（基于EasyRandom的随机生成）
            T mockResponse = easyRandom.nextObject(responseType);

            // 2. 若有请求对象，尝试关联相同字段名的值（如请求有id，响应也设置相同id）
            if (request != null) {
                copySameFields(request, mockResponse);
            }

            // 3. 自定义特殊字段的生成规则（覆盖默认随机值）
            customizeFields(mockResponse);

            return mockResponse;
        } catch (Exception e) {
            throw new RuntimeException("生成Mock数据失败：" + e.getMessage(), e);
        }
    }

    /**
     * 复制请求对象和响应对象中相同字段名的值（如请求有id，响应的id同步为相同值）
     */
    private static void copySameFields(Object request, Object response) throws IllegalAccessException {
        Field[] requestFields = request.getClass().getDeclaredFields();
        Field[] responseFields = response.getClass().getDeclaredFields();

        for (Field reqField : requestFields) {
            reqField.setAccessible(true);
            Object reqValue = reqField.get(request);
            if (reqValue == null) continue;

            // 寻找响应对象中同名的字段并赋值
            for (Field resField : responseFields) {
                if (resField.getName().equals(reqField.getName()) 
                        && resField.getType().equals(reqField.getType())) {
                    resField.setAccessible(true);
                    resField.set(response, reqValue);
                    break;
                }
            }
        }
    }

    /**
     * 自定义字段生成规则（例如：时间字段设为当前时间，状态字段设为合理值）
     */
    private static void customizeFields(Object response) throws IllegalAccessException {
        Field[] fields = response.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String fieldName = field.getName();
            Class<?> fieldType = field.getType();

            // 示例1：时间字段设为当前时间
            if ((fieldType == Date.class || fieldType == LocalDateTime.class) 
                    && (fieldName.contains("time") || fieldName.contains("date"))) {
                if (fieldType == Date.class) {
                    field.set(response, new Date());
                } else if (fieldType == LocalDateTime.class) {
                    field.set(response, LocalDateTime.now());
                }
            }

            // 示例2：状态字段（state）设为0或1
            if (fieldName.equals("state") && fieldType == Integer.class) {
                field.set(response, RandomUtils.nextInt(0, 2));
            }

            // 示例3：删除标记（deleted）默认设为0（未删除）
            if (fieldName.equals("deleted") && fieldType == Integer.class) {
                field.set(response, 0);
            }
        }
    }
}