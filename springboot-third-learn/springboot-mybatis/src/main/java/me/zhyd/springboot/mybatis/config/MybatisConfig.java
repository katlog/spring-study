package me.zhyd.springboot.mybatis.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

/**
 * springboot
 * Created by zjjlive
 * @Author: zjjlive
 * @Date: 2018/8/29 18:15
 */
@Component
@MapperScan("me.zhyd.springboot.mybatis.mapper")
public class MybatisConfig {
}
