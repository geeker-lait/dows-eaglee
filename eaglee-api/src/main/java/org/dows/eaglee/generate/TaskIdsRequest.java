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
@Schema(name = "TaskIdsRequest 对象",title = "TaskIdsRequest")
@NoArgsConstructor
public class TaskIdsRequest{
    @Schema(title = "任务实例ID，多个ID用逗号分割")
    private String taskInstanceIds;

}
