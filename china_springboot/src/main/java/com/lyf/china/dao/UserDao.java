package com.lyf.china.dao;

import com.lyf.china.bean.User;

/**
 * 约束对user表的操作
 * @author liuyifan
 *
 */
public interface UserDao {
	/**
	 * 根据账号密码查询user对象
	 * 
	 * @param user  封装了用户名和密码
	 * @return  返回值封装了用户所有的信息
	 */
	User getUserByUsernameAndPassword(User user);
	// User getUserByUsernameAndPassword(String username, String password);
	/**
	 * 
	 * @param user  封装了账号密码email
	 * @return  影响了几条数据，  <=0代表插入失败
	 */
	int saveUser(User user);
}
