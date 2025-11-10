package org.dows.eaglee.dao;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import org.dows.eaglee.entity.TaskRuntimeEntity;
import org.dows.eaglee.mapper.TaskRuntimeMapper;

@Component
public class TaskRuntimeDao extends ServiceImpl<TaskRuntimeMapper,TaskRuntimeEntity>{

}