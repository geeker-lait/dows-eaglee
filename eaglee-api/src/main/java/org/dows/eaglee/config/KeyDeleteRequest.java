package org.dows.eaglee.config;

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
@Schema(name = "KeyDeleteRequest 对象",title = "KeyDeleteRequest")
@NoArgsConstructor
public class KeyDeleteRequest{
    @Schema(title = "任务配置ID")
    private Long taskConfigId;

}
