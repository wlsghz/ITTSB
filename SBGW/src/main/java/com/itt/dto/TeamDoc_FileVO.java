package com.itt.dto;

public class TeamDoc_FileVO {

	private String tDocFileName;
	private int tDocNum;
	
	public String gettDocFileName() {
		return tDocFileName;
	}
	public void settDocFileName(String tDocFileName) {
		this.tDocFileName = tDocFileName;
	}
	public int gettDocNum() {
		return tDocNum;
	}
	public void settDocNum(int tDocNum) {
		this.tDocNum = tDocNum;
	}
	
	@Override
	public String toString() {
		return "TeamDoc_FileVO [tDocFileName=" + tDocFileName + ", tDocNum=" + tDocNum + "]";
	}
	
}
