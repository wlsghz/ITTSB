package com.itt.dto;

public class DepDoc_FileVO {

	private String dDocFileName;
	private int dDocNum;
	
	public String getdDocFileName() {
		return dDocFileName;
	}
	public void setdDocFileName(String dDocFileName) {
		this.dDocFileName = dDocFileName;
	}
	public int getdDocNum() {
		return dDocNum;
	}
	public void setdDocNum(int dDocNum) {
		this.dDocNum = dDocNum;
	}
	
	@Override
	public String toString() {
		return "DepDoc_FileVO [dDocFileName=" + dDocFileName + ", dDocNum=" + dDocNum + "]";
	}
	
}
