package com.login;

import org.mongodb.morphia.Key;
import org.springframework.stereotype.Service;
@Service
public interface UserService {
	
	public Key<User> create(User user);
	public Key<User> reset(User user);
	public Key<User> logout(User user);
	public int find(String email, String pass);

}
