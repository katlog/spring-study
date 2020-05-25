#概述
Spring 2.5引入了基于注解的组件扫描
##spring 3
- 核心API更新到java5.0  ：加入泛型
- Spring 3.0引入了基于Java的配置@Config
- spring 表达式语言  spel
- Spring 3.1开始支持基于Profile的配置
## spring 4
Spring 4.0 条件化配置
Spring 4.2里，可选择基于规则的SpringClassRule 和SpringMethodRule 来代替SpringJUnit4ClassRunner 
## spring boot 1.0
## spring boot 2.0
### actuator
Spring Boot 2.0 中的端点和之前的版本有较大不同，启用了不代表可以直接访问，还需要将其暴露出来。
默认只开放了info、health两个端点，剩余的需要自己通过配置management.endpoints.web.exposure.include属性来加载（有include自然就有exclude）。如果想单独操作某个端点可以使用management.endpoint.端点.enabled属性进行启用或禁用

## spring cloud