package com.itt.dto;

import java.util.Date;

public class ApprovalLineVO {

	private int aLineNum;
	private int aNum;
	private String mNum;
	private String aLineOrder;
	private Date aLineEnd_DT;
		
	@Override
	public String toString() {
		return "ApprovalLineVO [aLineNum=" + aLineNum + ", aNum=" + aNum + ", mNum=" + mNum + ", aLineOrder="
				+ aLineOrder + ", aLineEnd_DT=" + aLineEnd_DT + "]";
	}
	
	public int getaLineNum() {
		return aLineNum;
	}
	public void setaLineNum(int aLineNum) {
		this.aLineNum = aLineNum;
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
	public String getaLineOrder() {
		return aLineOrder;
	}
	public void setaLineOrder(String aLineOrder) {
		this.aLineOrder = aLineOrder;
	}
	public Date getaLineEnd_DT() {
		return aLineEnd_DT;
	}
	public void setaLineEnd_DT(Date aLineEnd_DT) {
		this.aLineEnd_DT = aLineEnd_DT;
	}
	
	
	
}
