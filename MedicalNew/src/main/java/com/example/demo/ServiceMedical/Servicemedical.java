package com.example.demo.ServiceMedical;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.MedicalReprository.Medicalrepository;
import com.example.demo.database.Medical.Medical;
@Service
public class Servicemedical {
	@Autowired
	public Medicalrepository irepo;
	public Medical saveInfo(Medical im)
	{
		return irepo.save(im);
	}

}
