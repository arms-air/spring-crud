package com.arms.asia.userscrud;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
public class CrudData {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;

	
	public CrudData(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}



}
