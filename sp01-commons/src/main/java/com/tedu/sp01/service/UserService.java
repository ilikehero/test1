package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	//获取用户id
	User getUser(Integer id);
	//保存用户信息
//	void addOrder(Order order);
	
	void addScore(Integer userId, Integer score);

}
