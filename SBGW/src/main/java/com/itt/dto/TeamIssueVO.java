package com.itt.dto;

import java.util.Date;

public class TeamIssueVO {
	

	private int tIssNum;
	private String tIssState;
	private String tIssTitle;
	private String tIssContent;
	private Date tIssStart_DT;
	private Date tIssEnd_DT;
	private int tNum;
	private String tIssUrl;
	
	public int gettIssNum() {
		return tIssNum;
	}
	public void settIssNum(int tIssNum) {
		this.tIssNum = tIssNum;
	}
	public String gettIssState() {
		return tIssState;
	}
	public void settIssState(String tIssState) {
		this.tIssState = tIssState;
	}
	public String gettIssTitle() {
		return tIssTitle;
	}
	public void settIssTitle(String tIssTitle) {
		this.tIssTitle = tIssTitle;
	}
	public String gettIssContent() {
		return tIssContent;
	}
	public void settIssContent(String tIssContent) {
		this.tIssContent = tIssContent;
	}
	public Date gettIssStart_DT() {
		return tIssStart_DT;
	}
	public void settIssStart_DT(Date tIssStart_DT) {
		this.tIssStart_DT = tIssStart_DT;
	}
	public Date gettIssEnd_DT() {
		return tIssEnd_DT;
	}
	public void settIssEnd_DT(Date tIssEnd_DT) {
		this.tIssEnd_DT = tIssEnd_DT;
	}
	public int gettNum() {
		return tNum;
	}
	public void settNum(int tNum) {
		this.tNum = tNum;
	}
	public String gettIssUrl() {
		return tIssUrl;
	}
	public void settIssUrl(String tIssUrl) {
		this.tIssUrl = tIssUrl;
	}
	
	@Override
	public String toString() {
		return "TeamIssueVO [tIssNum=" + tIssNum + ", tIssState=" + tIssState + ", tIssTitle=" + tIssTitle
				+ ", tIssContent=" + tIssContent + ", tIssStart_DT=" + tIssStart_DT + ", tIssEnd_DT=" + tIssEnd_DT
				+ ", tNum=" + tNum + ", tIssUrl=" + tIssUrl + "]";
	}
	
	


}
