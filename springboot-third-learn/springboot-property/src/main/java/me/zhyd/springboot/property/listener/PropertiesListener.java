package me.zhyd.springboot.property.listener;

import me.zhyd.springboot.property.config.PropertiesListenerConfig;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * 配置文件监听器，用来加载自定义配置文件
 *
 * Created by zjjlive
 * @Author: zjjlive
 * @Date: 2018/8/29 18:15
 */
public class PropertiesListener implements ApplicationListener<ApplicationStartingEvent> {
	
	private String propertyFileName;

	public PropertiesListener(String propertyFileName) {
		this.propertyFileName = propertyFileName;
	}

	@Override
	public void onApplicationEvent(ApplicationStartingEvent event) {
		PropertiesListenerConfig.loadAllProperties(propertyFileName);
	}
}
