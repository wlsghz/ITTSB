package com.itt.dto;

import java.util.Date;

public class TeamCalanderVO {
	

	private int tCalNum;
	private Date tCalStart_DT;
	private Date tCalEnd_DT;
	private String tCalTitle;
	private String tCalContent;
	private String tCalLv;
	private String tNum;
	
	public int gettCalNum() {
		return tCalNum;
	}
	public void settCalNum(int tCalNum) {
		this.tCalNum = tCalNum;
	}
	public Date gettCalStart_DT() {
		return tCalStart_DT;
	}
	public void settCalStart_DT(Date tCalStart_DT) {
		this.tCalStart_DT = tCalStart_DT;
	}
	public Date gettCalEnd_DT() {
		return tCalEnd_DT;
	}
	public void settCalEnd_DT(Date tCalEnd_DT) {
		this.tCalEnd_DT = tCalEnd_DT;
	}
	public String gettCalTitle() {
		return tCalTitle;
	}
	public void settCalTitle(String tCalTitle) {
		this.tCalTitle = tCalTitle;
	}
	public String gettCalContent() {
		return tCalContent;
	}
	public void settCalContent(String tCalContent) {
		this.tCalContent = tCalContent;
	}
	public String gettCalLv() {
		return tCalLv;
	}
	public void settCalLv(String tCalLv) {
		this.tCalLv = tCalLv;
	}
	public String gettNum() {
		return tNum;
	}
	public void settNum(String tNum) {
		this.tNum = tNum;
	}
	
	@Override
	public String toString() {
		return "TeamCalanderVO [tCalNum=" + tCalNum + ", tCalStart_DT=" + tCalStart_DT + ", tCalEnd_DT=" + tCalEnd_DT
				+ ", tCalTitle=" + tCalTitle + ", tCalContent=" + tCalContent + ", tCalLv=" + tCalLv + ", tNum=" + tNum
				+ "]";
	}

	
	
	

}
