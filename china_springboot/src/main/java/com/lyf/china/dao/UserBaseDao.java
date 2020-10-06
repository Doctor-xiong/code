package com.lyf.china.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.lyf.china.utils.JDBCUtils;

/**
 * 封装对数据库的基本操作
 * 	以后所有表的增删改查基本操作都是调用这里面的方法
 * @author liuyifan
 *
 */
public class UserBaseDao<T> {
	/**
	 * 数据库操作的工具类 DbUtils提供
	 */
	private QueryRunner runner = new QueryRunner();
	/**
	 * 泛型的类型  
	 */
	private Class<T> type;
	/**
	 * UserBaseDao是提供给其他的具体的dao继承的，不会直接创建它的对象
	 * UserDao extends UserBaseDao<User>
	 * BaseDao构造器以后只会被子类对象调用	
	 */
	public UserBaseDao() {
		//this代表子类对象
		//获取子类的类型  UserDao
		Class<? extends UserBaseDao> cla = this.getClass();
		//获取父类的类型    获取带参数的父类的类型   UserBaseDao<User>
		ParameterizedType pt = (ParameterizedType) cla.getGenericSuperclass();
		//获取类的泛型列表
		Type[] types = pt.getActualTypeArguments();
		//第一个位置就是需要的泛型
		type = (Class<T>) types[0];
		
	}
	/**
	 * 对数据库表增删改操作
	 * @param sql
	 * @param params
	 * @return
	 */
	public int update(String sql,Object...params) throws Exception{ // Object...params为动态参数
		Connection conn = JDBCUtils.getConn(); // 获取连接
		int update = 0;
		try {
			//返回影响了几条数据
			update = runner.update(conn, sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{ // 需要统一处理的代码，无论是否有异常都要执行的代码
			JDBCUtils.closeConn();
		}
		return update;
	}
	
	/**
	 * 查询一条记录并封装为对象的方法
	 * @param sql
	 * @param params
	 * @return
	 */
	public T getBean(String sql,Object...params) throws Exception{
		Connection conn = JDBCUtils.getConn();
		T t  = null;
		try {
			t = runner.query(conn, sql, new BeanHandler<>(type), params); // 执行无需参数的选择查询
			// 参数conn是数据库的连接对象，参数sql是查询的sql语句。
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//关闭资源
			JDBCUtils.closeConn();
		}
		return t;
	}
	/**
	 * 查询多条记录并封装为对象集合的方法
	 * @param sql
	 * @param params
	 * @return
	 */
	public List<T> getBeanList(String sql,Object...params) throws Exception{
		List<T> list = null;
		Connection conn = JDBCUtils.getConn();
		try {
			list = runner.query(conn, sql, new BeanListHandler<>(type), params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
