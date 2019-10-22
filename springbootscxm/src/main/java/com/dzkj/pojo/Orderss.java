package com.dzkj.pojo;
/*
 * oid            --订单序列
  nums            --订单编号
  time            --订单时间
  id              --订单相对应的商品编号
  statu           --订单状态
  pid             --商品ID
  shuliang        --数量
  money           --金额
 */
public class Orderss {//订单表
private int oid;
private String nums;
private String time;
private int id;
private int statu;
private int pid;
private int shuliang;
private int money;
public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public String getNums() {
	return nums;
}
public void setNums(String nums) {
	this.nums = nums;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getStatu() {
	return statu;
}
public void setStatu(int statu) {
	this.statu = statu;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public int getShuliang() {
	return shuliang;
}
public void setShuliang(int shuliang) {
	this.shuliang = shuliang;
}
public int getMoney() {
	return money;
}
public void setMoney(int money) {
	this.money = money;
}
public Orderss() {
	super();
}

}
