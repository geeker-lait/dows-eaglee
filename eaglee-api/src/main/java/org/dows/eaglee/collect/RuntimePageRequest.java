package org.dows.eaglee.collect;

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
@Schema(name = "RuntimePageRequest 对象",title = "RuntimePageRequest")
@NoArgsConstructor
public class RuntimePageRequest{
    @Schema(title = "节点IP地址")
    private String ip;

}
