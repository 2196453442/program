package com.dzkj.pojo;
/*
 * nid            --新闻ID
  ntype           --行为类别
  ntext           --新闻内容
  nimgurl         --新闻图片路径

 */
public class News {//新闻表
	private int nid;
	private String ntype;
	private String ntext;
	private String nimgurl;
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public String getNtype() {
		return ntype;
	}
	public void setNtype(String ntype) {
		this.ntype = ntype;
	}
	public String getNtext() {
		return ntext;
	}
	public void setNtext(String ntext) {
		this.ntext = ntext;
	}
	public String getNimgurl() {
		return nimgurl;
	}
	public void setNimgurl(String nimgurl) {
		this.nimgurl = nimgurl;
	}
	public News() {
		super();
	}
	

}
