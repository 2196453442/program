package com.dzkj.pojo;
/*
 * id number NOT NULL primary key,           --编号序列
  country varchar2(30) DEFAULT NULL,        --商品出产地
  imgurl varchar2(100) DEFAULT NULL,        --商品图片路径
  did number DEFAULT NULL                   --
 */
public class Pramater {//商品详情表
private int id;
private String county;
private String imgurl;
private int did;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCounty() {
	return county;
}
public void setCounty(String county) {
	this.county = county;
}
public String getImgurl() {
	return imgurl;
}
public void setImgurl(String imgurl) {
	this.imgurl = imgurl;
}
public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public Pramater() {
	super();
}

}
