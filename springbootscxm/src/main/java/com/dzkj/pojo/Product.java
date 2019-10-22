package com.dzkj.pojo;
//产品表
public class Product {
	  private int  pid;//产品编号
	  private String  pname;//产品姓名
	  private int  price;//产品价格
	  private String imgurl;//产品图片路径
	  private int  inventory;//产品库存
	  private int smalltype_id;//商品类别ID
	  private String  chuchandi;//产品出厂地址
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public int getInventory() {
		return inventory;
	}
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	public int getSmalltype_id() {
		return smalltype_id;
	}
	public void setSmalltype_id(int smalltype_id) {
		this.smalltype_id = smalltype_id;
	}
	public String getChuchandi() {
		return chuchandi;
	}
	public void setChuchandi(String chuchandi) {
		this.chuchandi = chuchandi;
	}
	public Product(int pid, String pname, int price, String imgurl, int inventory, int smalltype_id, String chuchandi) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.imgurl = imgurl;
		this.inventory = inventory;
		this.smalltype_id = smalltype_id;
		this.chuchandi = chuchandi;
	}
	public Product() {
		super();
	}
	  
}
