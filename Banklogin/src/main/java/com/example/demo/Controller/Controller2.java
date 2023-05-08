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

import com.example.demo.Model.LoanApplicationModel;

import com.example.demo.Service.Service2;

@RestController
public class Controller2 {
	@Autowired
	 
	public Service2 ser;
	
	@GetMapping("/add")
    public Optional<LoanApplicationModel>  readbyid(@PathVariable("id")int id)
    {
   	 return ser.getLoanApplicationModelbyId(id);
    }
	@PostMapping("/id")
    public LoanApplicationModel create(@RequestBody LoanApplicationModel id)
    {
   	 return ser.adduser(id);
    }
	 @PutMapping("/id")
     public LoanApplicationModel update(@RequestBody LoanApplicationModel id)
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
