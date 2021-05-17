package com.hapiweb.test_block.service.ServiceImpl;

import com.hapiweb.test_block.dao.UserMapper;
import com.hapiweb.test_block.entity.User;
import com.hapiweb.test_block.entity.UserExample;
import com.hapiweb.test_block.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public String getPk(){
        return UUID.randomUUID().toString();
    }


    @Override
    public User register(User user) {

        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();


        // todo
        //1、检查字段

        //2、检查似乎否存在用户

        //3、若不存在则插入用户

        //4、返回注册的新用户
        return null;
    }

    @Override
    public User signin(User user) {
        return null;
    }

    @Override
    public User signout(User user) {
        return null;
    }
}
