### springboot-property  2017-6-1
##### Springboot 获取配置文件的几种方式
	
- 使用`@ConfigurationProperties`注解将配置文件属性注入到配置对象类中
- 使用`@Value("${propertyName}")`注解
- 使用`Environment`
- 通过注册监听器(`Listeners`) + `PropertiesLoaderUtils`的方式

针对上面的这四种方式，博主推荐的程度右上往下依次递减


