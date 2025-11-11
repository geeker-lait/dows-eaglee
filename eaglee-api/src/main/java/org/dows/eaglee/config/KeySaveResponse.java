package org.dows.eaglee.config;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.*;
import java.math.BigDecimal;


@Data
@Schema(name = "KeySaveResponse 对象",title = "KeySaveResponse")
@NoArgsConstructor
public class KeySaveResponse{
    @Schema(title = "任务配置ID")
    private Long taskConfigId;

}
