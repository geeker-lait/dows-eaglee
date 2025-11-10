package org.dows.eaglee.entity;

import com.mybatisflex.annotation.Table;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Table("task_define")
public class TaskDefineEntity {

    @Schema(title = "任务定义ID")
    private Long taskDefineId;
    @Schema(title = "项目标识")
    private String projectIdenfifier;
    @Schema(title = "任务标识(表明同一类任务的标识)")
    private String taskIdentifier;
}