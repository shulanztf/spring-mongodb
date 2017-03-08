package com.hhcf.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @Title: WXUserInfo
 * @Description:mongodb 实体
 * @Author: zhaotf
 * @Since:2017年3月8日 下午4:46:03
 * @Version:1.0
 */
@Document(collection = "WXUserInfo")
public class WXUserInfo {

	private int subscribe;
	private String openid;
	private String nickname;
	private int sex;
	private String language;
	private String city;
	private String province;
	private String country;
	private String headimgurl;
	private String subscribe_time;
	private String unionid;
	private String remark;
	private int groupid;
	private List tagid_list;

	public int getSubscribe() {
		return this.subscribe;
	}

	public void setSubscribe(int subscribe) {
		this.subscribe = subscribe;
	}

	public String getOpenid() {
		return this.openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getSex() {
		return this.sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHeadimgurl() {
		return this.headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	public String getSubscribe_time() {
		return this.subscribe_time;
	}

	public void setSubscribe_time(String subscribe_time) {
		this.subscribe_time = subscribe_time;
	}

	public String getUnionid() {
		return this.unionid;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getGroupid() {
		return this.groupid;
	}

	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}

	public List getTagid_list() {
		return this.tagid_list;
	}

	public void setTagid_list(List tagid_list) {
		this.tagid_list = tagid_list;
	}

}
