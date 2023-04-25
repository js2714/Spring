package com.example.demo.database.Medical;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Medic")
public class Medical
{
	@Id
	private String mname;
	private int mage;
	private int mno;
	private int mdate;
	private String mproblem;
	private String mDrname;
	private String mdiabetes;
	private int mphoneno;
	private String mregular;
	private String msurgicalhistory;
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getMage() {
		return mage;
	}
	public void setMage(int mage) {
		this.mage = mage;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getMdate() {
		return mdate;
	}
	public void setMdate(int mdate) {
		this.mdate = mdate;
	}
	public String getMproblem() {
		return mproblem;
	}
	public void setMproblem(String mproblem) {
		this.mproblem = mproblem;
	}
	public String getmDrname() {
		return mDrname;
	}
	public void setmDrname(String mDrname) {
		this.mDrname = mDrname;
	}
	public String getMdiabetes() {
		return mdiabetes;
	}
	public void setMdiabetes(String mdiabetes) {
		this.mdiabetes = mdiabetes;
	}
	public int getMphoneno() {
		return mphoneno;
	}
	public void setMphoneno(int mphoneno) {
		this.mphoneno = mphoneno;
	}
	public String getMregular() {
		return mregular;
	}
	public void setMregular(String mregular) {
		this.mregular = mregular;
	}
	public String getMsurgicalhistory() {
		return msurgicalhistory;
	}
	public void setMsurgicalhistory(String msurgicalhistory) {
		this.msurgicalhistory = msurgicalhistory;
	}

}
