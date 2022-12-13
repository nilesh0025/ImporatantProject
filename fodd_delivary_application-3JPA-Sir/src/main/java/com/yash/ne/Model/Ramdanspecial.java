package com.yash.ne.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ramdanspecial {
	@Id
	int id ;
	String address;
	String hotelname;
	String name;
	public Ramdanspecial() {
		super();
	}
	public Ramdanspecial(int id, String address, String hotelname, String name) {
		super();
		this.id = id;
		this.address = address;
		this.hotelname = hotelname;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
