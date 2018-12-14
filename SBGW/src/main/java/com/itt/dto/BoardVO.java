package com.itt.dto;

import java.util.Date;

public class BoardVO {

	private int bNum;
	private String bTitle;
	private String bContent;
	private String bCate;
	private String bFile;
	private Date bReg_DT;
	private int bCount;
	private String mNum;
	
	@Override
	public String toString() {
		return "BoardVO [bNum=" + bNum + ", bTitle=" + bTitle + ", bContent=" + bContent + ", bCate=" + bCate
				+ ", bFile=" + bFile + ", bReg_DT=" + bReg_DT + ", bCount=" + bCount + ", mNum=" + mNum + "]";
	}
	
	public int getbNum() {
		return bNum;
	}
	public void setbNum(int bNum) {
		this.bNum = bNum;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public String getbCate() {
		return bCate;
	}
	public void setbCate(String bCate) {
		this.bCate = bCate;
	}
	public String getbFile() {
		return bFile;
	}
	public void setbFile(String bFile) {
		this.bFile = bFile;
	}
	public Date getbReg_DT() {
		return bReg_DT;
	}
	public void setbReg_DT(Date bReg_DT) {
		this.bReg_DT = bReg_DT;
	}
	public int getbCount() {
		return bCount;
	}
	public void setbCount(int bCount) {
		this.bCount = bCount;
	}
	public String getmNum() {
		return mNum;
	}
	public void setmNum(String mNum) {
		this.mNum = mNum;
	}
	
	
	
}
