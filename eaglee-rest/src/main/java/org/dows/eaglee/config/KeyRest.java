package org.dows.eaglee.config;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.eaglee.config.KeySaveRequest;
import org.dows.eaglee.config.KeySaveResponse;
import org.dows.eaglee.config.KeyPageRequest;
import org.dows.eaglee.config.KeyPageResponse;
import org.dows.eaglee.config.KeyDeleteRequest;
import org.dows.eaglee.config.KeyDeleteResponse;
import org.dows.eaglee.config.KeyRemoveRequest;
import org.dows.eaglee.config.KeyRemoveResponse;

@RequiredArgsConstructor
@Tag(name = "KeyRest", description = "键名")
@RestController
public class KeyRest{
    @PostMapping("config/key/save")
    @Schema(title = "增加@taskConfig")
    public KeySaveResponse postSave(@RequestBody KeySaveRequest keySaveRequest){
        return null;
    }
    @GetMapping("config/key/page")
    @Schema(title = "分页@taskConfig")
    public KeyPageResponse getPage( KeyPageRequest keyPageRequest){
        return null;
    }
    @DeleteMapping("config/key/delete")
    @Schema(title = "删除(物理)@taskConfig")
    public KeyDeleteResponse deleteDelete(@RequestBody KeyDeleteRequest keyDeleteRequest){
        return null;
    }
    @PutMapping("config/key/remove")
    @Schema(title = "删除（逻辑）@taskConfig")
    public KeyRemoveResponse putRemove(@RequestBody KeyRemoveRequest keyRemoveRequest){
        return null;
    }
}