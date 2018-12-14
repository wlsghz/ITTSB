package com.itt.dto;

import java.util.Date;

public class MemberInfoVO {

	private int mInfoNum;
	private String mInfoAdd;
	private String mInfoEmail;
	private String mInfoPhone;
	private Date mInfoRest_DT;
	private Date mInfoReturn_DT;
	private String mNum;
	
	public int getmInfoNum() {
		return mInfoNum;
	}
	public void setmInfoNum(int mInfoNum) {
		this.mInfoNum = mInfoNum;
	}
	public String getmInfoAdd() {
		return mInfoAdd;
	}
	public void setmInfoAdd(String mInfoAdd) {
		this.mInfoAdd = mInfoAdd;
	}
	public String getmInfoEmail() {
		return mInfoEmail;
	}
	public void setmInfoEmail(String mInfoEmail) {
		this.mInfoEmail = mInfoEmail;
	}
	public String getmInfoPhone() {
		return mInfoPhone;
	}
	public void setmInfoPhone(String mInfoPhone) {
		this.mInfoPhone = mInfoPhone;
	}
	public Date getmInfoRest_DT() {
		return mInfoRest_DT;
	}
	public void setmInfoRest_DT(Date mInfoRest_DT) {
		this.mInfoRest_DT = mInfoRest_DT;
	}
	public Date getmInfoReturn_DT() {
		return mInfoReturn_DT;
	}
	public void setmInfoReturn_DT(Date mInfoReturn_DT) {
		this.mInfoReturn_DT = mInfoReturn_DT;
	}
	public String getmNum() {
		return mNum;
	}
	public void setmNum(String mNum) {
		this.mNum = mNum;
	}
	
	@Override
	public String toString() {
		return "MemberInfoVO [mInfoNum=" + mInfoNum + ", mInfoAdd=" + mInfoAdd + ", mInfoEmail=" + mInfoEmail
				+ ", mInfoPhone=" + mInfoPhone + ", mInfoRest_DT=" + mInfoRest_DT + ", mInfoReturn_DT=" + mInfoReturn_DT
				+ ", mNum=" + mNum + "]";
	}
	
}
