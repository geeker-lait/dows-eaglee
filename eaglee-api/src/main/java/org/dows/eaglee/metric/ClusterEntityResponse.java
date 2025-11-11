package org.dows.eaglee.metric;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.*;
import java.math.BigDecimal;


@Data
@Schema(name = "ClusterEntityResponse 对象",title = "ClusterEntityResponse")
@NoArgsConstructor
public class ClusterEntityResponse{
    @Schema(title = "度量ID")
    private Bigint taskMetricId;
    @Schema(title = "节点IP地址")
    private Varchar ip;
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

}
