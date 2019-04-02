package com.conposition.mybatis.mybatisspringboot.Controller;

import com.alibaba.fastjson.JSON;
import com.conposition.mybatis.mybatisspringboot.dao.UserMapper;
import com.conposition.mybatis.mybatisspringboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "Helllo World";
    }
    @RequestMapping(value = "/main/info/{id}",method = RequestMethod.GET)
    public String getUser(@PathVariable("id") int id){
             User user=   userMapper.selectById(id);
            return JSON.toJSONString(user);
    }
}
