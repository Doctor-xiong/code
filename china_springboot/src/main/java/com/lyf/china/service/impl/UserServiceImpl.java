package com.lyf.china.service.impl;

import com.lyf.china.bean.User;
import com.lyf.china.dao.UserDao;
import com.lyf.china.dao.impl.UserDaoImpl;
import com.lyf.china.service.UserService;

public class UserServiceImpl implements UserService{

	private UserDao dao = new UserDaoImpl();
	//处理业务逻辑 登录和注册业务简单直接调用dao层就可以实现
	@Override
	public User login(User user) {
		return dao.getUserByUsernameAndPassword(user);
	}

	@Override
	public boolean regist(User user) {
		return dao.saveUser(user) > 0;
	}

}
