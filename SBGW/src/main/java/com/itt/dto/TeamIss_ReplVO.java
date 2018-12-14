package com.itt.dto;

import java.util.Date;

public class TeamIss_ReplVO {
	

	private int tIss_replNum;
	private String tIss_replContent;
	private Date tIss_replReg_DT;
	private int tIssNum;
	private String mNum;
	
	public int gettIss_replNum() {
		return tIss_replNum;
	}
	public void settIss_replNum(int tIss_replNum) {
		this.tIss_replNum = tIss_replNum;
	}
	public String gettIss_replContent() {
		return tIss_replContent;
	}
	public void settIss_replContent(String tIss_replContent) {
		this.tIss_replContent = tIss_replContent;
	}
	public Date gettIss_replReg_DT() {
		return tIss_replReg_DT;
	}
	public void settIss_replReg_DT(Date tIss_replReg_DT) {
		this.tIss_replReg_DT = tIss_replReg_DT;
	}
	public int gettIssNum() {
		return tIssNum;
	}
	public void settIssNum(int tIssNum) {
		this.tIssNum = tIssNum;
	}
	public String getmNum() {
		return mNum;
	}
	public void setmNum(String mNum) {
		this.mNum = mNum;
	}
	
	@Override
	public String toString() {
		return "TeamIss_ReplVO [tIss_replNum=" + tIss_replNum + ", tIss_replContent=" + tIss_replContent
				+ ", tIss_replReg_DT=" + tIss_replReg_DT + ", tIssNum=" + tIssNum + ", mNum=" + mNum + "]";
	}
	
	
	


}
