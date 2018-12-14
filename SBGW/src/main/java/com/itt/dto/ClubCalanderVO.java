package com.itt.dto;

import java.util.Date;

public class ClubCalanderVO {

	private int cCalNum;
	private Date cCalStart_DT;
	private Date cCalEnd_DT;
	private String cCalTitle;
	private String cCalContent;
	private int cNum;
	
	public int getcCalNum() {
		return cCalNum;
	}
	public void setcCalNum(int cCalNum) {
		this.cCalNum = cCalNum;
	}
	public Date getcCalStart_DT() {
		return cCalStart_DT;
	}
	public void setcCalStart_DT(Date cCalStart_DT) {
		this.cCalStart_DT = cCalStart_DT;
	}
	public Date getcCalEnd_DT() {
		return cCalEnd_DT;
	}
	public void setcCalEnd_DT(Date cCalEnd_DT) {
		this.cCalEnd_DT = cCalEnd_DT;
	}
	public String getcCalTitle() {
		return cCalTitle;
	}
	public void setcCalTitle(String cCalTitle) {
		this.cCalTitle = cCalTitle;
	}
	public String getcCalContent() {
		return cCalContent;
	}
	public void setcCalContent(String cCalContent) {
		this.cCalContent = cCalContent;
	}
	public int getcNum() {
		return cNum;
	}
	public void setcNum(int cNum) {
		this.cNum = cNum;
	}
	
	@Override
	public String toString() {
		return "ClubCalanderVO [cCalNum=" + cCalNum + ", cCalStart_DT=" + cCalStart_DT + ", cCalEnd_DT=" + cCalEnd_DT
				+ ", cCalTitle=" + cCalTitle + ", cCalContent=" + cCalContent + ", cNum=" + cNum + "]";
	}
	
}
