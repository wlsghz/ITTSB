package com.itt.dto;

import java.util.Date;

public class NoticeVO {
	
	private int nNum;
	private String nTitle;
	private String nContent;
	private String nFile;
	private Date nReg_DT;
	private int nCount;
	private String mNum;
		
	@Override
	public String toString() {
		return "NoticeVO [nNum=" + nNum + ", nTitle=" + nTitle + ", nContent=" + nContent + ", nFile=" + nFile
				+ ", nReg_DT=" + nReg_DT + ", nCount=" + nCount + ", mNum=" + mNum + "]";
	}
	
	public int getnNum() {
		return nNum;
	}
	public void setnNum(int nNum) {
		this.nNum = nNum;
	}
	public String getnTitle() {
		return nTitle;
	}
	public void setnTitle(String nTitle) {
		this.nTitle = nTitle;
	}
	public String getnContent() {
		return nContent;
	}
	public void setnContent(String nContent) {
		this.nContent = nContent;
	}
	public String getnFile() {
		return nFile;
	}
	public void setnFile(String nFile) {
		this.nFile = nFile;
	}
	public Date getnReg_DT() {
		return nReg_DT;
	}
	public void setnReg_DT(Date nReg_DT) {
		this.nReg_DT = nReg_DT;
	}
	public int getnCount() {
		return nCount;
	}
	public void setnCount(int nCount) {
		this.nCount = nCount;
	}
	public String getmNum() {
		return mNum;
	}
	public void setmNum(String mNum) {
		this.mNum = mNum;
	}
	
	

}
