package com.lyf.china.service;

import com.lyf.china.bean.User;

public interface UserService {

	User login(User user);
	boolean regist(User user);
}
