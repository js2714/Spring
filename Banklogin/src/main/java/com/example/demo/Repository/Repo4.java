package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.UserModel;

public interface Repo4 extends JpaRepository<UserModel, Integer> {

}
