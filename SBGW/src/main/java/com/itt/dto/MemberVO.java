package com.itt.dto;

import java.io.File;
import java.util.Date;

public class MemberVO {

	private String mNum;
	private String mPwd;
	private File mImg;
	private String mState;
	private String mLv;
	private String mBir;
	private Date mJoin_DT;
	private Date mRetire_DT;
	private int dNum;
	private int tNum;
	
	@Override
	public String toString() {
		return "MemberVO [mNum=" + mNum + ", mPwd=" + mPwd + ", mImg=" + mImg + ", mState=" + mState + ", mLv=" + mLv
				+ ", mBir=" + mBir + ", mJoin_DT=" + mJoin_DT + ", mRetire_DT=" + mRetire_DT + ", dNum=" + dNum
				+ ", tNum=" + tNum + "]";
	}
	
	public String getmNum() {
		return mNum;
	}
	public void setmNum(String mNum) {
		this.mNum = mNum;
	}
	public String getmPwd() {
		return mPwd;
	}
	public void setmPwd(String mPwd) {
		this.mPwd = mPwd;
	}
	public File getmImg() {
		return mImg;
	}
	public void setmImg(File mImg) {
		this.mImg = mImg;
	}
	public String getmState() {
		return mState;
	}
	public void setmState(String mState) {
		this.mState = mState;
	}
	public String getmLv() {
		return mLv;
	}
	public void setmLv(String mLv) {
		this.mLv = mLv;
	}
	public String getmBir() {
		return mBir;
	}
	public void setmBir(String mBir) {
		this.mBir = mBir;
	}
	public Date getmJoin_DT() {
		return mJoin_DT;
	}
	public void setmJoin_DT(Date mJoin_DT) {
		this.mJoin_DT = mJoin_DT;
	}
	public Date getmRetire_DT() {
		return mRetire_DT;
	}
	public void setmRetire_DT(Date mRetire_DT) {
		this.mRetire_DT = mRetire_DT;
	}
	public int getdNum() {
		return dNum;
	}
	public void setdNum(int dNum) {
		this.dNum = dNum;
	}
	public int gettNum() {
		return tNum;
	}
	public void settNum(int tNum) {
		this.tNum = tNum;
	}
	
	
	
	
	
}
