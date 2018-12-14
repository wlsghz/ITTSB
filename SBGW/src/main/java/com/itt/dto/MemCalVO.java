package com.itt.dto;

import java.util.Date;

public class MemCalVO {
	

	private int mCalNum;
	private String mNum;
	private Date mCalStart_DT;
	private Date mCalEnd_DT;
	private String mCalTitle;
	private String mCalContent;
	
	public int getmCalNum() {
		return mCalNum;
	}
	public void setmCalNum(int mCalNum) {
		this.mCalNum = mCalNum;
	}
	public String getmNum() {
		return mNum;
	}
	public void setmNum(String mNum) {
		this.mNum = mNum;
	}
	public Date getmCalStart_DT() {
		return mCalStart_DT;
	}
	public void setmCalStart_DT(Date mCalStart_DT) {
		this.mCalStart_DT = mCalStart_DT;
	}
	public Date getmCalEnd_DT() {
		return mCalEnd_DT;
	}
	public void setmCalEnd_DT(Date mCalEnd_DT) {
		this.mCalEnd_DT = mCalEnd_DT;
	}
	public String getmCalTitle() {
		return mCalTitle;
	}
	public void setmCalTitle(String mCalTitle) {
		this.mCalTitle = mCalTitle;
	}
	public String getmCalContent() {
		return mCalContent;
	}
	public void setmCalContent(String mCalContent) {
		this.mCalContent = mCalContent;
	}
	
	@Override
	public String toString() {
		return "MemCalVO [mCalNum=" + mCalNum + ", mNum=" + mNum + ", mCalStart_DT=" + mCalStart_DT + ", mCalEnd_DT="
				+ mCalEnd_DT + ", mCalTitle=" + mCalTitle + ", mCalContent=" + mCalContent + "]";
	}

	
	
	

	
}
