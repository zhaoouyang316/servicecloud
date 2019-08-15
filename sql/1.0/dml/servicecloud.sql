
-- 创建部门表

CREATE TABLE `t_dept` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dname` varchar(45) DEFAULT NULL COMMENT '部门名称',
  `db_source` varchar(100) DEFAULT NULL COMMENT '数据库来源',
  `remark` varchar(200) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
);


-- 创建用户表

CREATE TABLE `t_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号',
  `salt` varchar(45) DEFAULT NULL COMMENT '密码盐',
  `password` varchar(45) DEFAULT NULL COMMENT '密码',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `remark` varchar(200) DEFAULT NULL ,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
);