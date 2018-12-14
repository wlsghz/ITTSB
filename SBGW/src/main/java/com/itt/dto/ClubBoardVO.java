package com.itt.dto;

import java.util.Date;

public class ClubBoardVO {

	private int cbNum;
	private String  mNum;
	private String cbTitle;
	private String cbContent;
	private Date cbReg_DT;
	private int cbCount;
	private int cNum;
	
	public int getCbNum() {
		return cbNum;
	}
	public void setCbNum(int cbNum) {
		this.cbNum = cbNum;
	}
	public String getmNum() {
		return mNum;
	}
	public void setmNum(String mNum) {
		this.mNum = mNum;
	}
	public String getCbTitle() {
		return cbTitle;
	}
	public void setCbTitle(String cbTitle) {
		this.cbTitle = cbTitle;
	}
	public String getCbContent() {
		return cbContent;
	}
	public void setCbContent(String cbContent) {
		this.cbContent = cbContent;
	}
	public Date getCbReg_DT() {
		return cbReg_DT;
	}
	public void setCbReg_DT(Date cbReg_DT) {
		this.cbReg_DT = cbReg_DT;
	}
	public int getCbCount() {
		return cbCount;
	}
	public void setCbCount(int cbCount) {
		this.cbCount = cbCount;
	}
	public int getcNum() {
		return cNum;
	}
	public void setcNum(int cNum) {
		this.cNum = cNum;
	}
	
	@Override
	public String toString() {
		return "ClubBoardVO [cbNum=" + cbNum + ", mNum=" + mNum + ", cbTitle=" + cbTitle + ", cbContent=" + cbContent
				+ ", cbReg_DT=" + cbReg_DT + ", cbCount=" + cbCount + ", cNum=" + cNum + "]";
	}
	
}
