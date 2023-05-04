package com.example.demo.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Medical.Medical;
import com.example.demo.service.MedicalService;

@RestController
@RequestMapping("/med")
public class MedicalController {
	@Autowired
	private MedicalService service;
	
     @GetMapping("/medical")
     public Optional<Medical>  readbyid(@PathVariable("id")int id)
     {
    	 return service.getMedicalbyId(id);
     }
     @PostMapping("/id")
     public Medical create(@RequestBody Medical id)
     {
    	 return service.addMedical(id);
     }
     
     
     @PutMapping("/id")
     public Medical update(@RequestBody Medical id)
     {
    	 return service.update(id);
     }
          @DeleteMapping("/delet")
     public String delete(@PathVariable("id")int id)
     {
    	 service.delete(id);
    	 return "Deletion was successful";
     }
     
     @GetMapping("/sortasc/{name}")
     //sorting the given details asc
     public List<Medical> sortAsc(@PathVariable("name")String name)
     {
    	 return service.sortAsc(name);
     }
     
     @GetMapping("/sortdesc/{name}")
     //sorting the given details descending
     public List<Medical> sortdesc(@PathVariable("name")String name)
     {
    	 return service.sortDesc(name);
     }
     
     //pagination in the given details 
     @GetMapping("/pagination/{pno}/{psize}")
     public List<Medical> pagination(@PathVariable("pno")int pno,@PathVariable("psize")int psize)
     {
    	 return service.paginationD(pno,psize);
     }
     
     //pagination and sorting
     @GetMapping("/pageandsort/{pno}/{psize}/{name}")
     public List<Medical> pagesort(@PathVariable("pno")int pno,@PathVariable("psize")int psize,@PathVariable("name")String name)
     {
    	 return service.paginationS(pno,psize,name);
     }
     
     
     
          
     
}
