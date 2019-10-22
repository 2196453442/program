package com.dzkj.pojo;

/*
 * eid                 --评价编号
  ename                --评价昵称
  etime                --评价时间
  etext                --评价内容
  product_pid          --评价商品ID
  estatus              --评价状态
 */
public class Evealuate {//评价表
	private int eid;
	private String ename;
	private String etime;
	private String etext;
	private int product_pid;
	private int estatus;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEtime() {
		return etime;
	}
	public void setEtime(String etime) {
		this.etime = etime;
	}
	public String getEtext() {
		return etext;
	}
	public void setEtext(String etext) {
		this.etext = etext;
	}
	public int getProduct_pid() {
		return product_pid;
	}
	public void setProduct_pid(int product_pid) {
		this.product_pid = product_pid;
	}
	public int getEstatus() {
		return estatus;
	}
	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
	public Evealuate() {
		super();
	}

}
