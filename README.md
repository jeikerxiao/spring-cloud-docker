# Spring Cloud Docker



# 应用架构

该项目包含 8 个服务

* sc-registry - 服务注册与发现
* sc-config - 外部配置
* sc-monitor - 监控
* sc-zipkin - 分布式跟踪
* sc-gateway - 代理所有微服务的接口网关
* sc-auth - OAuth2 认证服务
* sc-servicea - 业务服务A
* sc-serviceb - 业务服务B


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

启动访问 http://localhost:15672/ 

* 默认账号 guest
* 密码 guest

## 服务注册中心

访问 http://localhost:8881/ 

* 默认账号 user
* 密码 password

## 服务监控

访问 http://localhost:8883/ 

* 默认账号 admin
* 密码 admin

## 服务链路跟踪

访问 http://localhost:8884/ 

* 默认账号 admin
* 密码 admin