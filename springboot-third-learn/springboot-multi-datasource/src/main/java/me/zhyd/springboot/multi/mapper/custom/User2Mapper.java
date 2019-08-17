package me.zhyd.springboot.multi.mapper.custom;

import me.zhyd.springboot.multi.entity.Users;
import me.zhyd.springboot.multi.plugin.MyMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * springboot
 * Created by zjjlive
 * @Author: zjjlive
 * @Date: 2018/8/29 18:15
 */
@Repository
public interface User2Mapper extends MyMapper<Users> {
    List<Users> selectAllByXml();
}