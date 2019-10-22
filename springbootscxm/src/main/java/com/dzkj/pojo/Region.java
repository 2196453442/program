package com.dzkj.pojo;
//地区表
public class Region {
	 private int  region_id ;//序列
	 private String region_code;//地区编号
	 private String region_name;//地区名
	 private int parent_id;//地区父类ID
	 private int region_level ;//地区等级
	 private int region_order ; //地区
	 private String region_name_en ;//地区拼音
	 private String region_shortname_en;//地区缩写名
	public int getRegion_id() {
		return region_id;
	}
	public void setRegion_id(int region_id) {
		this.region_id = region_id;
	}
	public String getRegion_code() {
		return region_code;
	}
	public void setRegion_code(String region_code) {
		this.region_code = region_code;
	}
	public String getRegion_name() {
		return region_name;
	}
	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}
	public int getRegion_level() {
		return region_level;
	}
	public void setRegion_level(int region_level) {
		this.region_level = region_level;
	}
	public int getRegion_order() {
		return region_order;
	}
	public void setRegion_order(int region_order) {
		this.region_order = region_order;
	}
	public String getRegion_name_en() {
		return region_name_en;
	}
	public void setRegion_name_en(String region_name_en) {
		this.region_name_en = region_name_en;
	}
	public String getRegion_shortname_en() {
		return region_shortname_en;
	}
	public void setRegion_shortname_en(String region_shortname_en) {
		this.region_shortname_en = region_shortname_en;
	}
	public Region(int region_id, String region_code, String region_name, int parent_id, int region_level,
			int region_order, String region_name_en, String region_shortname_en) {
		super();
		this.region_id = region_id;
		this.region_code = region_code;
		this.region_name = region_name;
		this.parent_id = parent_id;
		this.region_level = region_level;
		this.region_order = region_order;
		this.region_name_en = region_name_en;
		this.region_shortname_en = region_shortname_en;
	}
	public Region() {
		super();
	}
	 
}
