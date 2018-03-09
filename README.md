# Spring Cloud Docker

Spring Cloud 完整的架构项目。

# 环境

* Spring Boot 1.5.9.RELEASE
* IntelliJ IDEA 2017.2

# 应用架构

该项目包含 8 个服务

|启动顺序|服务名|服务说明|服务端口
|---|---|---|---
|1| sc-registry | 服务注册与发现 | 8881
|2| sc-config | 外部配置 | 8882
|3| sc-monitor | 服务监控 | 8883
|4| sc-zipkin | 分布式跟踪 | 8884
|5| sc-gateway | 代理所有微服务的接口网关 | 8081 
|6| sc-auth | OAuth2 认证服务 | 8082
|7| sc-servicea | 业务服务A | 8083
|8| sc-serviceb | 业务服务B | 8084


# 启动项目

有两种启动方式，任意一种即可：

* 使用 Docker 快速启动
    1. 配置 Docker 环境
    2. `mvn clean package` 打包项目及 Docker 镜像
    3. 在项目根目录下执行 `docker-compose up -d` 启动所有项目
* 本地手动启动
    1. 配置 rabbitmq
    2. 启动 sc-registry、sc-config、sc-monitor、sc-zipkin
    3. 启动 sc-gateway、sc-auth、sc-servicea、sc-serviceb
    
# 项目预览

## RabbitMQ 监控

访问 http://localhost:15672/ 

* 默认账号： guest
* 密码： guest

## 服务注册中心

访问 http://localhost:8881/ 

* 默认账号： admin
* 密码： admin

## 服务监控

访问 http://localhost:8883/ 

* 默认账号： admin
* 密码： admin

## 服务链路跟踪

访问 http://localhost:8884/ 

* 默认账号： admin
* 密码： admin

