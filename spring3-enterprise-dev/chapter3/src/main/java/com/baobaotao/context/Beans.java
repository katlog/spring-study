package com.baobaotao.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baobaotao.Car;
// 3-20
@Configuration//①表示一个配置信息的提供类
public class Beans {

	@Bean(name = "car")//②定义一个bean
	public Car buildCar() {
		Car car = new Car();
		car.setBrand("红旗CA72");
		car.setMaxSpeed(200);
		return car;
	}
}
