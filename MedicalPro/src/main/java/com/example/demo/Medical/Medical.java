package com.example.demo.Medical;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "paitentdatabase")
public class Medical {
	@Id
	private int pserialno;
	private int pno;
	private int page;
	private String pname;
	private int pdate;
	private String pproblem;
	private String pdrname;
	private String pdiabetes;
	private String pregular;
	private String pshistory;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPdate() {
		return pdate;
	}
	public void setPdate(int pdate) {
		this.pdate = pdate;
	}
	public String getPproblem() {
		return pproblem;
	}
	public void setPproblem(String pproblem) {
		this.pproblem = pproblem;
	}
	public String getPdrname() {
		return pdrname;
	}
	public void setPdrname(String pdrname) {
		this.pdrname = pdrname;
	}
	public String getPdiabetes() {
		return pdiabetes;
	}
	public void setPdiabetes(String pdiabetes) {
		this.pdiabetes = pdiabetes;
	}
	public int getPserialno() {
		return pserialno;
	}
	public void setPserialno(int pserialno) {
		this.pserialno = pserialno;
	}
	public String getPregular() {
		return pregular;
	}
	public void setPregular(String pregular) {
		this.pregular = pregular;
	}
	public String getPshistory() {
		return pshistory;
	}
	public void setPshistory(String pshistory) {
		this.pshistory = pshistory;
	}
	
	}
	
