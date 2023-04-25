package com.example.demo.database.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Car")
public class CarModel  {
@Id
@Column(name="cname")
 private int cid;
 private String cname;
 private int model;
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public int getModel() {
	return model;
}
public void setModel(int model) {
	this.model = model;
}


}
