package com.itt.dto;

public class DepartMentVO {
	
	private int dNum;
	private String dName;
		
	@Override
	public String toString() {
		return "DepartMentVO [dNum=" + dNum + ", dName=" + dName + "]";
	}
	
	public int getdNum() {
		return dNum;
	}
	public void setdNum(int dNum) {
		this.dNum = dNum;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	
	

}
