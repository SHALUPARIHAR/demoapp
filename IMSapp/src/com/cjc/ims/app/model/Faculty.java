package com.cjc.ims.app.model;

public class Faculty {
	public Course getC() {
		return c;
	}
	public void setC(Course c) {
		this.c = c;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFacultyname() {
		return facultyname;
	}
	public void setFacultyname(String facultyname) {
		this.facultyname = facultyname;
	}
	private int fid;
	private String facultyname;
	private Course c;
	
	

}
