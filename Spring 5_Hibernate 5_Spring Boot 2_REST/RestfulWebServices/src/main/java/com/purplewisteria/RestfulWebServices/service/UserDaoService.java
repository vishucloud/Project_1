 package com.purplewisteria.RestfulWebServices.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.purplewisteria.RestfulWebServices.model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

@Component
public class UserDaoService {
	
	private static int usersCount = 3;
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1, "Rick", new Date()));
		users.add(new User(2, "Jhon", new Date()));
		users.add(new User(3, "Coery", new Date()));
	}
	
	
    public List< User> findAll()  {
    	 return users;
    }
    
    public User save ( User user)   {
 
      if(user.getId()==null) {
    	   user.setId(++ usersCount);
      }
            users.add(user);
            return user;
   }
    
    public User findUser(int id) {
    for (User user: users) {
    	if (user.getId()==id) {
    		return user;
    	 }
      }
       return null;
    }
   
    
    public User deleteById(int id) {
    	
    	Iterator<User> iterator = users.iterator(); 	
      while(iterator.hasNext()) {
    	User user = iterator.next();
    	if(user.getId() == id) {
    		iterator.remove();
    		return user;
    	}
      }
       return null;
    }
   
   
   
}
