package org.abhi.app5.shared.beans;

public class MyRecord {
	private long myId;
	private String infoField1;
	private String infoField2;
	public MyRecord() {
		super();
	}
	public MyRecord(long myId, String infoField1, String infoField2) {
		super();
		this.myId = myId;
		this.infoField1 = infoField1;
		this.infoField2 = infoField2;
	}
	public long getMyId() {
		return myId;
	}
	public void setMyId(long myId) {
		this.myId = myId;
	}
	public String getInfoField1() {
		return infoField1;
	}
	public void setInfoField1(String infoField1) {
		this.infoField1 = infoField1;
	}
	public String getInfoField2() {
		return infoField2;
	}
	public void setInfoField2(String infoField2) {
		this.infoField2 = infoField2;
	}
	@Override
	public String toString() {
		return "MyRecord [myId=" + myId + ", infoField1=" + infoField1
				+ ", infoField2=" + infoField2 + "]";
	}
	
}
