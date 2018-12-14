package com.itt.dto;

import java.util.Date;

public class MemIssueVO {
	
	private int mIssNum;
	private String mIssState;
	private String mIssTitle;
	private String mIssContent;
	private Date mIssStart_DT;
	private Date mIssEnd_DT;
	
	@Override
	public String toString() {
		return "MemIssueVO [mIssNum=" + mIssNum + ", mIssState=" + mIssState + ", mIssTitle=" + mIssTitle
				+ ", mIssContent=" + mIssContent + ", mIssStart_DT=" + mIssStart_DT + ", mIssEnd_DT=" + mIssEnd_DT
				+ "]";
	}
	public int getmIssNum() {
		return mIssNum;
	}
	public void setmIssNum(int mIssNum) {
		this.mIssNum = mIssNum;
	}
	public String getmIssState() {
		return mIssState;
	}
	public void setmIssState(String mIssState) {
		this.mIssState = mIssState;
	}
	public String getmIssTitle() {
		return mIssTitle;
	}
	public void setmIssTitle(String mIssTitle) {
		this.mIssTitle = mIssTitle;
	}
	public String getmIssContent() {
		return mIssContent;
	}
	public void setmIssContent(String mIssContent) {
		this.mIssContent = mIssContent;
	}
	public Date getmIssStart_DT() {
		return mIssStart_DT;
	}
	public void setmIssStart_DT(Date mIssStart_DT) {
		this.mIssStart_DT = mIssStart_DT;
	}
	public Date getmIssEnd_DT() {
		return mIssEnd_DT;
	}
	public void setmIssEnd_DT(Date mIssEnd_DT) {
		this.mIssEnd_DT = mIssEnd_DT;
	}
	
	

}
