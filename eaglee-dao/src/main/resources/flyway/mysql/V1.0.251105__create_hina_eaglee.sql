-- 若库不存在创建一个
CREATE DATABASE IF NOT EXISTS `hina_eaglee`;
USE `hina_eaglee`;

drop table if exists `task_define`;
CREATE TABLE IF NOT EXISTS `task_define`(
    `task_define_id` bigint(19) DEFAULT NULL COMMENT '任务定义ID',
    `project_idenfifier` varchar(64) DEFAULT NULL COMMENT '项目标识',
    `task_identifier` varchar(64) DEFAULT NULL COMMENT '任务标识(表明同一类任务的标识)',
    PRIMARY KEY (`task_define_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `task_project`;
CREATE TABLE IF NOT EXISTS `task_project`(
    `task_project_id` bigint(19) DEFAULT NULL COMMENT '任务项目ID',
    `project_name` varchar(64) DEFAULT NULL COMMENT '项目名(业务系统中定义的名称)',
    `process_code` varchar(64) DEFAULT NULL COMMENT 'DS中流程编码',
    `project_idenfifier` varchar(64) DEFAULT NULL COMMENT '项目标识',
    `task_count` integer(11) DEFAULT NULL COMMENT '任务数(ds中或原始业务系统获取)',
    `state` integer(11) DEFAULT NULL COMMENT '状态[0:为完成，1:已完成]',
    `start_time` datetime DEFAULT NULL COMMENT '开始时间',
    `end_time` datetime DEFAULT NULL COMMENT '结束时间',
    `deleted` tinyint(4) DEFAULT NULL COMMENT '删除',
    `version` integer(11) DEFAULT NULL COMMENT '乐观锁',
    PRIMARY KEY (`task_project_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `task_instance`;
CREATE TABLE IF NOT EXISTS `task_instance`(
    `task_instance_id` bigint(19) DEFAULT NULL COMMENT '任务实例ID',
    `task_project_id` bigint(19) DEFAULT NULL COMMENT '任务项目ID',
    `task_name` varchar(64) DEFAULT NULL COMMENT '任务名(ds中的任务编码)',
    `task_identifier` varchar(64) DEFAULT NULL COMMENT '任务标识(表明同一类任务的标识)',
    `application_id` varchar(64) DEFAULT NULL COMMENT '应用ID',
    `process_name` varchar(64) DEFAULT NULL COMMENT '流程实例名称',
    `reason` varchar(64) DEFAULT NULL COMMENT '原因',
    `elapsed_time` bigint(19) DEFAULT NULL COMMENT '当前耗时',
    `avg_time` bigint(19) DEFAULT NULL COMMENT '平均耗时',
    PRIMARY KEY (`task_instance_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `task_counter`;
CREATE TABLE IF NOT EXISTS `task_counter`(
    `task_counter_id` bigint(19) DEFAULT NULL COMMENT '任务计数器ID',
    `project_idenfifier` varchar(64) DEFAULT NULL COMMENT '项目标识',
    `task_identifier` varchar(64) DEFAULT NULL COMMENT '任务标识',
    `expend_total` bigint(19) DEFAULT NULL COMMENT '总耗时',
    `task_count` bigint(19) DEFAULT NULL COMMENT '任务实例数量',
    `deleted` tinyint(4) DEFAULT NULL COMMENT '删除',
    `version` integer(11) DEFAULT NULL COMMENT '乐观锁',
    PRIMARY KEY (`task_counter_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `task_runtime`;
CREATE TABLE IF NOT EXISTS `task_runtime`(
    `task_runtime_id` bigint(19) DEFAULT NULL COMMENT '任务运行时ID',
    `ip` varchar(64) DEFAULT NULL COMMENT '节点IP地址',
    `cpu_usage` integer(11) DEFAULT NULL COMMENT 'cpu用量',
    `mem_usage` integer(11) DEFAULT NULL COMMENT 'mem用量',
    `disk_usage` integer(11) DEFAULT NULL COMMENT '磁盘用量',
    `net_usage` integer(11) DEFAULT NULL COMMENT '网络用量',
    `host_time` datetime DEFAULT NULL COMMENT '主机时间',
    `ct` datetime DEFAULT NULL COMMENT '创建时间',
    `deleted` tinyint(4) DEFAULT NULL COMMENT '删除',
    `version` integer(11) DEFAULT NULL COMMENT '乐观锁',
    PRIMARY KEY (`task_runtime_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `task_metric`;
CREATE TABLE IF NOT EXISTS `task_metric`(
    `task_metric_id` bigint(19) DEFAULT NULL COMMENT '任务度量ID',
    `ip` varchar(64) DEFAULT NULL COMMENT '节点IP地址',
    `time_unit` integer(11) DEFAULT NULL COMMENT '时间单位(分钟，小时，天)',
    `cpu_total_usage` integer(11) DEFAULT NULL COMMENT 'cpu使用总量',
    `mem_total_usage` integer(11) DEFAULT NULL COMMENT 'mem使用总量',
    `disk_total_usage` integer(11) DEFAULT NULL COMMENT 'disk使用总量',
    `net_total_usage` integer(11) DEFAULT NULL COMMENT 'net使用总量',
    `deleted` tinyint(4) DEFAULT NULL COMMENT '删除',
    `version` integer(11) DEFAULT NULL COMMENT '乐观锁',
    PRIMARY KEY (`task_metric_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `task_config`;
CREATE TABLE IF NOT EXISTS `task_config`(
    `task_config_id` bigint(19) DEFAULT NULL COMMENT '任务配置ID',
    `key` varchar(64) DEFAULT NULL COMMENT '键名[采集间隔(不能超过60秒且能被60整除），度量单位[分钟,小时,天]，统计IP结合......]',
    `deescription` varchar(64) DEFAULT NULL COMMENT '描述',
    `data_type` varchar(64) DEFAULT NULL COMMENT '数据类型',
    `tag` varchar(64) DEFAULT NULL COMMENT '页面标签[input,select,checkbox......]',
    `options` varchar(64) DEFAULT NULL COMMENT '选项',
    `ct` datetime DEFAULT NULL COMMENT '创建时间',
    `ut` datetime DEFAULT NULL COMMENT '更新时间',
    `cid` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `uid` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    `deleted` tinyint(4) DEFAULT NULL COMMENT '删除',
    `version` integer(11) DEFAULT NULL COMMENT '乐观锁',
    PRIMARY KEY (`task_config_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `task_rule`;
CREATE TABLE IF NOT EXISTS `task_rule`(
    `task_rule_id` bigint(19) DEFAULT NULL COMMENT '任务规则ID',
    `rule_name` varchar(64) DEFAULT NULL COMMENT '规则名',
    `config_json` varchar(64) DEFAULT NULL COMMENT 'json配置',
    `reference_type` integer(11) DEFAULT NULL COMMENT '应用类型(0:项目,1:任务)',
    `reference_id` bigint(19) DEFAULT NULL COMMENT '引用ID(项目或任务)',
    `ct` datetime DEFAULT NULL COMMENT '创建时间',
    `ut` datetime DEFAULT NULL COMMENT '更新时间',
    `cid` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `uid` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    `deleted` tinyint(4) DEFAULT NULL COMMENT '删除',
    `version` integer(11) DEFAULT NULL COMMENT '乐观锁',
    PRIMARY KEY (`task_rule_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `task_setting`;
CREATE TABLE IF NOT EXISTS `task_setting`(
    `task_setting_id` bigint(19) DEFAULT NULL COMMENT '任务设置ID',
    `task_rule_id` bigint(19) DEFAULT NULL COMMENT '任务规则ID',
    `workflow_idenfifier` varchar(64) DEFAULT NULL COMMENT '项目标识',
    `task_identifier` varchar(64) DEFAULT NULL COMMENT '任务标识(表明同一类任务的标识)',
    `code_identifier` varchar(64) DEFAULT NULL COMMENT 'code标识码（项目+任务标识projectIdentifierId_taskIdentifierId）',
    `ct` datetime DEFAULT NULL COMMENT '创建时间',
    `ut` datetime DEFAULT NULL COMMENT '更新时间',
    `cid` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `uid` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    `deleted` tinyint(4) DEFAULT NULL COMMENT '删除',
    `version` integer(11) DEFAULT NULL COMMENT '乐观锁',
    PRIMARY KEY (`task_setting_id`)
) ENGINE=InnoDB COMMENT='';


