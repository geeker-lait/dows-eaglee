package org.dows.eaglee.entity;

import com.mybatisflex.annotation.Table;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Table("task_counter")
public class TaskCounterEntity {

    @Schema(title = "任务计数器ID")
    private Long taskCounterId;
    @Schema(title = "项目标识")
    private String projectIdenfifier;
    @Schema(title = "任务标识")
    private String taskIdentifier;
    @Schema(title = "总耗时")
    private Long expendTotal;
    @Schema(title = "任务实例数量")
    private Long taskCount;
    @Schema(title = "删除")
    private Boolean deleted;
    @Schema(title = "乐观锁")
    private Integer version;
}