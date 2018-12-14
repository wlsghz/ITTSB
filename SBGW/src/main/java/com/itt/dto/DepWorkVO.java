package com.itt.dto;

import java.util.Date;

public class DepWorkVO {
	

	private int dWorkNum;
	private Date dWorkStart_DT;
	private Date dWorkEnd_DT;
	private String dWorkTitle;
	private String dWorkContent;
	private String dWorkLv;
	private int dNum;
	
	public int getdWorkNum() {
		return dWorkNum;
	}
	public void setdWorkNum(int dWorkNum) {
		this.dWorkNum = dWorkNum;
	}
	public Date getdWorkStart_DT() {
		return dWorkStart_DT;
	}
	public void setdWorkStart_DT(Date dWorkStart_DT) {
		this.dWorkStart_DT = dWorkStart_DT;
	}
	public Date getdWorkEnd_DT() {
		return dWorkEnd_DT;
	}
	public void setdWorkEnd_DT(Date dWorkEnd_DT) {
		this.dWorkEnd_DT = dWorkEnd_DT;
	}
	public String getdWorkTitle() {
		return dWorkTitle;
	}
	public void setdWorkTitle(String dWorkTitle) {
		this.dWorkTitle = dWorkTitle;
	}
	public String getdWorkContent() {
		return dWorkContent;
	}
	public void setdWorkContent(String dWorkContent) {
		this.dWorkContent = dWorkContent;
	}
	public String getdWorkLv() {
		return dWorkLv;
	}
	public void setdWorkLv(String dWorkLv) {
		this.dWorkLv = dWorkLv;
	}
	public int getdNum() {
		return dNum;
	}
	public void setdNum(int dNum) {
		this.dNum = dNum;
	}
	
	@Override
	public String toString() {
		return "DepWorkVO [dWorkNum=" + dWorkNum + ", dWorkStart_DT=" + dWorkStart_DT + ", dWorkEnd_DT=" + dWorkEnd_DT
				+ ", dWorkTitle=" + dWorkTitle + ", dWorkContent=" + dWorkContent + ", dWorkLv=" + dWorkLv + ", dNum="
				+ dNum + "]";
	}
	
	
	


}
