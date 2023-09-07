package com.example.PlacementService2Naresh;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class User1service {
	
	@Autowired
	private user1Repo userrepo;

	public List<User1> getAllusers()
	{
		List<User1> user=new ArrayList();
		userrepo.findAll().forEach(user::add);
		return user;
	}
	public void addUser(User1 user) {
		
		userrepo.save(user);
		
	}

}
