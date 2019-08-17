package me.zhyd.springboot.mybatis.mapper;

import me.zhyd.springboot.mybatis.bean.Message;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * springboot
 * Created by zjjlive
 * @Author: zjjlive
 * @Date: 2018/8/29 18:15
 */
@Mapper
@Repository
public interface MessageAnnotationMapper {

    @Select("SELECT * FROM message")
    @Results({
            @Result(property = "id", column = "id", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Result(property = "nickName", column = "nick_name", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "ip", column = "ip", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "insertTime", column = "INSERT_TIME", javaType = Date.class, jdbcType = JdbcType.DATE)
    })
    List<Message> list();
}
