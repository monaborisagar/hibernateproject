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
@Table(name="contactDetails_k")
public class contactDetails {
	@Id
	@GenericGenerator(name="increment", strategy="increment")
	@GeneratedValue(generator="increment")
	@Column(name="contact_id")
	private int contact_id;
	
	@Column(name="contact_name",  nullable = false, length = 100)
	private String contact_name;
	@Column(name="contact_email", nullable = false, length = 100)
	private String contact_email;
	@Column(name="contact_message", nullable = false, length = 100)
	private String contact_message;
	public int getContact_id() {
		return contact_id;
	}
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}
	public String getContact_name() {
		return contact_name;
	}
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}
	public String getContact_email() {
		return contact_email;
	}
	public void setContact_email(String contact_email) {
		this.contact_email = contact_email;
	}
	public String getContact_message() {
		return contact_message;
	}
	public void setContact_message(String contact_message) {
		this.contact_message = contact_message;
	}
	
	
	
	
	
	
}
