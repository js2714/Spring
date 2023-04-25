package com.example.demo.MedicalReprository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.database.Medical.Medical;
@Repository

public interface Medicalrepository extends JpaRepository<Medical, Integer> {
	

}
