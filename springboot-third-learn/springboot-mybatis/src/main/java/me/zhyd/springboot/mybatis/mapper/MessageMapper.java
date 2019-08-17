package me.zhyd.springboot.mybatis.mapper;

import me.zhyd.springboot.mybatis.bean.Message;
import me.zhyd.springboot.mybatis.util.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * springboot
 * Created by zjjlive
 * @Author: zjjlive
 * @Date: 2018/8/29 18:15
 */
@Repository
public interface MessageMapper extends BaseMapper<Message> {
    List<Message> listByMapperXml();
}
