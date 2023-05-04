package com.example.demo.onemodel;

import jakarta.persistence.*;

@Entity
public class Answer {
	@Id
	private int ano;
	private String answer;
	private String aadd;
	private String adrname;
	private String aname;
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAadd() {
		return aadd;
	}
	public void setAadd(String aadd) {
		this.aadd = aadd;
	}
	public String getAdrname() {
		return adrname;
	}
	public void setAdrname(String adrname) {
		this.adrname = adrname;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	

}
