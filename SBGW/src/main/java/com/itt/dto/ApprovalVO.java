package com.itt.dto;

import java.util.Date;

public class ApprovalVO {
	
	private int aNum;
	private String mNum;
	private int aFormNum;
	private String aSubmit;
	private String aCase;
	private int aLine;
	private String aState;
	private Date aReg_DT;
	private Date aEnd_DT;
	private String aIng;
		
	@Override
	public String toString() {
		return "ApprovalVO [aNum=" + aNum + ", mNum=" + mNum + ", aFormNum=" + aFormNum + ", aSubmit=" + aSubmit
				+ ", aCase=" + aCase + ", aLine=" + aLine + ", aState=" + aState + ", aReg_DT=" + aReg_DT + ", aEnd_DT="
				+ aEnd_DT + ", aIng=" + aIng + "]";
	}
	
	public int getaNum() {
		return aNum;
	}
	public void setaNum(int aNum) {
		this.aNum = aNum;
	}
	public String getmNum() {
		return mNum;
	}
	public void setmNum(String mNum) {
		this.mNum = mNum;
	}
	public int getaFormNum() {
		return aFormNum;
	}
	public void setaFormNum(int aFormNum) {
		this.aFormNum = aFormNum;
	}
	public String getaSubmit() {
		return aSubmit;
	}
	public void setaSubmit(String aSubmit) {
		this.aSubmit = aSubmit;
	}
	public String getaCase() {
		return aCase;
	}
	public void setaCase(String aCase) {
		this.aCase = aCase;
	}
	public int getaLine() {
		return aLine;
	}
	public void setaLine(int aLine) {
		this.aLine = aLine;
	}
	public String getaState() {
		return aState;
	}
	public void setaState(String aState) {
		this.aState = aState;
	}
	public Date getaReg_DT() {
		return aReg_DT;
	}
	public void setaReg_DT(Date aReg_DT) {
		this.aReg_DT = aReg_DT;
	}
	public Date getaEnd_DT() {
		return aEnd_DT;
	}
	public void setaEnd_DT(Date aEnd_DT) {
		this.aEnd_DT = aEnd_DT;
	}
	public String getaIng() {
		return aIng;
	}
	public void setaIng(String aIng) {
		this.aIng = aIng;
	}
	
	

}
