package org.dows.eaglee.generate;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.eaglee.generate.TaskSaveRequest;
import org.dows.eaglee.generate.TaskSaveResponse;
import org.dows.eaglee.generate.TaskPageRequest;
import org.dows.eaglee.generate.TaskPageResponse;
import org.dows.eaglee.generate.TaskIdsRequest;
import org.dows.eaglee.generate.TaskIdsResponse;

@RequiredArgsConstructor
@Tag(name = "TaskRest", description = "任务")
@RestController
public class TaskRest{
    @PostMapping("generate/task/save")
    @Schema(title = "增加@taskInstance,taskProject,taskCounter")
    public TaskSaveResponse postSave(@RequestBody TaskSaveRequest taskSaveRequest){
        return null;
    }
    @GetMapping("generate/task/page")
    @Schema(title = "分页")
    public TaskPageResponse getPage( TaskPageRequest taskPageRequest){
        return null;
    }
    @DeleteMapping("generate/task/ids")
    @Schema(title = "删除(物理)")
    public TaskIdsResponse deleteIds(@RequestBody TaskIdsRequest taskIdsRequest){
        return null;
    }
}