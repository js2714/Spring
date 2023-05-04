package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.onemodel.Answer;

public interface Answerrepo extends JpaRepository<Answer, Integer> {

}
