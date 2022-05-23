package com.inhatc.domain;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class PageMaker {
	private int totalCount;
	private int startPage;
	private int endPage;
	private boolean prev;
	private boolean next;
	private Criteria cri;
	private int displayPageNum = 10;
	int a;
	
	private void calcData() {
		//endPage = (int) Math.ceil(totalCount / (double) cri.getPerPageNum());
		//startPage = (endPage - displayPageNum) + 1;
		a = cri.getPage();
	endPage = (int) (Math.ceil(a / (double) displayPageNum) * displayPageNum);

		startPage = (endPage - displayPageNum) + 1;

		    int tempEndPage = (int) (Math.ceil(totalCount / (double) cri.getPerPageNum()));
		    if (endPage > tempEndPage) {
   endPage = tempEndPage;
}
		prev = startPage == 1? false : true;
		next = endPage * cri.getPerPageNum() >= totalCount ? false:true;
	}
	
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		calcData();
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	public Criteria getCri() {
		return cri;
	}
	public void setCri(Criteria cri) {
		this.cri = cri;
	}
	public PageMaker() {
		super();
	}
	@Override
	public String toString() {
		return "pageMaker [totalCount=" + totalCount + ", startPage=" + startPage + ", endPage=" + endPage + ", prev="
				+ prev + ", next=" + next + ", cri=" + cri + "]";
	}
	
	public String makeQuery(int page) {

	    UriComponents uriComponents = UriComponentsBuilder.newInstance().queryParam("page", page)
	        .queryParam("perPageNum", cri.getPerPageNum()).build();

	    return uriComponents.toUriString();
	  }
	
	
}
