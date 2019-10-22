package com.dzkj.pojo;
/*
 *piid                      --信息编号
  piname                    --名称
  nikname                   --昵称
  sex                       --性别
  birthday                  --生日
  tel                       --电话
  email                     --邮箱
  user_uid                  --用户ID
  piimgurl                  --图片路径
 */
public class Pinformation {//个人信息表
	private int piid;
	private String piname;
	private String nikname;
	private String sex;
	private String birthday;
	private String tel;
	private String email;
	private int user_uid;
	private String piimgurl;
	public int getPiid() {
		return piid;
	}
	public void setPiid(int piid) {
		this.piid = piid;
	}
	public String getPiname() {
		return piname;
	}
	public void setPiname(String piname) {
		this.piname = piname;
	}
	public String getNikname() {
		return nikname;
	}
	public void setNikname(String nikname) {
		this.nikname = nikname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getUser_uid() {
		return user_uid;
	}
	public void setUser_uid(int user_uid) {
		this.user_uid = user_uid;
	}
	public String getPiimgurl() {
		return piimgurl;
	}
	public void setPiimgurl(String piimgurl) {
		this.piimgurl = piimgurl;
	}
	public Pinformation() {
		super();
	}
	

}
