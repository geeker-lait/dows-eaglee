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
@Schema(name = "KeyPageRequest 对象",title = "KeyPageRequest")
@NoArgsConstructor
public class KeyPageRequest{
    @Schema(title = "键名[采集间隔(不能超过60秒且能被60整除），度量单位[分钟,小时,天]，统计IP结合......]")
    private String key;

}
