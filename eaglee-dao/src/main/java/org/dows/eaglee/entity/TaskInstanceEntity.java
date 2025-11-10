package org.dows.eaglee.entity;

import com.mybatisflex.annotation.Table;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Table("task_instance")
public class TaskInstanceEntity {

    @Schema(title = "任务实例ID")
    private Long taskInstanceId;
    @Schema(title = "任务项目ID")
    private Long taskProjectId;
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
    @Schema(title = "当前耗时")
    private Long elapsedTime;
    @Schema(title = "平均耗时")
    private Long avgTime;
}