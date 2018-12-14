package com.itt.dto;

public class DepIssueVO {
	

	private int dIssNum;
	private String dIssState;
	private String dIssTitle;
	private String dIssContent;
	private String dIssUrl;
	private int dNum;
	private int dIssStart_DT;
	private int dIssEnd_DT;
	
	public int getdIssNum() {
		return dIssNum;
	}
	public void setdIssNum(int dIssNum) {
		this.dIssNum = dIssNum;
	}
	public String getdIssState() {
		return dIssState;
	}
	public void setdIssState(String dIssState) {
		this.dIssState = dIssState;
	}
	public String getdIssTitle() {
		return dIssTitle;
	}
	public void setdIssTitle(String dIssTitle) {
		this.dIssTitle = dIssTitle;
	}
	public String getdIssContent() {
		return dIssContent;
	}
	public void setdIssContent(String dIssContent) {
		this.dIssContent = dIssContent;
	}
	public String getdIssUrl() {
		return dIssUrl;
	}
	public void setdIssUrl(String dIssUrl) {
		this.dIssUrl = dIssUrl;
	}
	public int getdNum() {
		return dNum;
	}
	public void setdNum(int dNum) {
		this.dNum = dNum;
	}
	public int getdIssStart_DT() {
		return dIssStart_DT;
	}
	public void setdIssStart_DT(int dIssStart_DT) {
		this.dIssStart_DT = dIssStart_DT;
	}
	public int getdIssEnd_DT() {
		return dIssEnd_DT;
	}
	public void setdIssEnd_DT(int dIssEnd_DT) {
		this.dIssEnd_DT = dIssEnd_DT;
	}
	
	@Override
	public String toString() {
		return "DepIssueVO [dIssNum=" + dIssNum + ", dIssState=" + dIssState + ", dIssTitle=" + dIssTitle
				+ ", dIssContent=" + dIssContent + ", dIssUrl=" + dIssUrl + ", dNum=" + dNum + ", dIssStart_DT="
				+ dIssStart_DT + ", dIssEnd_DT=" + dIssEnd_DT + "]";
	}
	
	
	
	
	
	


}
