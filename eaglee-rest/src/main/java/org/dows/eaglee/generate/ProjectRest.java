package org.dows.eaglee.generate;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.eaglee.generate.ProjectSaveRequest;
import org.dows.eaglee.generate.ProjectSaveResponse;
import org.dows.eaglee.generate.ProjectPageRequest;
import org.dows.eaglee.generate.ProjectPageResponse;
import org.dows.eaglee.generate.ProjectIdsRequest;
import org.dows.eaglee.generate.ProjectIdsResponse;
import org.dows.eaglee.generate.ProjectIdsRequest;
import org.dows.eaglee.generate.ProjectIdsResponse;
import org.dows.eaglee.generate.ProjectTermRequest;
import org.dows.eaglee.generate.ProjectTermResponse;

@RequiredArgsConstructor
@Tag(name = "ProjectRest", description = "项目")
@RestController
public class ProjectRest{
    @PostMapping("generate/project/save")
    @Schema(title = "增加@taskProject")
    public ProjectSaveResponse postSave(@RequestBody ProjectSaveRequest projectSaveRequest){
        return null;
    }
    @GetMapping("generate/project/page")
    @Schema(title = "分页")
    public ProjectPageResponse getPage( ProjectPageRequest projectPageRequest){
        return null;
    }
    @DeleteMapping("generate/project/ids")
    @Schema(title = "删除(物理)")
    public ProjectIdsResponse deleteIds(@RequestBody ProjectIdsRequest projectIdsRequest){
        return null;
    }
    @PutMapping("generate/project/ids")
    @Schema(title = "删除(逻辑)")
    public ProjectIdsResponse putIds(@RequestBody ProjectIdsRequest projectIdsRequest){
        return null;
    }
    @DeleteMapping("generate/project/term")
    @Schema(title = "删除(条件项)")
    public ProjectTermResponse deleteTerm(@RequestBody ProjectTermRequest projectTermRequest){
        return null;
    }
}