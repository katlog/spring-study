package me.zhyd.springboot.multi.mapper.primary;


import me.zhyd.springboot.multi.entity.Users;
import me.zhyd.springboot.multi.plugin.MyMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 * springboot
 * Created by zjjlive
 * @Author: zjjlive
 * @Date: 2018/8/29 18:15
 */
@Repository
@Transactional("primaryTestTransactionManager")
public interface User1Mapper extends MyMapper<Users>{
    List<Users> selectAllByXml();
}