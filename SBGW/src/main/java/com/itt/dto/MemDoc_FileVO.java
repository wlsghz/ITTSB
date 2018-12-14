package com.itt.dto;

public class MemDoc_FileVO {
	

	private String mDocFileName;
	private int mDocNum;
	
	public String getmDocFileName() {
		return mDocFileName;
	}
	public void setmDocFileName(String mDocFileName) {
		this.mDocFileName = mDocFileName;
	}
	public int getmDocNum() {
		return mDocNum;
	}
	public void setmDocNum(int mDocNum) {
		this.mDocNum = mDocNum;
	}
	
	@Override
	public String toString() {
		return "MemDoc_FileVO [mDocFileName=" + mDocFileName + ", mDocNum=" + mDocNum + "]";
	}
	
	
	


}
