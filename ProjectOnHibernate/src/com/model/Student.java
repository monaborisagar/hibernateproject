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
@Table(name="student_k")
public class Student {
	@Id
	@GenericGenerator(name="increment", strategy="increment")
	@GeneratedValue(generator="increment")
	@Column(name="sid")
	private int sid;
	
	@Column(name="first_name",  nullable = false, length = 100)
	private String fname;
	@Column(name="last_name", nullable = false, length = 100)
	private String lname;
	
	
	@OneToOne(mappedBy="sc", cascade=CascadeType.ALL)
	private Authentication account;
	
	
	
	 @OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	 @JoinColumn(name = "Student_id") 
	private Collection<StudentCourse> sc;
	
	
	public Collection<StudentCourse> getSc() {
		return sc;
	}
	public void setSc(Collection<StudentCourse> sc) {
		this.sc = sc;
	}
	public Authentication getAccount() {
		return account;
	}
	public void setAccount(Authentication account) {
		this.account = account;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
	
	
}
