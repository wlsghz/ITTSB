package com.itt.dto;

public class DepDoc_ReplFileVO {

	private String dDoc_replFileName;
	private int dDoc_replNum;
	
	public String getdDoc_replFileName() {
		return dDoc_replFileName;
	}
	public void setdDoc_replFileName(String dDoc_replFileName) {
		this.dDoc_replFileName = dDoc_replFileName;
	}
	public int getdDoc_replNum() {
		return dDoc_replNum;
	}
	public void setdDoc_replNum(int dDoc_replNum) {
		this.dDoc_replNum = dDoc_replNum;
	}
	
	@Override
	public String toString() {
		return "DepDoc_ReplFileVO [dDoc_replFileName=" + dDoc_replFileName + ", dDoc_replNum=" + dDoc_replNum + "]";
	}
	
}
