package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.onemodel.Login;

public interface Loginrepo extends JpaRepository<Login, Integer> {
	
       Login findBypname(String pname);

}
