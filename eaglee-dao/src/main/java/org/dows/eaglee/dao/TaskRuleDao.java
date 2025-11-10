package org.dows.eaglee.dao;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import org.dows.eaglee.entity.TaskRuleEntity;
import org.dows.eaglee.mapper.TaskRuleMapper;

@Component
public class TaskRuleDao extends ServiceImpl<TaskRuleMapper,TaskRuleEntity>{

}