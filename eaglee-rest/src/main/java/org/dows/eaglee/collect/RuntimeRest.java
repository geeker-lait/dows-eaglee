package org.dows.eaglee.collect;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.eaglee.collect.TestRequest;
import org.dows.eaglee.collect.RuntimeSaveResponse;
import org.dows.eaglee.collect.RuntimePageRequest;
import org.dows.eaglee.collect.RuntimePageResponse;

@RequiredArgsConstructor
@Tag(name = "RuntimeRest", description = "运行时数据")
@RestController
public class RuntimeRest{
    @PostMapping("collect/runtime/save")
    @Schema(title = "增加@taskRuntime，读取taskRule，获取统计间隔从IP节点拉取数据，并保存")
    public RuntimeSaveResponse postSave(@RequestBody TestRequest testRequest){
        return null;
    }
    @GetMapping("collect/runtime/page")
    @Schema(title = "分页")
    public RuntimePageResponse getPage( RuntimePageRequest runtimePageRequest){
        return null;
    }
}