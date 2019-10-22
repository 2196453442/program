package com.dzkj.pojo;
/*userid                 -- 用户ID
uname        -- 用户名
uzname       -- 用户昵称
usex          -- 性别
birthday     -- 生日
tellphone    -- 电话
email         -- 邮箱
pwd             -- 密码
time             -- 注册时间
paypwd        -- 支付密码
imgurl      -- 头像路径
recharge 
*/
public class Users {//用户表
private int userid;
private String uname;
private String uzname;
private String usex;
private String birthday;
private String tellphone;
private String email;
private String pwd;
private String time;
private String paypwd;
private String imgurl;
private int recharge;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUzname() {
	return uzname;
}
public void setUzname(String uzname) {
	this.uzname = uzname;
}
public String getUsex() {
	return usex;
}
public void setUsex(String usex) {
	this.usex = usex;
}
public String getBirthday() {
	return birthday;
}
public void setBirthday(String birthday) {
	this.birthday = birthday;
}
public String getTellphone() {
	return tellphone;
}
public void setTellphone(String tellphone) {
	this.tellphone = tellphone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public String getPaypwd() {
	return paypwd;
}
public void setPaypwd(String paypwd) {
	this.paypwd = paypwd;
}
public String getImgurl() {
	return imgurl;
}
public void setImgurl(String imgurl) {
	this.imgurl = imgurl;
}

public int getRecharge() {
	return recharge;
}
public void setRecharge(int recharge) {
	this.recharge = recharge;
}
public Users() {
	super();
}

}
