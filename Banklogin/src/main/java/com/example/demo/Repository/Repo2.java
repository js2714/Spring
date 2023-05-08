package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.LoanApplicationModel;

public interface Repo2 extends JpaRepository<LoanApplicationModel, Integer> {

}
