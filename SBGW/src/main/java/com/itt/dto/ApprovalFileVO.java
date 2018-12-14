package com.itt.dto;

public class ApprovalFileVO {

	private int aFileNum;
	private int aNum;
	private String aFileName;
	
	@Override
	public String toString() {
		return "ApprovalFileVO [aFileNum=" + aFileNum + ", aNum=" + aNum + ", aFileName=" + aFileName + "]";
	}
	
	public int getaFileNum() {
		return aFileNum;
	}
	public void setaFileNum(int aFileNum) {
		this.aFileNum = aFileNum;
	}
	public int getaNum() {
		return aNum;
	}
	public void setaNum(int aNum) {
		this.aNum = aNum;
	}
	public String getaFileName() {
		return aFileName;
	}
	public void setaFileName(String aFileName) {
		this.aFileName = aFileName;
	}
	
	
	
}
