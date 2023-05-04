package com.example.demo.service;

	

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Medical.Medlogin;
import com.example.demo.repository.Medlog;
@Service

public class Medlogservice {
	@Autowired
	private Medlog repo;
	
	public String checkLogin(String pname, String pdrname )
	{
		Medlogin user = repo.findBypname(pname);
		if(user== null)
		{
			return "no user found";
		}
		else
		{
			if(user.getPdrname().equals(pdrname))
			{
				return "Login succesfull";
			}
			else
			{
				return "Login Failed";
			}
		}
	}
	
	
	public List<Medlogin> getUser() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	


	public Medlogin addUser(Medlogin med) {
		// TODO Auto-generated method stub
		return repo.save(med);
	}
	
	

}
