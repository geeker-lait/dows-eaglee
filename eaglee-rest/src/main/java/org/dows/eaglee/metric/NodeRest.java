package org.dows.eaglee.metric;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.eaglee.metric.NodeSaveRequest;
import org.dows.eaglee.metric.NodeSaveResponse;
import org.dows.eaglee.metric.NodePageRequest;
import org.dows.eaglee.metric.NodePageResponse;

@RequiredArgsConstructor
@Tag(name = "NodeRest", description = "节点")
@RestController
public class NodeRest{
    @PostMapping("metric/node/save")
    @Schema(title = "增加@taskRuntime")
    public NodeSaveResponse postSave(@RequestBody NodeSaveRequest nodeSaveRequest){
        return null;
    }
    @GetMapping("metric/node/page")
    @Schema(title = "分页")
    public NodePageResponse getPage( NodePageRequest nodePageRequest){
        return null;
    }
}