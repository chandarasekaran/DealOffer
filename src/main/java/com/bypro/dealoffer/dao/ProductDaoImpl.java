package com.bypro.dealoffer.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.bypro.dealoffer.model.CustomProduct;

@Repository("ProductDao")
public class ProductDaoImpl extends AbstractDao  implements ProductDao
{

	@SuppressWarnings("unchecked")
	public List<CustomProduct> getCustomProductsByUserId(Long userId) {
		//org.hibernate.Query qry =getSession().createQuery("from User u left join fetch u.customProductList WHERE u.id = :user_id");
		//createQuery("from employee e left join fetch e.phonenumbers")
		//Criteria criteria = getSession().createCriteria(CustomProduct.class).add(Restrictions.eq(QueryConstants.USER_ID, userId));
		org.hibernate.Query qry =getSession().createQuery("from CustomProduct cp WHERE cp.user.id = :user_id");
		
		qry.setParameter("user_id",userId);
		List<CustomProduct> list=qry.list();
		return list;
		
	}

}
