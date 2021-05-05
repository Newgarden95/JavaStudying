package com.mega.project;
//상품위치에 대한 데이터를 다룰 VO
public class ProductLocationVO {

	String pid;
	float platitude;
	float plongtitude;
	int pnum;
	String paddress;
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public float getPlatitude() {
		return platitude;
	}
	public void setPlatitude(float platitude) {
		this.platitude = platitude;
	}
	public float getPlongtitude() {
		return plongtitude;
	}
	public void setPlongtitude(float plongtitude) {
		this.plongtitude = plongtitude;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
}
