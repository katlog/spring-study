# Springboot 实现拦截器 2018-9-30

#### 实现自定义拦截器只需要3步： 

1、创建我们自己的拦截器类并实现 HandlerInterceptor 接口。 

2、创建一个Java类继承WebMvcConfigurerAdapter，并重写 addInterceptors 方法。 

2、实例化我们自定义的拦截器，然后将对像手动添加到拦截器链中（在addInterceptors方法中添加）。


