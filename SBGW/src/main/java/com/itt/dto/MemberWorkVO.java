package com.itt.dto;

import java.util.Date;

public class MemberWorkVO {
	

	private int mWorkNum;
	private Date mWorkStart_DT;
	private Date mWorkEnd_DT;
	private String mWorkTitle;
	private String mWorkContent;
	private String mWorkLv;
	private String mNum;
	
	public int getmWorkNum() {
		return mWorkNum;
	}
	public void setmWorkNum(int mWorkNum) {
		this.mWorkNum = mWorkNum;
	}
	public Date getmWorkStart_DT() {
		return mWorkStart_DT;
	}
	public void setmWorkStart_DT(Date mWorkStart_DT) {
		this.mWorkStart_DT = mWorkStart_DT;
	}
	public Date getmWorkEnd_DT() {
		return mWorkEnd_DT;
	}
	public void setmWorkEnd_DT(Date mWorkEnd_DT) {
		this.mWorkEnd_DT = mWorkEnd_DT;
	}
	public String getmWorkTitle() {
		return mWorkTitle;
	}
	public void setmWorkTitle(String mWorkTitle) {
		this.mWorkTitle = mWorkTitle;
	}
	public String getmWorkContent() {
		return mWorkContent;
	}
	public void setmWorkContent(String mWorkContent) {
		this.mWorkContent = mWorkContent;
	}
	public String getmWorkLv() {
		return mWorkLv;
	}
	public void setmWorkLv(String mWorkLv) {
		this.mWorkLv = mWorkLv;
	}
	public String getmNum() {
		return mNum;
	}
	public void setmNum(String mNum) {
		this.mNum = mNum;
	}
	
	@Override
	public String toString() {
		return "MemberWorkVO [mWorkNum=" + mWorkNum + ", mWorkStart_DT=" + mWorkStart_DT + ", mWorkEnd_DT="
				+ mWorkEnd_DT + ", mWorkTitle=" + mWorkTitle + ", mWorkContent=" + mWorkContent + ", mWorkLv=" + mWorkLv
				+ ", mNum=" + mNum + "]";
	}
	
	


}
