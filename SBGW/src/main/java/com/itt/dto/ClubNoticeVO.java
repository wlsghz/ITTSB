package com.itt.dto;

import java.util.Date;

public class ClubNoticeVO {

	private int cnNum;
	private String cnTitle;
	private String cnContent;
	private Date cnReg_DT;
	private int cNum;
	
	public int getCnNum() {
		return cnNum;
	}
	public void setCnNum(int cnNum) {
		this.cnNum = cnNum;
	}
	public String getCnTitle() {
		return cnTitle;
	}
	public void setCnTitle(String cnTitle) {
		this.cnTitle = cnTitle;
	}
	public String getCnContent() {
		return cnContent;
	}
	public void setCnContent(String cnContent) {
		this.cnContent = cnContent;
	}
	public Date getCnReg_DT() {
		return cnReg_DT;
	}
	public void setCnReg_DT(Date cnReg_DT) {
		this.cnReg_DT = cnReg_DT;
	}
	public int getcNum() {
		return cNum;
	}
	public void setcNum(int cNum) {
		this.cNum = cNum;
	}
	
	@Override
	public String toString() {
		return "ClubNoticeVO [cnNum=" + cnNum + ", cnTitle=" + cnTitle + ", cnContent=" + cnContent + ", cnReg_DT="
				+ cnReg_DT + ", cNum=" + cNum + "]";
	}
	
}
