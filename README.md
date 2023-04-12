# firefly

# 核心依赖
# 依赖	                         版本
# Spring Boot	                 2.7.10
# Spring Cloud	                 2021.0.6
# Spring Cloud Alibaba	         2021.0.5.0
# Spring Authorization Server	 0.4.1
# Mybatis Plus	                 3.5.3.1
# hutool	                     5.8.15


# MySQL	5.7.8 +	强制要求
# Redis	3.2 +
# node	8.0 +
# npm	6.0 +
# IDEA	2019+


firefly
├── firefly-ui -- 前端工程[8080]
├── firefly-auth -- 授权服务提供[3000]
├── firefly-common -- 系统公共模块
├    ├── firefly-common-bom -- 公共依赖版本
├    ├── firefly-common-core -- 公共工具类核心包
├    ├── firefly-common-datasource -- 动态数据源相关
├    ├── firefly-common-feign -- feign 通用封装
├    ├── firefly-common-gateway -- 动态路由定义
├    ├── firefly-common-job -- 定时任务
├    ├── firefly-common-log -- 日志服务
├    ├── firefly-common-oss -- 通用文件系统
├    ├──firefly-common-security -- 安全工具类
├    ├── firefly-common-sentinel -- sentinel分装
├    ├── firefly-common-swagger -- Swagger Api文档生成
├    ├── firefly-common-transaction -- 分布式事务工具包
├── firefly-register -- 注册中心、配置中心[8848]
├── firefly-gateway -- Spring Cloud Gateway网关[9999]
├── firefly-umps -- 通用用户权限管理模块
├    └── firefly-umps-api -- 通用用户权限管理系统公共api模块
├    └── firefly-umps-biz -- 通用用户权限管理系统业务处理模块[4000]
└── firefly-visual  -- 图形化模块
├    ├── firefly-monitor -- Spring Boot Admin监控 [5001]
├    └── firefly-code-codegen -- 图形化代码生成[5003]
├    └── pig-xxl-job-admin -- 分布式定时任务管理台 [5004]
├    └── firefly-sentinel-dashboard -- sentinel 控制台[5005]