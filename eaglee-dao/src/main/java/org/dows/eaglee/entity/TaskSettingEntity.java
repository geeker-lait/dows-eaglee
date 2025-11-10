package org.dows.eaglee.entity;

import com.mybatisflex.annotation.Table;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Table("task_setting")
public class TaskSettingEntity {

    @Schema(title = "任务设置ID")
    private Long taskSettingId;
    @Schema(title = "任务规则ID")
    private Long taskRuleId;
    @Schema(title = "项目标识")
    private String workflowIdenfifier;
    @Schema(title = "任务标识(表明同一类任务的标识)")
    private String taskIdentifier;
    @Schema(title = "code标识码（项目+任务标识projectIdentifierId_taskIdentifierId）")
    private String codeIdentifier;
    @Schema(title = "创建时间")
    private LocalDateTime ct;
    @Schema(title = "更新时间")
    private LocalDateTime ut;
    @Schema(title = "创建者ID")
    private Long cid;
    @Schema(title = "更新者ID")
    private Long uid;
    @Schema(title = "删除")
    private Boolean deleted;
    @Schema(title = "乐观锁")
    private Integer version;
}