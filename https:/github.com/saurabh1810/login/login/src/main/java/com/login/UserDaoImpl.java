package com.login;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	Datastore datastore;
	
	public Key<User> create(User user)
	{
		try
		{
			Key<User> user1=datastore.save(user);
			return user1;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return null;
	}


	public Key<User> reset() {
		// TODO Auto-generated method stub
		return null;
	}

	public Key<User> logout() {
		// TODO Auto-generated method stub
		return null;
	}
	


	@SuppressWarnings("deprecation")
	@Override
	public int find(String email, String pass) {
		//User user=new User(email,pass);
		
		//User old = datastore.get(User.class, user.getEmail());
		//ObjectId objId = new ObjectId(email);
		User user = datastore.find(User.class,email, value)
		/*
		 * List<User> al= (List<User>) datastore.find(User.class).asList(); for(int
		 * i=0;i<al.size();i++) { if(al.get(i).getEmail().equals(email) &&
		 * al.get(i).getPassword().equals(pass)) { System.out.println("USer exist");
		 * return 0; } }
		 */
return -1;	
	}

}
