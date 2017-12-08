package com.bypro.dealoffer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bypro.dealoffer.dao.UserDao;
import com.bypro.dealoffer.model.User;

@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService{
 
    @Autowired
    private UserDao dao;
     
    public void saveUser(User user) {
        dao.saveUser(user);
    }
 
    public List<User> findAllUsers() {
        return dao.findAllUsers();
    }
    public void updateUser(User user){
        dao.updateUser(user);
    }

	public User findUserByPhoneNo(String phoneNo) {
		return dao.findUserByPhoneNo(phoneNo);
	}

	public User findUserById(Long userId) {
		List<User> userList= dao.findUserById(userId);
		if(userList!=null && !userList.isEmpty())
		{
			return userList.get(0);
		}
		return null;
	}

	public void save(Object entity) {
		dao.save(entity);
	}
}
