package com.cjc.ims.app.model;

public class Student {
     public Batch getB() {
		return b;
	}
	public void setB(Batch b) {
		this.b = b;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	 private int sid;
     private String sname;
     private Batch b;
     
}
