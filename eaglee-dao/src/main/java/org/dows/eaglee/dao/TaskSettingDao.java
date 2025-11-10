package org.dows.eaglee.dao;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import org.dows.eaglee.entity.TaskSettingEntity;
import org.dows.eaglee.mapper.TaskSettingMapper;

@Component
public class TaskSettingDao extends ServiceImpl<TaskSettingMapper,TaskSettingEntity>{

}