package org.dows.eaglee.dao;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import org.dows.eaglee.entity.TaskProjectEntity;
import org.dows.eaglee.mapper.TaskProjectMapper;

@Component
public class TaskProjectDao extends ServiceImpl<TaskProjectMapper,TaskProjectEntity>{

}