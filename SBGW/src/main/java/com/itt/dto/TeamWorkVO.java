package com.itt.dto;

import java.util.Date;

public class TeamWorkVO {
	

	private int tWorkNum;
	private Date tWorkStart_DT;
	private Date tWorkEnd_DT;
	private String tWorkTitle;
	private String tWorkContent;
	private String tWorkLv;
	private int tNum;
	
	public int gettWorkNum() {
		return tWorkNum;
	}
	public void settWorkNum(int tWorkNum) {
		this.tWorkNum = tWorkNum;
	}
	public Date gettWorkStart_DT() {
		return tWorkStart_DT;
	}
	public void settWorkStart_DT(Date tWorkStart_DT) {
		this.tWorkStart_DT = tWorkStart_DT;
	}
	public Date gettWorkEnd_DT() {
		return tWorkEnd_DT;
	}
	public void settWorkEnd_DT(Date tWorkEnd_DT) {
		this.tWorkEnd_DT = tWorkEnd_DT;
	}
	public String gettWorkTitle() {
		return tWorkTitle;
	}
	public void settWorkTitle(String tWorkTitle) {
		this.tWorkTitle = tWorkTitle;
	}
	public String gettWorkContent() {
		return tWorkContent;
	}
	public void settWorkContent(String tWorkContent) {
		this.tWorkContent = tWorkContent;
	}
	public String gettWorkLv() {
		return tWorkLv;
	}
	public void settWorkLv(String tWorkLv) {
		this.tWorkLv = tWorkLv;
	}
	public int gettNum() {
		return tNum;
	}
	public void settNum(int tNum) {
		this.tNum = tNum;
	}
	
	@Override
	public String toString() {
		return "TeamWorkVO [tWorkNum=" + tWorkNum + ", tWorkStart_DT=" + tWorkStart_DT + ", tWorkEnd_DT=" + tWorkEnd_DT
				+ ", tWorkTitle=" + tWorkTitle + ", tWorkContent=" + tWorkContent + ", tWorkLv=" + tWorkLv + ", tNum="
				+ tNum + "]";
	}
	
	

}
