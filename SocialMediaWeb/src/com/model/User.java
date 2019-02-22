package com.model;

import java.sql.Date;

public class User {
	
	private String eMail; //unique

	private String password;
	
	private String name;
	
	private String surname;
	
	private Date birthDate;
	
	private Sex sex;
	
	
	public User(String eMail,String password, String name,String surname, Date birthDate, Sex sex){
		this.eMail = eMail;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.sex = sex;
	}
	
	

	public String geteMail() {
		return eMail;
	}


	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public Sex getSex() {
		return sex;
	}


	public void setSex(Sex sex) {
		this.sex = sex;
	}

}
