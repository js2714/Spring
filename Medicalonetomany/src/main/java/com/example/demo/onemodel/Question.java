package com.example.demo.onemodel;

import java.util.List;

import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity
public class Question {
	
	@Id
	private int qno;
	private String qname;
	private String qadd;
	

	
	@OneToMany(cascade = CascadeType.ALL)	
	@JoinColumn
	private List<Answer> ans;
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<Answer> getAns() {
		return ans;
	}
	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}
	public String getQadd() {
		return qadd;
	}
	public void setQadd(String qadd) {
		this.qadd = qadd;
	}
	

}
