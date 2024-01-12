package com.subhanshu.springauthexample.service;

import com.subhanshu.springauthexample.entity.User;

import java.util.List;

public interface UserService {

    User createUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();
    User updateUser(Long id, User user);
    void deleteById(Long id);

}
