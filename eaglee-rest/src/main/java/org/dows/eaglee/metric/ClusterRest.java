package org.dows.eaglee.metric;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.eaglee.metric.ClusterEntityRequest;
import org.dows.eaglee.metric.ClusterEntityResponse;
import org.dows.eaglee.metric.ClusterEntityRequest;
import org.dows.eaglee.metric.ClusterEntityResponse;
import org.dows.eaglee.metric.ClusterAnalysisRequest;
import org.dows.eaglee.metric.ClusterAnalysisResponse;

@RequiredArgsConstructor
@Tag(name = "ClusterRest", description = "集群")
@RestController
public class ClusterRest{
    @PostMapping("metric/cluster/entity")
    @Schema(title = "增加@taskMetric")
    public ClusterEntityResponse postEntity(@RequestBody ClusterEntityRequest clusterEntityRequest){
        return null;
    }
    @GetMapping("metric/cluster/entity")
    @Schema(title = "获取实体")
    public ClusterEntityResponse getEntity( ClusterEntityRequest clusterEntityRequest){
        return null;
    }
    @GetMapping("metric/cluster/analysis")
    @Schema(title = "分析")
    public ClusterAnalysisResponse getAnalysis( ClusterAnalysisRequest clusterAnalysisRequest){
        return null;
    }
}