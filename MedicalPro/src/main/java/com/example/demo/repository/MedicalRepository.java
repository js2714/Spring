package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Medical.Medical;
@Repository

public interface MedicalRepository extends JpaRepository<Medical, Integer> {

}
