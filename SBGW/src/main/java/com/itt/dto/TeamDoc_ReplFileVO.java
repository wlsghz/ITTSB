package com.itt.dto;

public class TeamDoc_ReplFileVO {

	private String tDoc_replFileName;
	private int tDoc_replNum;
	
	public String gettDoc_replFileName() {
		return tDoc_replFileName;
	}
	public void settDoc_replFileName(String tDoc_replFileName) {
		this.tDoc_replFileName = tDoc_replFileName;
	}
	public int gettDoc_replNum() {
		return tDoc_replNum;
	}
	public void settDoc_replNum(int tDoc_replNum) {
		this.tDoc_replNum = tDoc_replNum;
	}
	
	@Override
	public String toString() {
		return "TeamDoc_ReplFileVO [tDoc_replFileName=" + tDoc_replFileName + ", tDoc_replNum=" + tDoc_replNum + "]";
	}
	
}
