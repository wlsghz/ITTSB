package com.itt.dto;

public class MsgReceiveVO {

	private int msgRecNum;
	private int msgNum;
	private String mNum;
	private String msgRec_Multi;
	
	public int getMsgRecNum() {
		return msgRecNum;
	}
	public void setMsgRecNum(int msgRecNum) {
		this.msgRecNum = msgRecNum;
	}
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
	public String getMsgRec_Multi() {
		return msgRec_Multi;
	}
	public void setMsgRec_Multi(String msgRec_Multi) {
		this.msgRec_Multi = msgRec_Multi;
	}
	
	@Override
	public String toString() {
		return "MsgReceiveVO [msgRecNum=" + msgRecNum + ", msgNum=" + msgNum + ", mNum=" + mNum + ", msgRec_Multi="
				+ msgRec_Multi + "]";
	}
	
	
	


}
