package org.dows.eaglee.collect;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.*;
import java.math.BigDecimal;


@Data
@Schema(name = "RuntimeSaveResponse 对象",title = "RuntimeSaveResponse")
@NoArgsConstructor
public class RuntimeSaveResponse{
    @Schema(title = "运行时ID")
    private Long taskRuntimeId;

}
