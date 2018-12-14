package com.itt.dto;

public class MemLevelVO {

	private int lvNum;
	private String mNum;
	private String lvName;
	
	public int getLvNum() {
		return lvNum;
	}
	public void setLvNum(int lvNum) {
		this.lvNum = lvNum;
	}
	public String getmNum() {
		return mNum;
	}
	public void setmNum(String mNum) {
		this.mNum = mNum;
	}
	public String getLvName() {
		return lvName;
	}
	public void setLvName(String lvName) {
		this.lvName = lvName;
	}
	
	@Override
	public String toString() {
		return "MemLevelVO [lvNum=" + lvNum + ", mNum=" + mNum + ", lvName=" + lvName + "]";
	}
	
}
