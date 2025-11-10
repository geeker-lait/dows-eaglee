package org.dows.eaglee.entity;

import com.mybatisflex.annotation.Table;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Table("task_rule")
public class TaskRuleEntity {

    @Schema(title = "任务规则ID")
    private Long taskRuleId;
    @Schema(title = "规则名")
    private String ruleName;
    @Schema(title = "json配置")
    private String configJson;
    @Schema(title = "应用类型(0:项目,1:任务)")
    private Integer referenceType;
    @Schema(title = "引用ID(项目或任务)")
    private Long referenceId;
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