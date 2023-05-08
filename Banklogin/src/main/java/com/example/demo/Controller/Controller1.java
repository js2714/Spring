package com.example.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Model.UserModel;
import com.example.demo.Service.Service1;

@RestController
public class Controller1 {
	@Autowired
	 
	public Service1 ser;
	
	@GetMapping("/add")
    public Optional<UserModel>  readbyid(@PathVariable("id")int id)
    {
   	 return ser.getUserModelbyId(id);
    }
	@PostMapping("/id")
    public UserModel create(@RequestBody UserModel id)
    {
   	 return ser.adduser(id);
    }
	 @PutMapping("/id")
     public UserModel update(@RequestBody UserModel id)
     {
    	 return ser.update(id);
     }
          @DeleteMapping("/delet")
     public String delete(@PathVariable("id")int id)
     {
    	 ser.delete(id);
    	 return "Deletion was successful";
     }

}
