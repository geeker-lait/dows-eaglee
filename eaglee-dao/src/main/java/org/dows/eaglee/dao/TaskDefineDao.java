package org.dows.eaglee.dao;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import org.dows.eaglee.entity.TaskDefineEntity;
import org.dows.eaglee.mapper.TaskDefineMapper;

@Component
public class TaskDefineDao extends ServiceImpl<TaskDefineMapper,TaskDefineEntity>{

}