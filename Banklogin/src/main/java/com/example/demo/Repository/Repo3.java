package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.LoginModel;

public interface Repo3 extends JpaRepository<LoginModel, Integer> {

}
