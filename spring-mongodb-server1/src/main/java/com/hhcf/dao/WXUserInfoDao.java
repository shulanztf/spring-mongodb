package com.hhcf.dao;

import com.hhcf.model.WXUserInfo;

/**
 * 
 * @Title: WXBaseDao
 * @Description:
 * @Author: zhaotf
 * @Since:2017年3月8日 下午4:47:28
 * @Version:1.0
 */
public interface WXUserInfoDao {
	public void save(WXUserInfo paramWXUserInfo) throws Exception;

	public void insert(WXUserInfo paramWXUserInfo) throws Exception;

	public void update(WXUserInfo paramWXUserInfo) throws Exception;

	public WXUserInfo getByOpenId(String paramString) throws Exception;
}
