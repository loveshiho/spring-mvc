package com.akai.mapper;

import com.akai.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /*
    * spring 整合 mybatis思路
    * 目的就是可以在service层注入mapper对象
    * mapper对象是mybatis给我们生成的
    * SqlSessionFactory
    * SqlSession
    * UserMapper userMapper = SqlSession.getMapper(UserMapper.class)
    * SqlSessionFactory SqlSession **Mapper全部交给spring创建
    * 在spring容器中存储一堆 **Mapper,再向service层注入即可
    * */
    User findUser(@Param("name") String name,@Param("password") String password);

    List<User> findAll();
}
