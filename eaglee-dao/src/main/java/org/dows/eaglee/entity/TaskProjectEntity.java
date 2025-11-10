package org.dows.eaglee.entity;

import com.mybatisflex.annotation.Table;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Table("task_project")
public class TaskProjectEntity {

    @Schema(title = "任务项目ID")
    private Long taskProjectId;
    @Schema(title = "项目名(业务系统中定义的名称)")
    private String projectName;
    @Schema(title = "DS中流程编码")
    private String processCode;
    @Schema(title = "项目标识")
    private String projectIdenfifier;
    @Schema(title = "任务数(ds中或原始业务系统获取)")
    private Integer taskCount;
    @Schema(title = "状态[0:为完成，1:已完成]")
    private Integer state;
    @Schema(title = "开始时间")
    private LocalDateTime startTime;
    @Schema(title = "结束时间")
    private LocalDateTime endTime;
    @Schema(title = "删除")
    private Boolean deleted;
    @Schema(title = "乐观锁")
    private Integer version;
}