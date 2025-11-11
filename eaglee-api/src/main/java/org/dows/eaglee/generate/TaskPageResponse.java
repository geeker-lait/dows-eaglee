package org.dows.eaglee.generate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.*;
import java.math.BigDecimal;


@Data
@Schema(name = "TaskPageResponse 对象",title = "TaskPageResponse")
@NoArgsConstructor
public class TaskPageResponse{
    @Schema(title = "任务实例ID")
    private Bigint taskInstanceId;
    @Schema(title = "任务项目ID")
    private Bigint taskProjectId;
    @Schema(title = "任务名(ds中的任务编码)")
    private Varchar taskName;
    @Schema(title = "任务标识(表明同一类任务的标识)")
    private Varchar taskIdentifier;
    @Schema(title = "应用ID")
    private Varchar applicationId;
    @Schema(title = "流程实例名称")
    private Varchar processName;
    @Schema(title = "原因")
    private Varchar reason;
    @Schema(title = "平均耗时,平均耗时=项目中某类任务耗时总量")
    private Bigint avgTime;
    @Schema(title = "当前耗时，当前耗时=用当前时间-任务开始时间")
    private Bigint elapsedTime;
    @Schema(title = "时长")
    private Bigint duration;
    @Schema(title = "重试次数")
    private Integer retried;
    @Schema(title = "状态")
    private Integer state;
    @Schema(title = "开始时间")
    private Datetime startTime;
    @Schema(title = "结束时间")
    private Datetime endTime;

}
