package com.hhcf.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.hhcf.dao.WXUserInfoDao;
import com.hhcf.model.WXUserInfo;

/**
 * 
 * @Title: WXUserDaoImpl
 * @Description:
 * @Author: zhaotf
 * @Since:2017年3月8日 下午4:48:44
 * @Version:1.0
 */
@Repository
public class WXUserInfoDaoImpl implements WXUserInfoDao {

	@Autowired
	private MongoTemplate mongoTemplate;

	public void save(WXUserInfo entity) throws Exception {
		this.mongoTemplate.save(entity);
	}

	public void insert(WXUserInfo entity) throws Exception {
		this.mongoTemplate.insert(entity);
	}

	public WXUserInfo getByOpenId(String openid) throws Exception {
		Query query = new Query();
		query.addCriteria(new Criteria("openid").is(openid));
		return (WXUserInfo) this.mongoTemplate.findOne(query, WXUserInfo.class);
	}

	public void update(WXUserInfo entity) throws Exception {
		Query query = new Query();
		query.addCriteria(Criteria.where("openid").is(entity.getOpenid()));
		Update update = new Update();
		update.set("subscribe", Integer.valueOf(entity.getSubscribe()));
		update.set("nickname", entity.getNickname());
		update.set("sex", Integer.valueOf(entity.getSex()));
		update.set("city", entity.getCity());
		update.set("country", entity.getCountry());
		update.set("province", entity.getProvince());
		update.set("language", entity.getLanguage());
		update.set("headimgurl", entity.getHeadimgurl());
		update.set("subscribe_time", entity.getSubscribe_time());
		update.set("unionid", entity.getUnionid());
		update.set("remark", entity.getRemark());
		update.set("groupid", Integer.valueOf(entity.getGroupid()));
		update.set("tagid_list", entity.getTagid_list());
		this.mongoTemplate.updateFirst(query, update, WXUserInfo.class);
	}
}
