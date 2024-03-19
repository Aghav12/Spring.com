package com.BikkadIT.TicketBookingApp.response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ticket {

	private int tid;
	
	private String from;
	
	private String to;
	
	private String pnr;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	@Override
	public String toString() {
		return "Ticket [tid=" + tid + ", from=" + from + ", to=" + to + ", pnr=" + pnr + "]";
	}
	
	
}
