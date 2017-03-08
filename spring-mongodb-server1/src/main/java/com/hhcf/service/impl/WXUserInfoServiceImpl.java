package com.hhcf.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hhcf.dao.WXUserInfoDao;
import com.hhcf.model.WXUserInfo;
import com.hhcf.service.WXUserInfoService;

/**
 * 
 * @author 小帅帅丶 实现代码
 * @Title WXUserInfoServiceImpl
 * @时间 2017-1-13下午1:17:38
 */
@Service
public class WXUserInfoServiceImpl implements WXUserInfoService {
	private static final Logger logger = Logger.getLogger(WXUserInfoServiceImpl.class);
	@Autowired
	private WXUserInfoDao wxUserInfoDao;

	/**
	 * TODO
	 */
	public WXUserInfo save(String name) throws Exception {
		WXUserInfo entity = new WXUserInfo();
		entity.setNickname(name);
		entity.setCity("山东");
		entity.setCountry("辽宁");
		entity.setGroupid(157);
		entity.setSex(1);
		entity.setSubscribe_time("2017-15-23 32:23:13");
		this.wxUserInfoDao.save(entity);
		return entity;
	}

	public WXUserInfo insert(String name) throws Exception {
		WXUserInfo entity = new WXUserInfo();
		WXUserInfo wxUserInfo = getByOpenId(entity.getOpenid());
		try {
			if (wxUserInfo != null)
				this.wxUserInfoDao.update(entity);
			else
				this.wxUserInfoDao.insert(entity);
		} catch (Exception e) {
			logger.info("出错了     " + e.getMessage());
		}
		return entity;
	}

	public WXUserInfo getByOpenId(String openid) throws Exception {
		return this.wxUserInfoDao.getByOpenId(openid);
	}

	public WXUserInfo update(String name) throws Exception {
		WXUserInfo entity = new WXUserInfo();
		this.wxUserInfoDao.update(entity);
		return entity;
	}
}
