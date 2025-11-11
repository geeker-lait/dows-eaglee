package org.dows.eaglee.metric;

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
@Schema(name = "NodeSaveResponse 对象",title = "NodeSaveResponse")
@NoArgsConstructor
public class NodeSaveResponse{
    @Schema(title = "运行时ID")
    private Long taskRuntimeId;

}
