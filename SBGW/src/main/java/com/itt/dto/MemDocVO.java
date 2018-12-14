package com.itt.dto;

import java.util.Date;

public class MemDocVO {
	

	private int mDocNum;
	private String mNum;
	private String mDocTitle;
	private String mDocContent;
	private Date mDocReg_DT;
	
	public int getmDocNum() {
		return mDocNum;
	}
	public void setmDocNum(int mDocNum) {
		this.mDocNum = mDocNum;
	}
	public String getmNum() {
		return mNum;
	}
	public void setmNum(String mNum) {
		this.mNum = mNum;
	}
	public String getmDocTitle() {
		return mDocTitle;
	}
	public void setmDocTitle(String mDocTitle) {
		this.mDocTitle = mDocTitle;
	}
	public String getmDocContent() {
		return mDocContent;
	}
	public void setmDocContent(String mDocContent) {
		this.mDocContent = mDocContent;
	}
	public Date getmDocReg_DT() {
		return mDocReg_DT;
	}
	public void setmDocReg_DT(Date mDocReg_DT) {
		this.mDocReg_DT = mDocReg_DT;
	}
	
	@Override
	public String toString() {
		return "MemDocVO [mDocNum=" + mDocNum + ", mNum=" + mNum + ", mDocTitle=" + mDocTitle + ", mDocContent="
				+ mDocContent + ", mDocReg_DT=" + mDocReg_DT + "]";
	}
	
	
	
	


}
