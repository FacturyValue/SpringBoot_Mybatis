package com.conposition.mybatis.mybatisspringboot.dao;

import com.conposition.mybatis.mybatisspringboot.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    User selectById(@Param("id") int id);
}
