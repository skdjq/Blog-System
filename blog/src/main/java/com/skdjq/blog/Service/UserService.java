package com.skdjq.blog.Service;


import com.skdjq.blog.entity.User;

public interface UserService {

    User checkUser(String username, String password);
}
