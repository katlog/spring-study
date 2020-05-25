package com.baobaotao;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
// ①管理Bean生命周期的接口
public class Car implements BeanFactoryAware, BeanNameAware, InitializingBean,
		DisposableBean {
	private String brand;
	private String color;
	private int maxSpeed;
	private String name;
	private BeanFactory beanFactory;
	private String beanName;

	public Car() {//第2步
		System.out.println("第2步：调用Car()构造函数。");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {//第5步
		System.out.println("第5步：调用setBrand()设置属性。");
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public String toString() {
		return "brand:" + brand + "/color:" + color + "/maxSpeed:"+ maxSpeed;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void introduce(){
		System.out.println("introduce:"+this.toString());
	}
	

	// ②BeanFactoryAware接口方法
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {//第7步
		System.out.println("第7步：调用BeanFactoryAware.setBeanFactory()。");
		this.beanFactory = beanFactory;
	}

	// ③BeanNameAware接口方法
	public void setBeanName(String beanName) {//第6步
		System.out.println("第6步：调用BeanNameAware.setBeanName()。");
		this.beanName = beanName;
	}

	// ④InitializingBean接口方法
	public void afterPropertiesSet() throws Exception {//第9步
		System.out.println("第9步：调用InitializingBean.afterPropertiesSet()。");
	}

	// ⑤DisposableBean接口方法
	public void destroy() throws Exception {
		System.out.println("调用DisposableBean.destory()。");
	}
	// ⑥通过<bean>的inti-method属性指定的初始化方法
	public void myInit() {//第10步		
		System.out.println("第10步：调用myInit()，将maxSpeed设置为240。");
		this.maxSpeed = 240;
	}
	// ⑦通过<bean>的destory-method属性指定的销毁方法
	public void myDestory() {
		System.out.println("调用myDestroy()。");
	}
	
}
