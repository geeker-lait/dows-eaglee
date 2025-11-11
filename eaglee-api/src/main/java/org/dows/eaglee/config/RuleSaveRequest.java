package org.dows.eaglee.config;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.*;
import java.math.BigDecimal;


@Data
@Schema(name = "RuleSaveRequest 对象",title = "RuleSaveRequest")
@NoArgsConstructor
public class RuleSaveRequest{
    @Schema(title = "规则名")
    private String ruleName;
    @Schema(title = "json配置")
    private String configJson;
    @Schema(title = "应用类型(0:项目,1:任务)@用户具体选择引用项目还是任务，动态加载出对应的列表")
    private Integer referenceType;
    @Schema(title = "引用ID(项目或任务)")
    private Long referenceId;

}
