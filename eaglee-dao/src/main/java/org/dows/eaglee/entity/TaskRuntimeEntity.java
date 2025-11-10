package org.dows.eaglee.entity;

import com.mybatisflex.annotation.Table;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Table("task_runtime")
public class TaskRuntimeEntity {

    @Schema(title = "任务运行时ID")
    private Long taskRuntimeId;
    @Schema(title = "节点IP地址")
    private String ip;
    @Schema(title = "cpu用量")
    private Integer cpuUsage;
    @Schema(title = "mem用量")
    private Integer memUsage;
    @Schema(title = "磁盘用量")
    private Integer diskUsage;
    @Schema(title = "网络用量")
    private Integer netUsage;
    @Schema(title = "主机时间")
    private LocalDateTime hostTime;
    @Schema(title = "创建时间")
    private LocalDateTime ct;
    @Schema(title = "删除")
    private Boolean deleted;
    @Schema(title = "乐观锁")
    private Integer version;
}