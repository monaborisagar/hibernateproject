package com.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Authentication_k")
public class Authentication {
	@Id
	@GenericGenerator(name="increment", strategy="increment")
	@GeneratedValue(generator="increment")
	@Column(name="id")
	private int id;
	
	
	@Column(name="email", unique = true, nullable = false, length = 100)
	private String email;
	@Column(name="password",  nullable = false, length = 100)
	private String password;
	

	
	@OneToOne(cascade = CascadeType.ALL)
	private Student sc;


	public Student getSc() {
		return sc;
	}


	public void setSc(Student sc) {
		this.sc = sc;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	
	

	
	
	
}
