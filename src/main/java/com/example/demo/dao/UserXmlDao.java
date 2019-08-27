package com.example.demo.dao;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserXmlDao {
    /**
     * 通过名字查询用户信息
     */
    User findUserByName(String name);
}
