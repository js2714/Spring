package com.example.demo.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Medical.Medical;
import com.example.demo.service.MedicalService;

@RestController

public class MedicalController {
	@Autowired
	private MedicalService service;
     @GetMapping("medical/{id}")
     public Optional<Medical>  readbyid(@PathVariable("id")int id)
     {
    	 return service.getMedicalbyId(id);
     }
     @PostMapping("/medical")
     public Medical create(@RequestBody Medical med)
     {
    	 return service.addMedical(med);
     }
     @PutMapping("/idupdate")
     public Medical update(@RequestBody Medical id)
     {
    	 return service.update(id);
     }
     @DeleteMapping("medical/{id}")
     public String delete(@PathVariable("id")int id)
     {
    	 service.delete(id);
    	 return "Deletion was successful";
     }
}
