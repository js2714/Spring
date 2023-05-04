package com.example.demo.Service;
	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.onemodel.Login;
import com.example.demo.repo.Loginrepo;
	@Service

	public class Servicelog {
		@Autowired
		private Loginrepo repo;
		
		public String checkLogin(String pname, String pdrname )
		{
			Login user = repo.findBypname(pname);
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
		
		
		public List<Login> getUser() {
			// TODO Auto-generated method stub
			return repo.findAll();
		}
		


		public Login addUser(Login med) {
			// TODO Auto-generated method stub
			return repo.save(med);
		}
		
		

	}

