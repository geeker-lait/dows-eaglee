package org.dows.eaglee;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import java.lang.reflect.Method;

/**
 * Controller Mock切面：拦截Controller方法，当返回null时自动生成Mock数据
 */
@Aspect
@Component
public class ControllerMockAspect {

    /**
     * 拦截所有Controller中的方法（可根据需要缩小范围，如仅拦截ClusterRest）
     * 切点表达式：拦截带有@RestController注解的类中的所有方法
     */
    @Around("@within(org.springframework.web.bind.annotation.RestController)")
    public Object mockAround(ProceedingJoinPoint joinPoint) throws Throwable {
        // 1. 执行原Controller方法
        Object originalResult = joinPoint.proceed();

        // 2. 若原方法返回null，则生成Mock数据
        if (originalResult == null) {
            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            Method method = signature.getMethod();
            Class<?> returnType = method.getReturnType(); // 响应对象类型
            Object[] args = joinPoint.getArgs(); // 方法参数（请求对象）

            // 获取请求对象（通常是第一个参数，如@RequestBody或请求参数封装对象）
            Object request = args.length > 0 ? args[0] : null;

            // 生成Mock数据并返回
            return MockDataGenerator.generateMock(returnType, request);
        }

        // 3. 若原方法返回非null值，直接返回
        return originalResult;
    }
}