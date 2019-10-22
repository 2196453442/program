package com.dzkj.pojo;
//购物车表
public class ShopCart {
	private int number;   //序列号
	private int userid;   //用户id
	private int nums;     //数量
	private int pid ;     //商品id
	public int getNumber() {
		return number;
	}
	public ShopCart() {
		super();
	}
	public ShopCart(int number, int userid, int nums, int pid) {
		super();
		this.number = number;
		this.userid = userid;
		this.nums = nums;
		this.pid = pid;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getNums() {
		return nums;
	}
	public void setNums(int nums) {
		this.nums = nums;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
}
