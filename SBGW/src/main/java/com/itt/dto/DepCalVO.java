package com.itt.dto;

import java.util.Date;

public class DepCalVO {
	

	private int dCalNum;
	private Date dCalStart_DT;
	private Date dCalEnd_DT;
	private String dCalTitle;
	private String dCalContent;
	private String dCalLv;
	private int dNum;
	
	public int getdCalNum() {
		return dCalNum;
	}
	public void setdCalNum(int dCalNum) {
		this.dCalNum = dCalNum;
	}
	public Date getdCalStart_DT() {
		return dCalStart_DT;
	}
	public void setdCalStart_DT(Date dCalStart_DT) {
		this.dCalStart_DT = dCalStart_DT;
	}
	public Date getdCalEnd_DT() {
		return dCalEnd_DT;
	}
	public void setdCalEnd_DT(Date dCalEnd_DT) {
		this.dCalEnd_DT = dCalEnd_DT;
	}
	public String getdCalTitle() {
		return dCalTitle;
	}
	public void setdCalTitle(String dCalTitle) {
		this.dCalTitle = dCalTitle;
	}
	public String getdCalContent() {
		return dCalContent;
	}
	public void setdCalContent(String dCalContent) {
		this.dCalContent = dCalContent;
	}
	public String getdCalLv() {
		return dCalLv;
	}
	public void setdCalLv(String dCalLv) {
		this.dCalLv = dCalLv;
	}
	public int getdNum() {
		return dNum;
	}
	public void setdNum(int dNum) {
		this.dNum = dNum;
	}
	
	@Override
	public String toString() {
		return "DepCalVO [dCalNum=" + dCalNum + ", dCalStart_DT=" + dCalStart_DT + ", dCalEnd_DT=" + dCalEnd_DT
				+ ", dCalTitle=" + dCalTitle + ", dCalContent=" + dCalContent + ", dCalLv=" + dCalLv + ", dNum=" + dNum
				+ "]";
	}
	
	


}
