package org.dows.eaglee.entity;

import com.mybatisflex.annotation.Table;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Table("task_metric")
public class TaskMetricEntity {

    @Schema(title = "任务度量ID")
    private Long taskMetricId;
    @Schema(title = "节点IP地址")
    private String ip;
    @Schema(title = "时间单位(分钟，小时，天)")
    private Integer timeUnit;
    @Schema(title = "cpu使用总量")
    private Integer cpuTotalUsage;
    @Schema(title = "mem使用总量")
    private Integer memTotalUsage;
    @Schema(title = "disk使用总量")
    private Integer diskTotalUsage;
    @Schema(title = "net使用总量")
    private Integer netTotalUsage;
    @Schema(title = "删除")
    private Boolean deleted;
    @Schema(title = "乐观锁")
    private Integer version;
}