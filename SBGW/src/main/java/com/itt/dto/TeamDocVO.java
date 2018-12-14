package com.itt.dto;

import java.util.Date;

public class TeamDocVO {
	

	private int tDocNum;
	private String tDocTitle;
	private String tDocContent;
	private Date tDocReg_DT;
	private int tNum;
	private int mNum;
	public int gettDocNum() {
		return tDocNum;
	}
	public void settDocNum(int tDocNum) {
		this.tDocNum = tDocNum;
	}
	public String gettDocTitle() {
		return tDocTitle;
	}
	public void settDocTitle(String tDocTitle) {
		this.tDocTitle = tDocTitle;
	}
	public String gettDocContent() {
		return tDocContent;
	}
	public void settDocContent(String tDocContent) {
		this.tDocContent = tDocContent;
	}
	public Date gettDocReg_DT() {
		return tDocReg_DT;
	}
	public void settDocReg_DT(Date tDocReg_DT) {
		this.tDocReg_DT = tDocReg_DT;
	}
	public int gettNum() {
		return tNum;
	}
	public void settNum(int tNum) {
		this.tNum = tNum;
	}
	public int getmNum() {
		return mNum;
	}
	public void setmNum(int mNum) {
		this.mNum = mNum;
	}
	
	@Override
	public String toString() {
		return "TeamDocVO [tDocNum=" + tDocNum + ", tDocTitle=" + tDocTitle + ", tDocContent=" + tDocContent
				+ ", tDocReg_DT=" + tDocReg_DT + ", tNum=" + tNum + ", mNum=" + mNum + "]";
	}
	
	
	
	


}
