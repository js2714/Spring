package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.onemodel.Question;
import com.example.demo.repo.Questionrepo;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class Quectioncontroller {
	
	@Autowired
	Questionrepo qrepo;
	
	@PostMapping("/post")
	public String saveDetails(@RequestBody  Question q)
	{
		qrepo.save(q);
		return "Data is saved";
	}
	@GetMapping("")
	public List<Question> showQuAns()
	{
		return qrepo.findAll();
	}
	@DeleteMapping("/{qno}")
	public String delete(@PathVariable("qno") int qno)
	{
		qrepo.deleteById(qno);
		return "Deletion was successfull";
	}
	
	
	@Tag(name = "GET ALL PATIENT DETAILS USING QUERY",description = "provides the details of requested table by query")
	@GetMapping("/query")

	public List<Question> getAll()

	{

		return qrepo.getAllData();

	}

	@Tag(name = "GET ALL PATIENT DETAILS USING QUERY",description = "provides the details of requested table by query")
	@GetMapping("/queryget/{qno}")

	public List<Question> getdetails(@PathVariable int qno)

	{
		return qrepo.getD(qno);
	}

	
	 @Tag(name = "UPDATE PATIENT DETAILS IN THE ONE TO MANY PROJECT",description = "update the details in the database")
	@PutMapping("/queryupdate/{qno}/{qname}")

	public void updateDetails(@PathVariable int qno,@PathVariable String qname)

	{

		 qrepo.update(qno,qname); 

	}
    
	 @Tag(name = "DELETE PATIENT DETAILS IN THE ONE TO MANY PROJECT",description = "delete the details in the database")
	@DeleteMapping("/deletequery/{qno}")

	public String delete1(@PathVariable("qno") int qno)

	{
		qrepo.deleteById(qno);

		return "Deleted Successfully";

	}
	//jpql

	 
		@Tag(name = "GET ALL PATIENT DETAILS USING QUERY",description = "provides the details of requested table by query")
	@GetMapping("/jpql/{qno}")

	public List<Question> get(@PathVariable int qno)

	{

		return qrepo.getDetails(qno);

	}
	
	//update
		 @Tag(name = "UPDATE PATIENT DETAILS IN THE ONE TO MANY PROJECT",description = "update the details in the database")
	@PutMapping("/jpqlup/{qname}/{qno}")
	public String update(@PathVariable("qname")String qname,@PathVariable("qno")int qno)
	{
		qrepo.jpqlupdate(qname, qno);
		return "updated";
	}
	
	//delete by name jpql
		 
		 @Tag(name = "DELETE PATIENT DETAILS IN THE ONE TO MANY PROJECT",description = "delete the details in the database")
	@DeleteMapping("/deletejpql/{qno}")
	public String delete11(@PathVariable("qno")String qno)
	{
		qrepo.jpqldelete(qno);
		return "delet";
	}
	
	//get btw jpql
		 
			@Tag(name = "GET ALL PATIENT DETAILS USING QUERY",description = "provides the details of requested table by query")
	@GetMapping("/getbtw/{one}/{two}")
	public List<Question>getbtw(@PathVariable("one")int one,@PathVariable("two")int two)
	{
		return qrepo.between(one, two);
	}
}
