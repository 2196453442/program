package com.dzkj.pojo;
/*
 * aid                  -- 地址表ID
  userid                  -- 对应用户ID
  consignee        -- 收货人
  tel              -- 电话号码
  sheng           -- 省份
  city            -- 城市
  county          -- 城区
  delivery     --详细地址
  state                   --默认状态
 */
public class Address {//地址表
private int aid;
private int userid;
private String consignee;
private String tel ;
private String sheng;
private String city;
private String county;
private String delivery;
private String state;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getConsignee() {
	return consignee;
}
public void setConsignee(String consignee) {
	this.consignee = consignee;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getSheng() {
	return sheng;
}
public void setSheng(String sheng) {
	this.sheng = sheng;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCounty() {
	return county;
}
public void setCounty(String county) {
	this.county = county;
}
public String getDelivery() {
	return delivery;
}
public void setDelivery(String delivery) {
	this.delivery = delivery;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public Address() {
	super();
}

}
