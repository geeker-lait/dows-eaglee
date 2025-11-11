package org.dows.eaglee.generate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.*;
import java.math.BigDecimal;


@Data
@Schema(name = "ProjectPageRequest 对象",title = "ProjectPageRequest")
@NoArgsConstructor
public class ProjectPageRequest{
    @Schema(title = "项目名(业务系统中定义的名称)")
    private Varchar projectName;
    @Schema(title = "DS中流程编码")
    private Varchar processCode;
    @Schema(title = "项目标识")
    private Varchar projectIdenfifier;
    @Schema(title = "状态[0:为完成，1:已完成]")
    private Integer state;
    @Schema(title = "开始时间，以节点上实际开始和结束时间为准，需要监听结束时间，反向更新")
    private Datetime startTime;
    @Schema(title = "结束时间，以节点上实际开始和结束时间为准，需要监听结束时间，反向更新")
    private Datetime endTime;

}
