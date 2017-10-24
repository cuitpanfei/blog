package com.pf.blog.service;

import com.pf.blog.entity.User;


public interface IUserService extends IBaseService<User> {
    User login(String userEmail, String userPassword);
}
