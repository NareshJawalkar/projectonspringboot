package com.example.PlacementService2Naresh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class User1controller {
	@Autowired
	 private User1service userservice;
	 
	 @RequestMapping("/")
	 public List<User1> getAllusers()
	 	{
		 return userservice.getAllusers(); 
	 	}
	 	
	 	@RequestMapping(value="/add-user", method=RequestMethod.POST)
	 	public void addUser(@RequestBody User1 userRecord){
	 		userservice.addUser(userRecord);
	 	}


}
