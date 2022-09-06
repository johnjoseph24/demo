package com.example.demo.model;

import org.springframework.stereotype.Component;
import java.lang.String;
@Component
public class Associate {
	
	
	private String associatename;
	private String associateid;
	private String associateemail;
	private String associateaddress;
	private String associateage;
	private String associatephone;
	public String getAssociatename() {
		return associatename;
	}
	public void setAssociatename(String associatename) {
		this.associatename = associatename;
	}
	public String getAssociateid() {
		return associateid;
	}
	public void setAssociateid(String associateid) {
		this.associateid = associateid;
	}
	public String getAssociateemail() {
		return associateemail;
	}
	public void setAssociateemail(String associateemail) {
		this.associateemail = associateemail;
	}
	public String getAssociateaddress() {
		return associateaddress;
	}
	public void setAssociateaddress(String associateaddress) {
		this.associateaddress = associateaddress;
	}
	public String getAssociateage() {
		return associateage;
	}
	public void setAssociateage(String associateage) {
		this.associateage = associateage;
	}
	public String getAssociatephone() {
		return associatephone;
	}
	public void setAssociatephone(String associatephone) {
		this.associatephone = associatephone;
	}
	public Associate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Associate(String associatename, String associateid, String associateemail, String associateaddress,
			String associateage, String associatephone) {
		super();
		this.associatename = associatename;
		this.associateid = associateid;
		this.associateemail = associateemail;
		this.associateaddress = associateaddress;
		this.associateage = associateage;
		this.associatephone = associatephone;
	}
	
	
}	