package org.dows.eaglee.generate;

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
@Schema(name = "TaskPageRequest 对象",title = "TaskPageRequest")
@NoArgsConstructor
public class TaskPageRequest{
    @Schema(title = "任务名(ds中的任务编码)")
    private String taskName;
    @Schema(title = "任务标识(表明同一类任务的标识)")
    private String taskIdentifier;
    @Schema(title = "应用ID")
    private String applicationId;
    @Schema(title = "流程实例名称")
    private String processName;
    @Schema(title = "原因")
    private String reason;
    @Schema(title = "时长")
    private Long duration;
    @Schema(title = "重试次数")
    private Integer retried;
    @Schema(title = "状态")
    private Integer state;
    @Schema(title = "开始时间")
    private LocalDateTime startTime;
    @Schema(title = "结束时间")
    private LocalDateTime endTime;

}
