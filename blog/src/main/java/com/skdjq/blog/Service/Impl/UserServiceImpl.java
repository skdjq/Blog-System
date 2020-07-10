package com.skdjq.blog.Service.Impl;


import com.skdjq.blog.Service.UserService;
import com.skdjq.blog.dao.UserDao;
import com.skdjq.blog.entity.User;
import com.skdjq.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User checkUser(String username, String password) {
        User user = userDao.queryByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
