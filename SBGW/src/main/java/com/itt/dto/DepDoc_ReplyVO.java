package com.itt.dto;

import java.util.Date;

public class DepDoc_ReplyVO {

	private int dDoc_replNum;
	private String dDoc_replContent;
	private Date dDoc_replReg_DT;
	private String mNum;
	private int dDocNum;
	
	public int getdDoc_replNum() {
		return dDoc_replNum;
	}
	public void setdDoc_replNum(int dDoc_replNum) {
		this.dDoc_replNum = dDoc_replNum;
	}
	public String getdDoc_replContent() {
		return dDoc_replContent;
	}
	public void setdDoc_replContent(String dDoc_replContent) {
		this.dDoc_replContent = dDoc_replContent;
	}
	public Date getdDoc_replReg_DT() {
		return dDoc_replReg_DT;
	}
	public void setdDoc_replReg_DT(Date dDoc_replReg_DT) {
		this.dDoc_replReg_DT = dDoc_replReg_DT;
	}
	public String getmNum() {
		return mNum;
	}
	public void setmNum(String mNum) {
		this.mNum = mNum;
	}
	public int getdDocNum() {
		return dDocNum;
	}
	public void setdDocNum(int dDocNum) {
		this.dDocNum = dDocNum;
	}
	
	@Override
	public String toString() {
		return "DepDoc_ReplyVO [dDoc_replNum=" + dDoc_replNum + ", dDoc_replContent=" + dDoc_replContent
				+ ", dDoc_replReg_DT=" + dDoc_replReg_DT + ", mNum=" + mNum + ", dDocNum=" + dDocNum + "]";
	}
	
}
