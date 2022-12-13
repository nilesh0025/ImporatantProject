package com.yash.ne.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Userorder {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String dishname;
	int quantity;
	String date;
	String time;
	String special;

	
	
	
	public Userorder() {
		super();
	}




	public Userorder(int id, String dishname, int quantity, String date, String time, String special) {
		super();
		this.id = id;
		this.dishname = dishname;
		this.quantity = quantity;
		this.date = date;
		this.time = time;
		this.special = special;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getDishname() {
		return dishname;
	}




	public void setDishname(String dishname) {
		this.dishname = dishname;
	}




	public int getQuantity() {
		return quantity;
	}




	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




	public String getDate() {
		return date;
	}




	public void setDate(String date) {
		this.date = date;
	}




	public String getTime() {
		return time;
	}




	public void setTime(String time) {
		this.time = time;
	}




	public String getSpecial() {
		return special;
	}




	public void setSpecial(String special) {
		this.special = special;
	}




}