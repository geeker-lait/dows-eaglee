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
@Schema(name = "NodeSaveRequest 对象",title = "NodeSaveRequest")
@NoArgsConstructor
public class NodeSaveRequest{
    @Schema(title = "节点IP地址")
    private Varchar ip;
    @Schema(title = "cpu用量")
    private Integer cpuUsage;
    @Schema(title = "mem用量")
    private Integer memUsage;
    @Schema(title = "磁盘用量")
    private Integer diskUsage;
    @Schema(title = "网络用量")
    private Integer netUsage;

}
