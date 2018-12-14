package com.itt.dto;

import java.util.Date;

public class ClubVO {
	
	private int cNum;
	private String cName;
	private Date cReg_DT;
	private String cState;
	
	
	@Override
	public String toString() {
		return "ClubVO [cNum=" + cNum + ", cName=" + cName + ", cReg_DT=" + cReg_DT + ", cState=" + cState + "]";
	}
	
	public int getcNum() {
		return cNum;
	}
	public void setcNum(int cNum) {
		this.cNum = cNum;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Date getcReg_DT() {
		return cReg_DT;
	}
	public void setcReg_DT(Date cReg_DT) {
		this.cReg_DT = cReg_DT;
	}
	public String getcState() {
		return cState;
	}
	public void setcState(String cState) {
		this.cState = cState;
	}
	
	

}
