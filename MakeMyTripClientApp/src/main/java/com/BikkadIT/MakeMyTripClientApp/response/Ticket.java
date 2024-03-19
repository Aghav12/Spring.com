package com.BikkadIT.MakeMyTripClientApp.response;

public class Ticket {

	private int tid;

	private String tStatus;

	private String pnr;

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	private Double tAmount;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String gettStatus() {
		return tStatus;
	}

	public void settStatus(String tStatus) {
		this.tStatus = tStatus;
	}

	public Double gettAmount() {
		return tAmount;
	}

	public void settAmount(Double tAmount) {
		this.tAmount = tAmount;
	}

	@Override
	public String toString() {
		return "Ticket [tid=" + tid + ", tStatus=" + tStatus + ", pnr=" + pnr + ", tAmount=" + tAmount + "]";
	}
}
