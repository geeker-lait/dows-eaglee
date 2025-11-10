package org.dows.eaglee.config;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.eaglee.config.RuleSaveRequest;
import org.dows.eaglee.config.RuleSaveResponse;
import org.dows.eaglee.config.RulePageRequest;
import org.dows.eaglee.config.RulePageResponse;
import org.dows.eaglee.config.RuleDeleteRequest;
import org.dows.eaglee.config.RuleDeleteResponse;
import org.dows.eaglee.config.RuleRemoveRequest;
import org.dows.eaglee.config.RuleRemoveResponse;

@RequiredArgsConstructor
@Tag(name = "RuleRest", description = "规则")
@RestController
public class RuleRest{
    @PostMapping("config/rule/save")
    @Schema(title = "增加@taskRule,taskProject,taskInstance")
    public RuleSaveResponse postSave(@RequestBody RuleSaveRequest ruleSaveRequest){
        return null;
    }
    @GetMapping("config/rule/page")
    @Schema(title = "分页")
    public RulePageResponse getPage( RulePageRequest rulePageRequest){
        return null;
    }
    @DeleteMapping("config/rule/delete")
    @Schema(title = "删除(物理)")
    public RuleDeleteResponse deleteDelete(@RequestBody RuleDeleteRequest ruleDeleteRequest){
        return null;
    }
    @PutMapping("config/rule/remove")
    @Schema(title = "删除（逻辑）")
    public RuleRemoveResponse putRemove(@RequestBody RuleRemoveRequest ruleRemoveRequest){
        return null;
    }
}