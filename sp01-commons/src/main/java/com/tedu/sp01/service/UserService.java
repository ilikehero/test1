package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	//��ȡ�û�id
	User getUser(Integer id);
	//�����û���Ϣ
//	void addOrder(Order order);
	
	void addScore(Integer userId, Integer score);

}
