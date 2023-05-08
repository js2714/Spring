package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.LoanApplicationModel;
import com.example.demo.Repository.Repo2;
import com.example.demo.Service.Service2;

@RestController
@Service
public class Service2 { 
		
		
		@Autowired
	    public Repo2 rep;
		
		public LoanApplicationModel adduser(LoanApplicationModel usmodel) 
		{
			return rep.save(usmodel);
		}
		
		public Optional<LoanApplicationModel> getLoanApplicationModelbyId(int id)
		{
			return rep.findById(id);
		}
		public LoanApplicationModel update (LoanApplicationModel id)
		{
			return rep.saveAndFlush(id);
		}
		public void delete(int id)
		{
			 rep.deleteById(id);
		}

}