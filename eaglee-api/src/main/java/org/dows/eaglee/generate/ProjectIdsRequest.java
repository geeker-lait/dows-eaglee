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
@Schema(name = "ProjectIdsRequest 对象",title = "ProjectIdsRequest")
@NoArgsConstructor
public class ProjectIdsRequest{
    @Schema(title = "任务项目ID，多个ID用逗号分割")
    private Varchar taskProjectIds;

}
