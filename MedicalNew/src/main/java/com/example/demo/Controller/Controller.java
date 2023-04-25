package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceMedical.Servicemedical;
import com.example.demo.database.Medical.Medical;

@RestController
public class Controller {
	@Autowired
	public Servicemedical iser;
	@PostMapping("/saveMedical")
	public Medical addDetails(@RequestBody Medical ia)
	{
		return iser.saveInfo(ia);
	}
	

}
