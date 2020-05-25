package com.baobaotao.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.baobaotao.Car;

public class BeanLifeCycle {

    private static void LifeCycleInBeanFactory() {
        // ①装载配置文件并启动容器
        Resource res = new ClassPathResource("com/baobaotao/beanfactory/beans.xml");
        BeanFactory bf = new XmlBeanFactory(res);
        // ②向容器中注册MyBeanPostProcessor后处理器
        (new MyBeanFactoryPostProcessor()).postProcessBeanFactory((XmlBeanFactory) bf);
        // ③向容器中注册MyInstantiationAwareBeanPostProcessor后处理器
        ((ConfigurableBeanFactory) bf).addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());
        // BeanPostProcessor
        ((ConfigurableBeanFactory) bf).addBeanPostProcessor(new MyBeanPostProcessor());
        
        // ④第一从容器获取car出房容器实例化该Bean，引发bean生命周期方法的调用
        Car car1 = (Car) bf.getBean("car");
        car1.introduce();
        car1.setColor("红色");
        
        // ⑤第二次从容器中获取car，直接从缓存池中获取
        Car car2 = bf.getBean("car", Car.class);
        // car2.introduce();
        // ⑦关闭容器
        ((XmlBeanFactory) bf).destroySingletons();
    }

    public static void main(String[] args) {
        LifeCycleInBeanFactory();
    }
}
