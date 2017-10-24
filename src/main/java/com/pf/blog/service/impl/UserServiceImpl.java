package com.pf.blog.service.impl;

import com.pf.blog.dao.UserMapper;
import com.pf.blog.entity.User;
import com.pf.blog.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl extends BaseServiceImpl implements IUserService{


    @Autowired
    private UserMapper userDao;

    public User login(String userEmail, String userPassword) {
        return null;
    }

    public User getObjectById(Integer id) {
        return null;
    }

    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(User entity) {
        return 0;
    }

    public int updateByPrimaryKey(User entity) {
        return 0;
    }
}
