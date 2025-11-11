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
@Schema(name = "ProjectSaveResponse 对象",title = "ProjectSaveResponse")
@NoArgsConstructor
public class ProjectSaveResponse{
    @Schema(title = "任务项目ID")
    private Long taskProjectId;

}
