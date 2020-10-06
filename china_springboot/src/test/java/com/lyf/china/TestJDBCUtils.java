package com.lyf.china;

// import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

import com.lyf.china.utils.JDBCUtils;


public class TestJDBCUtils {

	@Test
	public void test() throws Exception{
		Connection conn = JDBCUtils.getConn();
		System.out.println(conn);
		JDBCUtils.closeConn();
	}

}
