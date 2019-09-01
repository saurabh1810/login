package com.login;

import org.mongodb.morphia.Key;

public interface UserDao {
	
	public Key<User> create(User user);
	public Key<User> reset();
	public int find(String email, String pass);
	public Key<User>logout();

}
