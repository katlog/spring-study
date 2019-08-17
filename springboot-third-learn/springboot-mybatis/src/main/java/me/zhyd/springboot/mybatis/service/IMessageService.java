package me.zhyd.springboot.mybatis.service;

import java.util.List;

import me.zhyd.springboot.mybatis.bean.Message;

/**
 * springboot
 * Created by zjjlive
 * @Author: zjjlive
 * @Date: 2018/8/29 18:15
 */
public interface IMessageService {

	List<Message> listByMapperXml();

	List<Message> listByMapper();

	List<Message> listByAnnotation();

}
