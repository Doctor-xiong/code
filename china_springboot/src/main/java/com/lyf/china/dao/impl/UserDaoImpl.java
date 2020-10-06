package com.lyf.china.dao.impl;

//import java.lang.Exception;

import com.lyf.china.bean.User;
import com.lyf.china.dao.UserBaseDao;
import com.lyf.china.dao.UserDao;
/*
 * 具体的对bs_user表的操作的实现
 * 	继承BaseDao：使用它的方法操作数据
 *
 * @author Administrator
 */


public class UserDaoImpl extends UserBaseDao<User> implements UserDao{

/*
 * 如果返回值是null，代表查询不到用户，登录失败
 * 如果不为null，查询成功
*/

	@Override
	public User getUserByUsernameAndPassword(User user){
		try{
			//sql可以确定时就写上
			String sql = "SELECT username , password FROM user WHERE username=? AND password=? ";
			//用户名和密码起始在用户提交登录请求servlet获取之后传过来的
			return this.getBean(sql, user.getUsername(),user.getPassword());
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	public User getUserByUsername(User user) throws Exception{
		//sql可以确定时就写上
		String sql = "SELECT username , password FROM user WHERE username=? ";
		//用户名和密码起始在用户提交登录请求servlet获取之后传过来的
		return this.getBean(sql, user.getUsername());
	}

	@Override
	public int saveUser(User user) {
		try {
			String sql = "INSERT INTO user(username , password, name, sex, department, workspace,email) VALUES(?,?,?,?,?,?,?)";
			// 返回更新的语句数量
			return this.update(sql,user.getUsername(), user.getPassword(), user.getName(), user.getSex(), user.getDepartment(), user.getWorkspace(), user.getEmail());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

}

