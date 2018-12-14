package com.itt.dto;

public class AppRefVO {
	
	private int aRefNum;
	private int aNum;
	private String mNum;
		
	@Override
	public String toString() {
		return "AppRefVO [aRefNum=" + aRefNum + ", aNum=" + aNum + ", mNum=" + mNum + "]";
	}
	
	public int getaRefNum() {
		return aRefNum;
	}
	public void setaRefNum(int aRefNum) {
		this.aRefNum = aRefNum;
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
	
	

}
