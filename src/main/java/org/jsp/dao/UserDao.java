package org.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.hibernate.Session;
import org.jsp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository 
public class UserDao {

	@Autowired
	EntityManager entityManager;
	public User saveUser(User user) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}

	public User getUserById(int id)
	{
		 return entityManager.find(User.class, id);
	}

	public User updateUser(User user) {
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(user);
		entityTransaction.commit();
		return user;
	}
	
public User deleteUser(User user) {
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(entityManager.contains(user)?user:entityManager.merge(user));
		entityTransaction.commit();
		
		return user;
	}

public List<User> getAllUsers() {
	Query query=entityManager.createQuery("select u from User u");
	return query.getResultList();
}
}
