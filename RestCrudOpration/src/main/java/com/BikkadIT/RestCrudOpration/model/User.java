package com.BikkadIT.RestCrudOpration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DTLS")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private int uId;
	
	@Column(name = "USER_NAME")
	private String uName;
	
	@Column(name = "USER_AGE")
	private int uAge;
	
	@Column(name = "USER_ADDERSS")
	private String uAddress;

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public int getuAge() {
		return uAge;
	}

	public void setuAge(int uAge) {
		this.uAge = uAge;
	}

	public String getuAddress() {
		return uAddress;
	}

	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uAge=" + uAge + ", uAddress=" + uAddress + "]";
	}
	
	
	
	
}
