package com.itt.dto;

import java.util.Date;

public class DepDocVO {

	private int dDocNum;
	private String dDocTitle;
	private String dDocContent;
	private Date dDocReg_DT;
	private int dNum;
	private String mNum;
	
	public int getdDocNum() {
		return dDocNum;
	}
	public void setdDocNum(int dDocNum) {
		this.dDocNum = dDocNum;
	}
	public String getdDocTitle() {
		return dDocTitle;
	}
	public void setdDocTitle(String dDocTitle) {
		this.dDocTitle = dDocTitle;
	}
	public String getdDocContent() {
		return dDocContent;
	}
	public void setdDocContent(String dDocContent) {
		this.dDocContent = dDocContent;
	}
	public Date getdDocReg_DT() {
		return dDocReg_DT;
	}
	public void setdDocReg_DT(Date dDocReg_DT) {
		this.dDocReg_DT = dDocReg_DT;
	}
	public int getdNum() {
		return dNum;
	}
	public void setdNum(int dNum) {
		this.dNum = dNum;
	}
	public String getmNum() {
		return mNum;
	}
	public void setmNum(String mNum) {
		this.mNum = mNum;
	}
	
	@Override
	public String toString() {
		return "DepDocVO [dDocNum=" + dDocNum + ", dDocTitle=" + dDocTitle + ", dDocContent=" + dDocContent
				+ ", dDocReg_DT=" + dDocReg_DT + ", dNum=" + dNum + ", mNum=" + mNum + "]";
	}
	
}
