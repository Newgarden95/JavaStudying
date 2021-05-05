package com.mega.mvc42;

public class receiptVO {
	String com;
	String comType;
	String mouse;
	String mouseType;
	int total;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}
	public String getComType() {
		return comType;
	}
	public void setComType(String comType) {
		this.comType = comType;
	}
	public String getMouse() {
		return mouse;
	}
	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
	public String getMouseType() {
		return mouseType;
	}
	public void setMouseType(String mouseType) {
		this.mouseType = mouseType;
	}
	@Override
	public String toString() {
		return "receiptVO [com=" + com + ", comType=" + comType + ", mouse=" + mouse + ", mouseType=" + mouseType + "]";
	}
	
}
