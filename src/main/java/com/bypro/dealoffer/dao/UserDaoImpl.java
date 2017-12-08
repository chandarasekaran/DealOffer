package com.bypro.dealoffer.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.bypro.dealoffer.QueryConstants;
import com.bypro.dealoffer.model.User;


@Repository("UserDao")
public class UserDaoImpl extends AbstractDao implements UserDao{
 
    public void saveUser(User employee) {
        persist(employee);
    }
 
    @SuppressWarnings("unchecked")
    public List<User> findAllUsers() {
        Criteria criteria = getSession().createCriteria(User.class);
        return (List<User>) criteria.list();
    }     
    public void updateUser(User employee){
        getSession().update(employee);
    }

	public User findUserByPhoneNo(String phoneNo) {
		Criteria criteria = getSession().createCriteria(User.class)
			    .add(Restrictions.eq(QueryConstants.PHONE_NUMBER, phoneNo));
		return (User) criteria.list().get(0);
	}

	public List<User> findUserById(Long userId) {
		Criteria criteria = getSession().createCriteria(User.class)
			    .add(Restrictions.eq(QueryConstants.ID, userId));
		return  criteria.list();
	} 
}