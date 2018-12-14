package com.itt.dto;

public class TeamVO {
	
	private int tNum;
	private String tName;
	private int dNum;
		
	@Override
	public String toString() {
		return "TeamVO [tNum=" + tNum + ", tName=" + tName + ", dNum=" + dNum + "]";
	}
	
	public int gettNum() {
		return tNum;
	}
	public void settNum(int tNum) {
		this.tNum = tNum;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public int getdNum() {
		return dNum;
	}
	public void setdNum(int dNum) {
		this.dNum = dNum;
	}
	
	

}
