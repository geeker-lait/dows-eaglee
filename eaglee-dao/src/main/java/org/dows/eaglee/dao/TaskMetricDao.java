package org.dows.eaglee.dao;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import org.dows.eaglee.entity.TaskMetricEntity;
import org.dows.eaglee.mapper.TaskMetricMapper;

@Component
public class TaskMetricDao extends ServiceImpl<TaskMetricMapper,TaskMetricEntity>{

}