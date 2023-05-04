package com.example.demo.Medical;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="mlogin")
public class Medlogin {
	@Id
	private int pid;
	private String pname;
	private String pdrname;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdrname() {
		return pdrname;
	}
	public void setPdrname(String pdrname) {
		this.pdrname = pdrname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
}
