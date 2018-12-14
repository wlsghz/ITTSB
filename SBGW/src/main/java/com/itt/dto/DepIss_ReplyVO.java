package com.itt.dto;

import java.util.Date;

public class DepIss_ReplyVO {

	private int dIss_replNum;
	private String dIss_replContent;
	private Date dIss_replReg_DT;
	private int dIssNum;
	private String mNum;
	
	public int getdIss_replNum() {
		return dIss_replNum;
	}
	public void setdIss_replNum(int dIss_replNum) {
		this.dIss_replNum = dIss_replNum;
	}
	public String getdIss_replContent() {
		return dIss_replContent;
	}
	public void setdIss_replContent(String dIss_replContent) {
		this.dIss_replContent = dIss_replContent;
	}
	public Date getdIss_replReg_DT() {
		return dIss_replReg_DT;
	}
	public void setdIss_replReg_DT(Date dIss_replReg_DT) {
		this.dIss_replReg_DT = dIss_replReg_DT;
	}
	public int getdIssNum() {
		return dIssNum;
	}
	public void setdIssNum(int dIssNum) {
		this.dIssNum = dIssNum;
	}
	public String getmNum() {
		return mNum;
	}
	public void setmNum(String mNum) {
		this.mNum = mNum;
	}
	
	@Override
	public String toString() {
		return "DepIss_ReplyVO [dIss_replNum=" + dIss_replNum + ", dIss_replContent=" + dIss_replContent
				+ ", dIss_replReg_DT=" + dIss_replReg_DT + ", dIssNum=" + dIssNum + ", mNum=" + mNum + "]";
	}
	
	
	
	
	


}
