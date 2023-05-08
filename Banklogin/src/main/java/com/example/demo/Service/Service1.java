package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Model.UserModel;
import com.example.demo.Repository.Repo1;
 @Service

public class Service1 {
	
	
	@Autowired
    public Repo1 rep;
	
	public UserModel adduser(UserModel usmodel) 
	{
		return rep.save(usmodel);
	}
	
	public Optional<UserModel> getUserModelbyId(int id)
	{
		return rep.findById(id);
	}
	public UserModel update (UserModel id)
	{
		return rep.saveAndFlush(id);
	}
	public void delete(int id)
	{
		 rep.deleteById(id);
	}
	
}
