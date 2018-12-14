package com.itt.dto;

import java.util.Date;

public class ClubMemberVO {

	private String cmNum;
	private Date cmJoin_DT;
	private String mNum;
	private int cNum;
	private int cNum2;
	
	
	@Override
	public String toString() {
		return "ClubMemberVO [cmNum=" + cmNum + ", cmJoin_DT=" + cmJoin_DT + ", mNum=" + mNum + ", cNum=" + cNum
				+ ", cNum2=" + cNum2 + "]";
	}
	public String getCmNum() {
		return cmNum;
	}
	public void setCmNum(String cmNum) {
		this.cmNum = cmNum;
	}
	public Date getCmJoin_DT() {
		return cmJoin_DT;
	}
	public void setCmJoin_DT(Date cmJoin_DT) {
		this.cmJoin_DT = cmJoin_DT;
	}
	public String getmNum() {
		return mNum;
	}
	public void setmNum(String mNum) {
		this.mNum = mNum;
	}
	public int getcNum() {
		return cNum;
	}
	public void setcNum(int cNum) {
		this.cNum = cNum;
	}
	public int getcNum2() {
		return cNum2;
	}
	public void setcNum2(int cNum2) {
		this.cNum2 = cNum2;
	}
	
	
	
}
