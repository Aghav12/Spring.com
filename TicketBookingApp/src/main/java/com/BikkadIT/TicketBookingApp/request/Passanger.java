package com.BikkadIT.TicketBookingApp.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Passanger {

	private int pid;
	
	private String pname;
	
	private String paddr;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPaddr() {
		return paddr;
	}

	public void setPaddr(String paddr) {
		this.paddr = paddr;
	}

	@Override
	public String toString() {
		return "Passanger [pid=" + pid + ", pname=" + pname + ", paddr=" + paddr + "]";
	}
	
}
