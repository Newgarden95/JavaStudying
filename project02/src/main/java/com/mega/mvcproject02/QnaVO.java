package com.mega.mvcproject02;

//데이터 전달용 가방역할 클래스
public class QnaVO {
	private int qid;
	private String qtype;
	private String qtitle;
	private String qcontents;
	private String qdate;
	
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQtype() {
		return qtype;
	}
	public void setQtype(String qtype) {
		this.qtype = qtype;
	}
	public String getQtitle() {
		return qtitle;
	}
	public void setQtitle(String qtilte) {
		this.qtitle = qtitle;
	}
	public String getQcontents() {
		return qcontents;
	}
	public void setQcontents(String qcontents) {
		this.qcontents = qcontents;
	}
	public String getQdate() {
		return qdate;
	}
	public void setQdate(String qdate) {
		this.qdate = qdate;
	}
	
	
}
