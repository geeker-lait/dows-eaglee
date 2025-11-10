package org.dows.eaglee.entity;

import com.mybatisflex.annotation.Table;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Table("task_config")
public class TaskConfigEntity {

    @Schema(title = "任务配置ID")
    private Long taskConfigId;
    @Schema(title = "键名[采集间隔(不能超过60秒且能被60整除），度量单位[分钟,小时,天]，统计IP结合......]")
    private String key;
    @Schema(title = "描述")
    private String deescription;
    @Schema(title = "数据类型")
    private String dataType;
    @Schema(title = "页面标签[input,select,checkbox......]")
    private String tag;
    @Schema(title = "选项")
    private String options;
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