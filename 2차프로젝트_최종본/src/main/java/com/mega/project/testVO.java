package com.mega.project;

import java.sql.Date;

public class testVO {
	String userid;
	int pnum;
	String liked;
	java.util.Date time2;
	String pname;
	String price;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public String getLiked() {
		return liked;
	}
	public void setLiked(String liked) {
		this.liked = liked;
	}
	public java.util.Date getTime2() {
		return time2;
	}
	public void setTime2(java.util.Date time2) {
		this.time2 = time2;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "testVO [userid=" + userid + ", pnum=" + pnum + ", liked=" + liked + ", time2=" + time2 + ", pname="
				+ pname + ", price=" + price + "]";
	}
	
	
}
