package com.inhatc.domain;

import java.sql.Date;

public class BoardVO {
	
	private Integer bno;
	private String title;
	private String content;
	private String writer;
	private int viewcnt;
	private Date regdate;
	public Integer getBno() {
		return bno;
	}
	public void setBno(Integer bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewCnt) {
		this.viewcnt = viewCnt;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", viewCnt="
				+ viewcnt + ", regdate=" + regdate + "]";
	}
	public BoardVO() {
		super();
	}

}