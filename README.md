o o # spring-boot
Spring Boot 在 org.springframework.boot group 下提供了以下应用 starter：

表 13.1、Spring Boot 应用类 Starter
名称 	描述 	POM
spring-boot-starter 	核心 starter，包含自动配置支持、日志和 YAML 	Pom
spring-boot-starter-activemq 	提供 JMS 消息支持，使用 Apache ActiveMQ 	Pom
spring-boot-starter-amqp 	提供 Spring AMQP 与 Rabbit MQ 支持 	Pom
spring-boot-starter-aop 	提供 Spring AOP 与 AspectJ 面向切面编程支持 	Pom
spring-boot-starter-artemis 	提供 JMS 消息服务支持，使用 Apache Artemis 	Pom
spring-boot-starter-batch 	提供 Spring Batch 支持 	Pom
spring-boot-starter-cache 	提供 Spring Framework 缓存支持 	Pom
spring-boot-starter-cloud-connectors 	使用 Spring Cloud Connectors 简单连接到类似 Cloud Foundry 和 Heroku 等云平台 	Pom
spring-boot-starter-data-cassandra 	提供对 Cassandra 分布式数据库和 Spring Data Cassandra 的支持 	Pom
spring-boot-starter-data-cassandra-reactive 	提供对 Cassandra 分布式数据库和 Spring Data Cassandra Reactive 的支持 	Pom
spring-boot-starter-data-couchbase 	提供对 Couchbase 面向文档数据库和 Spring Data Couchbase 的支持 	Pom
spring-boot-starter-data-couchbase-reactive 	提供对 Couchbase 面向文档数据库和 Spring Data Couchbase Reactive 的支持 	Pom
spring-boot-starter-data-elasticsearch 	提供对 Elasticseach 搜索与分析引擎和 Spring Data Elasticsearch 的支持 	Pom
spring-boot-starter-data-jpa 	提供 Spring Data JPA 与 Hibernate 的支持 	Pom
spring-boot-starter-data-ldap 	提供对 Spring Data LDAP 的支持 	Pom
spring-boot-starter-data-mongodb 	提供对 MongoDB 面向文档数据库和 Spring Data MongoDB 的支持 	Pom
spring-boot-starter-data-mongodb-reactive 	提供对 MongoDB 面向文档数据库和 Spring Data MongoDB Reactive 的支持 	Pom
spring-boot-starter-data-neo4j 	提供对 Neo4j 图数据库与 SPring Data Neo4j 的支持 	Pom
spring-boot-starter-data-redis 	提供对 Redis 键值数据存储、Spring Data Redis 和 Lettuce 客户端的支持 	Pom
spring-boot-starter-data-redis-reactive 	提供对 Redis 键值数据存储、Spring Data Redis Reactive 和 Lettuce 客户端的支持 	Pom
spring-boot-starter-data-rest 	提供使用 Spring Data REST 通过 REST 暴露 Spring Data 资源库的支持 	Pom
spring-boot-starter-data-solr 	提供对 Apache Solr 搜索平台与 Spring Data Solr 的支持 	Pom
spring-boot-starter-freemarker 	提供使用 Freemakrer 视图构建 MVC web 应用的支持 	Pom
spring-boot-starter-groovy-templates 	提供使用 Groovy 模板视图构建 MVC web 应用的支持 	Pom
spring-boot-starter-hateoas 	提供使用 Spring MVC 与Spring HATEOAS 构建基于超媒体的 RESTful web 应用的支持 	Pom
spring-boot-starter-integration 	提供对 Spring Integration 的支持 	Pom
spring-boot-starter-jdbc 	提供 JDBC 与 Tomcat JDBC 连接池的支持 	Pom
spring-boot-starter-jersey 	提供对使用 JAX-RS 与 Jersey 构建 RESTful web 应用的支持。spring-boot-starter-web 的替代方案 	Pom
spring-boot-starter-jooq 	提供对使用 JOOQ 访问 SQL 数据库的支持。spring-boot-starter-data-jpa 或 spring-boot-starter-jdbc 的替代方案 	Pom
spring-boot-starter-json 	提供了读写 json 的支持 	Pom
spring-boot-starter-jta-atomikos 	提供 Atomikos JTA 事务支持 	Pom
spring-boot-starter-jta-bitronix 	提供 Bitronix JTA 事务支持 	Pom
spring-boot-starter-jta-narayana 	提供 Narayana JTA 支持 	Pom
spring-boot-starter-mail 	提供使用　Java Mail 与 Spring Framework 的邮件发送支持 	Pom
spring-boot-starter-mustache 	提供使用 Mustache 视图构建 web 应用的支持 	Pom
spring-boot-starter-quartz 	Quartz 支持 	Pom
spring-boot-starter-security 	Spring Security 支持 	Pom
spring-boot-starter-test 	提供包含了 JUnit、Hamcrest 与 Mockito 类库的 Spring Boot 单元测试支持 	Pom
spring-boot-starter-thymeleaf 	提供使用 Thymeleaf 视图构建 MVC web 应用的支持 	pom
spring-boot-starter-validation 	提供 Hibernate Validator 与 Java Bean Validation 的支持 	Pom
spring-boot-starter-web 	提供使用 Spring MVC 构建 web（包含 RESTful）应用的支持，使用 Tomcat 作为默认嵌入式容器 	Pom
spring-boot-starter-web-services 	Spring Web Services 支持 	Pom
spring-boot-starter-webflux 	提供使用 Spring Framework 的 Reactive Web 支持构建 WebFlux 应用的支持 	Pom
spring-boot-starter-websocket 	提供使用 Spring Framework 的 WebSocket 支持构建 WebSocket 应用的支持 	Pom

除了应用 starter，以下 starter 可用于添加生产就绪特性：

表 13.2、Spring Boot 生产类 starter
名称 	描述 	POM
spring-boot-starter-actuator 	Spring Boot 的 Actuator 支持，其提供了生产就绪功能，帮助您监控和管理应用 	Pom

最后，Spring Boot 还包含以下 starter，如果您想要排除或切换特定技术，可以使用以下 starter：

表 13.3、Spring Boot 技术类 starter
名称 	描述 	POM
spring-boot-starter-jetty 	使用 Jetty 作为嵌入式 servlet 容器。可代替 spring-boot-starter-tomcat 	Pom
spring-boot-starter-log4j2 	使用 Log4j2 作为日志组件。可代替 spring-boot-starter-logging 	Pom
spring-boot-starter-logging 	使用 Logback 作为日志组件，此 starter 为默认的日志 starter 	Pom
spring-boot-starter-reactor-netty 	使用 Reactor Netty 作为内嵌响应式 HTTP 服务器 	Pom
spring-boot-starter-tomcat 	使用 Tomcat 作为嵌入式 servlet 容器，此为 spring-boot-starter-web 默认的 servlet 容器 starter 	Pom
spring-boot-starter-undertow 	使用 Undertow 作为嵌入式 servlet 容器，可代替 spring-boot-starter-tomcat 	Pom
