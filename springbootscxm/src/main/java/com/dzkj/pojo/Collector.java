package com.dzkj.pojo;

/*
 *cid    --编号序列
  userid              --用户ID
  pid                --商品ID
 */
public class Collector {//收藏夹表
private int cid;
private int userid;
private int pid;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
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
public Collector() {
	super();
}

}
