package com.login;

import org.mongodb.morphia.Key;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao repository;
	
	public Key<User> create(User user)
	{
		return repository.create(user);
	}
	

	public Key<User> reset(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public Key<User> logout(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int find(String email, String pass) {
		return repository.find(email,pass);
	}

}
