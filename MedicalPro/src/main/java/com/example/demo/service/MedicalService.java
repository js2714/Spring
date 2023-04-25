package com.example.demo.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Medical.Medical;
import com.example.demo.repository.MedicalRepository;

@Service
public class MedicalService {
	@Autowired
	public MedicalRepository repo;

	@PostMapping("/medical")
	public Medical addMedical(Medical med) {
		// TODO Auto-generated method stub
		return repo.save(med);
	}

	public Optional<Medical> getMedicalbyId(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}


	public Medical update(Medical id) {
		// TODO Auto-generated method stub
		return repo.saveAndFlush(id);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	
}