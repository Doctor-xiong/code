package com.lyf.china.utils;

import com.mchange.v1.db.sql.ConnectionUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JDBCUtils {


	private static Properties prop = new Properties();
	private static String dbClassName;
	private static String dbUrl;
	private static String dbUser;
	private static String dbPwd;

	//ThreadLocal :保证一个线程中只能有一个连接.

	private static ThreadLocal<Connection> tl = new ThreadLocal<>();

	/**
	 * 静态的代码块读取db.properties
	 */
	static {
		try {
			//类加载器读取文件
			String path = "E:\\IDEA文件\\china_springboot\\src\\main\\resources\\application.properties";
			InputStream in = ConnectionUtils.class.getClassLoader().getResourceAsStream("../../../../main/resources/application.properties");
			prop.load(new FileInputStream(path));
			/*dbClassName = "com.mysql.cj.jdbc.Driver";
            dbUrl = "jdbc:mysql://localhost:3306/project?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false&serverTimezone=GMT%2B8";
            dbUser = "root";
            dbPwd = "123456";*/
			dbClassName = prop.getProperty("spring.datasource.driver-class-name");
			dbUrl = prop.getProperty("spring.datasource.url", dbUrl);
			dbUser = prop.getProperty("spring.datasource.username", dbUser);
			dbPwd = prop.getProperty("spring.datasource.password", dbPwd);

			Class.forName(dbClassName).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取连接的方法
	 */
	public static  Connection  getConn()  throws Exception{
		//先尝试从tl中获取
		Connection conn = tl.get();

		if(conn == null ) {
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPwd);
			tl.set(conn);
		}
		return conn ;
	}
	/**
	 * 关闭连接的方法
	 */
	public static void closeConn()  throws Exception{
		//先尝试从tl中获取

		Connection conn = tl.get();

		if(conn != null ) {
			conn.close();
		}

		tl.set(null);
	}

/*	public static void main(String[] args) throws Exception {
		Connection conn = getConn();
		System.out.println(conn);
		closeConn();
		Connection conn2 = getConn();

		System.out.println(conn == conn2);
	}*/

}