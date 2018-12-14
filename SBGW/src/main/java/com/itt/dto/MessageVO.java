package com.itt.dto;

import java.util.Date;

public class MessageVO {
	
	private int msgNum;
	private String mNum;
	private Date msgSend_DT;
	private String msgCount;
	private String msgRec;
	
	public int getMsgNum() {
		return msgNum;
	}
	public void setMsgNum(int msgNum) {
		this.msgNum = msgNum;
	}
	public String getmNum() {
		return mNum;
	}
	public void setmNum(String mNum) {
		this.mNum = mNum;
	}
	public Date getMsgSend_DT() {
		return msgSend_DT;
	}
	public void setMsgSend_DT(Date msgSend_DT) {
		this.msgSend_DT = msgSend_DT;
	}
	public String getMsgCount() {
		return msgCount;
	}
	public void setMsgCount(String msgCount) {
		this.msgCount = msgCount;
	}
	public String getMsgRec() {
		return msgRec;
	}
	public void setMsgRec(String msgRec) {
		this.msgRec = msgRec;
	}
	
	@Override
	public String toString() {
		return "MessageVO [msgNum=" + msgNum + ", mNum=" + mNum + ", msgSend_DT=" + msgSend_DT + ", msgCount="
				+ msgCount + ", msgRec=" + msgRec + "]";
	}
	
	
	
	
	
}
