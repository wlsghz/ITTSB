package com.itt.dto;

import java.util.Date;

public class BoardReplyVO {

	private int bReplNum;
	private String bReplName;
	private Date bRepl_DT;
	private String mNum;
	private int bNum;
	
	@Override
	public String toString() {
		return "BoardReplyVO [bReplNum=" + bReplNum + ", bReplName=" + bReplName + ", bRepl_DT=" + bRepl_DT + ", mNum="
				+ mNum + ", bNum=" + bNum + "]";
	}
	
	public int getbReplNum() {
		return bReplNum;
	}
	public void setbReplNum(int bReplNum) {
		this.bReplNum = bReplNum;
	}
	public String getbReplName() {
		return bReplName;
	}
	public void setbReplName(String bReplName) {
		this.bReplName = bReplName;
	}
	public Date getbRepl_DT() {
		return bRepl_DT;
	}
	public void setbRepl_DT(Date bRepl_DT) {
		this.bRepl_DT = bRepl_DT;
	}
	public String getmNum() {
		return mNum;
	}
	public void setmNum(String mNum) {
		this.mNum = mNum;
	}
	public int getbNum() {
		return bNum;
	}
	public void setbNum(int bNum) {
		this.bNum = bNum;
	}
	
	
}
