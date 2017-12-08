package com.bypro.dealoffer.dao;

import java.util.List;

import com.bypro.dealoffer.model.User;

public interface UserDao  {
 
    void saveUser(User user);
    List<User> findAllUsers();
    void updateUser(User user);
    User findUserByPhoneNo(String phoneNo);
    List<User> findUserById(Long userId);
    void save(Object entity);
}