package com.lti.nsp.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentlogin")

public class StudentLoginPojo 
{
	
	//@GeneratedValue()
	@Id
	@Column(name="userID")
	private String user;
	@Column(name="password")
	private String pass;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public StudentLoginPojo(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}
	public StudentLoginPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentLoginPojo [user=" + user + ", pass=" + pass + "]";
	}

}