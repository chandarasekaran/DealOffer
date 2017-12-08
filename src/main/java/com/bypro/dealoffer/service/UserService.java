package com.bypro.dealoffer.service;

import java.util.List;

import com.bypro.dealoffer.model.User;

public interface UserService {
	 
    void saveUser(User user);
    List<User> findAllUsers();
    void updateUser(User user);
    User findUserByPhoneNo(String phoneNo);
    User findUserById(Long userId);
    
    void save(Object entity);
}
