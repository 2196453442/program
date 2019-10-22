package com.dzkj.pojo;
/*
 * id             --序列
  userid          --用户id
  pid             --商品id
  foottime        --足迹时间
 */
public class Foot {//足迹表
private int id;
private int userid;
private int pid;
private String foottime;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getFoottime() {
	return foottime;
}
public void setFoottime(String foottime) {
	this.foottime = foottime;
}
public Foot() {
	super();
}


}
