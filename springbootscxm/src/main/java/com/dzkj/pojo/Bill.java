package com.dzkj.pojo;

/*
 * bid           --账单编号
  bstatus        --账单状态
  bcz            --支付详情
  btime          --账单时间
  bprice         --账单金额
  user_uid       --用户ID
  bmoney         --用户余额
 */
public class Bill {//账单表
private int bid;
private int bstatus;
private String bcz;
private String btime;
private int bprice;
private int user_uid;
private int bmoney;
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public int getBstatus() {
	return bstatus;
}
public void setBstatus(int bstatus) {
	this.bstatus = bstatus;
}
public String getBcz() {
	return bcz;
}
public void setBcz(String bcz) {
	this.bcz = bcz;
}
public String getBtime() {
	return btime;
}
public void setBtime(String btime) {
	this.btime = btime;
}
public int getBprice() {
	return bprice;
}
public void setBprice(int bprice) {
	this.bprice = bprice;
}
public int getUser_uid() {
	return user_uid;
}
public void setUser_uid(int user_uid) {
	this.user_uid = user_uid;
}
public int getBmoney() {
	return bmoney;
}
public void setBmoney(int bmoney) {
	this.bmoney = bmoney;
}
public Bill() {
	super();
}

}
