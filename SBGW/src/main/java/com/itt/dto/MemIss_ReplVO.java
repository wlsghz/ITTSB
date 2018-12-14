package com.itt.dto;

import java.util.Date;

public class MemIss_ReplVO {

	private int mIss_replNum;
	private String mIss_replContent;
	private Date mIss_replReg_DT;
	private String mNum;
	private int mIssNum;
	
	@Override
	public String toString() {
		return "MemIss_ReplVO [mIss_replNum=" + mIss_replNum + ", mIss_replContent=" + mIss_replContent
				+ ", mIss_replReg_DT=" + mIss_replReg_DT + ", mNum=" + mNum + ", mIssNum=" + mIssNum + "]";
	}
	
	public int getmIss_replNum() {
		return mIss_replNum;
	}
	public void setmIss_replNum(int mIss_replNum) {
		this.mIss_replNum = mIss_replNum;
	}
	public String getmIss_replContent() {
		return mIss_replContent;
	}
	public void setmIss_replContent(String mIss_replContent) {
		this.mIss_replContent = mIss_replContent;
	}
	public Date getmIss_replReg_DT() {
		return mIss_replReg_DT;
	}
	public void setmIss_replReg_DT(Date mIss_replReg_DT) {
		this.mIss_replReg_DT = mIss_replReg_DT;
	}
	public String getmNum() {
		return mNum;
	}
	public void setmNum(String mNum) {
		this.mNum = mNum;
	}
	public int getmIssNum() {
		return mIssNum;
	}
	public void setmIssNum(int mIssNum) {
		this.mIssNum = mIssNum;
	}
	
	
	
}
