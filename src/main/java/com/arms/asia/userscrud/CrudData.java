package com.arms.asia.userscrud;

import java.util.Date;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
public class CrudData {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Date createdDate;
	private Date unpdatedDate;
	
	public CrudData(String name){
		this.name = name;
//		this.createdDate = Calendar.getInstance().getTime();
//		this.unpdatedDate = Calendar.getInstance().getTime();
	}

	public String getName() {
		return name;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public Date getUnpdatedDate() {
		return unpdatedDate;
	}
	
	
}
