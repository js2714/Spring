package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Medical.Medlogin;

public interface Medlog extends JpaRepository<Medlogin, Integer> {

	Medlogin findBypname(String pname);
	

}
