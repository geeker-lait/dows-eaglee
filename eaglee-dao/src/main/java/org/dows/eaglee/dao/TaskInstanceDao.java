package org.dows.eaglee.dao;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import org.dows.eaglee.entity.TaskInstanceEntity;
import org.dows.eaglee.mapper.TaskInstanceMapper;

@Component
public class TaskInstanceDao extends ServiceImpl<TaskInstanceMapper,TaskInstanceEntity>{

}