package org.dows.eaglee.dao;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import org.dows.eaglee.entity.TaskConfigEntity;
import org.dows.eaglee.mapper.TaskConfigMapper;

@Component
public class TaskConfigDao extends ServiceImpl<TaskConfigMapper,TaskConfigEntity>{

}