package org.dows.eaglee.dao;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import org.dows.eaglee.entity.TaskCounterEntity;
import org.dows.eaglee.mapper.TaskCounterMapper;

@Component
public class TaskCounterDao extends ServiceImpl<TaskCounterMapper,TaskCounterEntity>{

}