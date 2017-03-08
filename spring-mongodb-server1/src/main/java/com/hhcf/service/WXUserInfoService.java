package com.hhcf.service;

import com.hhcf.model.WXUserInfo;

/**
 * 
 * @author 宗潇帅
 * @Title WXUserInfoService
 * @时间 2017-1-13下午1:21:15
 */
public interface WXUserInfoService {

	public WXUserInfo save(String name) throws Exception;

	public WXUserInfo insert(String name) throws Exception;

	public WXUserInfo getByOpenId(String name) throws Exception;
	
	public WXUserInfo update(String name) throws Exception;
}
