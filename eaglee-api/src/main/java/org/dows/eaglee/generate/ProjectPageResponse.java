package org.dows.eaglee.generate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.*;
import java.math.BigDecimal;


@Data
@Schema(name = "ProjectPageResponse 对象",title = "ProjectPageResponse")
@NoArgsConstructor
public class ProjectPageResponse{
    @Schema(title = "任务项目ID")
    private Long taskProjectId;
    @Schema(title = "项目名(业务系统中定义的名称)")
    private String projectName;
    @Schema(title = "DS中流程编码")
    private String processCode;
    @Schema(title = "项目标识")
    private String projectIdenfifier;
    @Schema(title = "状态[0:为完成，1:已完成]")
    private Integer state;
    @Schema(title = "开始时间，以节点上实际开始和结束时间为准，需要监听结束时间，反向更新")
    private LocalDateTime startTime;
    @Schema(title = "结束时间，以节点上实际开始和结束时间为准，需要监听结束时间，反向更新")
    private LocalDateTime endTime;

}
