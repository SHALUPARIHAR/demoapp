package com.cjc.ims.app.model;

public class Batch {
    public Faculty getF() {
		return f;
	}
	public void setF(Faculty f) {
		this.f = f;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	private int bid;
    private String bname;
    private Faculty f;
    
}
