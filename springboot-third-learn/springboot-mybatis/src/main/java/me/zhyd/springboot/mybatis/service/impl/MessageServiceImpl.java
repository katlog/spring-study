package me.zhyd.springboot.mybatis.service.impl;

import me.zhyd.springboot.mybatis.bean.Message;
import me.zhyd.springboot.mybatis.mapper.MessageAnnotationMapper;
import me.zhyd.springboot.mybatis.mapper.MessageMapper;
import me.zhyd.springboot.mybatis.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * springboot
 * Created by zjjlive
 * @Author: zjjlive
 * @Date: 2018/8/29 18:15
 */
@Service
public class MessageServiceImpl implements IMessageService {

    @Autowired
    private MessageMapper messageMapper;
    @Autowired
    private MessageAnnotationMapper annotationMapper;

    @Override
    public List<Message> listByMapperXml() {
        return messageMapper.listByMapperXml();
    }

    @Override
    public List<Message> listByMapper() {
        return messageMapper.selectAll();
    }

    @Override
    public List<Message> listByAnnotation() {
        return annotationMapper.list();
    }

}
