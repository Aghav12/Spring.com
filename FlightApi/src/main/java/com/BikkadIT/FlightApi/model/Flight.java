package com.BikkadIT.FlightApi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flight {

	@Id
	private int fid;
	
	private String fname;
	
	private String countryName;
	
	private String f;
	
	private String t;
	
	private String doj;
	
	private double tprice;

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getF() {
		return f;
	}

	public void setF(String f) {
		this.f = f;
	}

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public double getTprice() {
		return tprice;
	}

	public void setTprice(double tprice) {
		this.tprice = tprice;
	}

	@Override
	public String toString() {
		return "Flight [fid=" + fid + ", fname=" + fname + ", countryName=" + countryName + ", f=" + f + ", t=" + t
				+ ", doj=" + doj + ", tprice=" + tprice + "]";
	}
}
