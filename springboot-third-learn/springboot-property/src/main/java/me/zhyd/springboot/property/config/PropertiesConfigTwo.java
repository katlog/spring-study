package me.zhyd.springboot.property.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//import org.springframework.context.annotation.PropertySource;

/**
 * springboot
 * Created by zjjlive
 * @Author: zjjlive
 * @Date: 2018/8/29 18:15
 */
@Configuration
@PropertySource("classpath:/conf/app-config.properties")
@ConfigurationProperties(prefix = "com.zyd2")
public class PropertiesConfigTwo {

	public String type;
	public String title;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
