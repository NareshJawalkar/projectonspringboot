package com.example.PlacementService2Naresh;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class User1 {
	@Id
	private int id ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	private String name;
	private String company;

}
