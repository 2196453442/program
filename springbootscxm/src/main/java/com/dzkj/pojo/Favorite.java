package com.dzkj.pojo;
/*
 * fid             --收藏编号
  pid              --商品ID
  pimg             --商品图片路径
  pname            --商品名
  pprice           --商品价格
 */
public class Favorite {//收藏夹表
private int fid;
private int pid;
private String  pimg;
private String  pname;
private int  pprice;
public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPimg() {
	return pimg;
}
public void setPimg(String pimg) {
	this.pimg = pimg;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPprice() {
	return pprice;
}
public void setPprice(int pprice) {
	this.pprice = pprice;
}
public Favorite() {
	super();
}

}
