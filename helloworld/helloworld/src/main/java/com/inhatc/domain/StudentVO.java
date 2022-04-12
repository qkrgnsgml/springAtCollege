package com.inhatc.domain;



public class StudentVO {
	private String studentid;
	private String cellphone;
	private String studentname;
	private String email;
	private String address;
	public String getStudentid() {
		return studentid;
	}
	public StudentVO() {
		super();
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "StudentVO [studentid=" + studentid + ", cellphone=" + cellphone + ", studentname=" + studentname
				+ ", email=" + email + ", address=" + address + "]";
	}
	public StudentVO(String studentid, String cellphone, String studentname, String email, String address) {
		super();
		this.studentid = studentid;
		this.cellphone = cellphone;
		this.studentname = studentname;
		this.email = email;
		this.address = address;
	}
	
	
}
