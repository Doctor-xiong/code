package com.lyf.china;

// import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import com.lyf.china.bean.User;
import com.lyf.china.dao.UserDao;
import com.lyf.china.dao.impl.UserDaoImpl;

public class TestUserDaoImpl {
	private UserDao dao = new UserDaoImpl();
	@Test
	public void testSave() {
		int i = dao.saveUser(new User(2, "刘一帆", "123456", "刘一帆", 1, "研究生部", null, "891524359@qq.com"));
		System.out.println(i);
	}
	@Test
	public void testQuery() {
		User user = dao.getUserByUsernameAndPassword(new User(null, "刘一帆", "123456", null, 1, null, null, null));
		System.out.println(user);
	}
}
