package com.example.demo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.demo.Medical.Medical;
import com.example.demo.repository.MedicalRepository;

@Service
public class MedicalService {
	@Autowired
	public MedicalRepository repo;

	public Medical addMedical(Medical med) 
	{
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
	public List<Medical> sortAsc(String name)
	{
		return repo.findAll(Sort.by(name).ascending());
	}
	public List<Medical> sortDesc(String name)
	{
		return repo.findAll(Sort.by(name).descending());
	}
	public List<Medical> paginationD(int pno,int psize)
	{
		Page<Medical> p= repo.findAll(PageRequest.of(pno, psize));
		return p.getContent();	
	}
	public List<Medical> paginationS(int pno,int psize,String name)
	{
		Page<Medical> p= repo.findAll(PageRequest.of(pno, psize,Sort.by(name).ascending()));
		return p.getContent();
	}
	

	
}