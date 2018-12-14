package com.itt.dto;

import java.util.Date;

public class TeamDoc_ReplyVO {

	private int tDoc_replNum;
	private String tDoc_replContent;
	private Date tDoc_replReg_DT;
	private String mNum;
	private int tDocNum;
	
	public int gettDoc_replNum() {
		return tDoc_replNum;
	}
	public void settDoc_replNum(int tDoc_replNum) {
		this.tDoc_replNum = tDoc_replNum;
	}
	public String gettDoc_replContent() {
		return tDoc_replContent;
	}
	public void settDoc_replContent(String tDoc_replContent) {
		this.tDoc_replContent = tDoc_replContent;
	}
	public Date gettDoc_replReg_DT() {
		return tDoc_replReg_DT;
	}
	public void settDoc_replReg_DT(Date tDoc_replReg_DT) {
		this.tDoc_replReg_DT = tDoc_replReg_DT;
	}
	public String getmNum() {
		return mNum;
	}
	public void setmNum(String mNum) {
		this.mNum = mNum;
	}
	public int gettDocNum() {
		return tDocNum;
	}
	public void settDocNum(int tDocNum) {
		this.tDocNum = tDocNum;
	}
	
	@Override
	public String toString() {
		return "TeamDoc_ReplyVO [tDoc_replNum=" + tDoc_replNum + ", tDoc_replContent=" + tDoc_replContent
				+ ", tDoc_replReg_DT=" + tDoc_replReg_DT + ", mNum=" + mNum + ", tDocNum=" + tDocNum + "]";
	}
	
}
