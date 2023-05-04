package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Medical.Medlogin;
import com.example.demo.service.Medlogservice;
@RestController
@RequestMapping("/mid")
public class MedController {
	@Autowired
	private Medlogservice service;
	@PostMapping("/login")
	public String login(@RequestBody Map<String , String > loginData)
	{
		String pname = loginData.get("pname");
		String pdrname = loginData.get("pdrname");
		String result = service.checkLogin(pname, pdrname);
		return result;
	}
	@PostMapping("/address")
	public Medlogin AddUser(@RequestBody Medlogin med)
	{
		return service.addUser(med);
		
	}
	@GetMapping
	public List<Medlogin> listAll()
	{
		return service.getUser();
	}
	
	
	
	
	

}
