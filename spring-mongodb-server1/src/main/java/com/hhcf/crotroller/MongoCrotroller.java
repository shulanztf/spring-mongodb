package com.hhcf.crotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hhcf.service.WXUserInfoService;

/**
 * 
 * @Title: MongoCrotroller
 * @Description:mongodb 测试
 * @Author: zhaotf
 * @Since:2017年3月8日 下午5:15:49
 * @Version:1.0
 */
@Controller
@RequestMapping("/mongoCrotroller")
public class MongoCrotroller {

	@Autowired
	private WXUserInfoService wXUserInfoService;

	@RequestMapping("/save")
	@ResponseBody
	public Object save(String name) throws Exception {
		return wXUserInfoService.save(name);
	}

	@RequestMapping("/insert")
	@ResponseBody
	public Object insert(String name) throws Exception {
		return wXUserInfoService.insert(name);
	}

	@RequestMapping("/getByOpenId")
	@ResponseBody
	public Object getByOpenId(String name) throws Exception {
		return wXUserInfoService.getByOpenId(name);
	}

}
