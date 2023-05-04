package com.example.demo.controller;

	
	import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Servicelog;
import com.example.demo.onemodel.Login;
	@RestController
	@RequestMapping("/mid")
	public class logincon {
		@Autowired
		private Servicelog service;
		@PostMapping("/login")
		public String login(@RequestBody Map<String , String > loginData)
		{
			String pname = loginData.get("pname");
			String pdrname = loginData.get("pdrname");
			String result = service.checkLogin(pname, pdrname);
			return result;
		}
		@PostMapping("/address")
		public Login AddUser(@RequestBody Login med)
		{
			return service.addUser(med);
			
		}
		@GetMapping
		public List<Login> listAll()
		{
			return service.getUser();
		}
		
		

}
