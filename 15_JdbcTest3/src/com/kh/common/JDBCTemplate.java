package com.kh.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTemplate {
	/**
	 * 매번 MemberDao에서 반복적을 데이터베이스에 관련된 메소드를 모아서 정의하려고 한다.
	 * 공동으로 사용하기 때문에 static으로 메서도 정의
	 */
	
	//정적멤버함수에서 인스턴스 멤버변수는 참조 할 수 없다.	-- static 선언 이유
	//정적멤버변수 믈래스가 로드가 될 때 메모리에 저장 되고
	//인스턴스 멤버변수 클래스가 로드 될 때 만들어지는 것이 아닌, new 클래스 인스턴스 멤버변수가 만들어진다.
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static final String ID = "C##KH";
	private static final String PASSWORD = "KH";
	
	
	//정적멤버함수, 정적멤버변수 : MemberDao, ... Dao getConnection 이용하면 Connection 리턴
	
	/**
	 * Connection 객체 생성 메소드
	 * 데이터 베이스를 접속 후 Connection 객체를 반환
	 * @return 생성된 Connection 객체
	 */
	
	public static Connection getConnection() {
		Connection conn = null;
		
		
		
		try {
		Class.forName(DRIVER);
		
		conn = DriverManager.getConnection(URL, ID, PASSWORD);

		conn.setAutoCommit(false);
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}



/**
 *  데이터베이스에서 commit 처리를 해주는 메소드
 */
	public static void commit(Connection conn) {
		try {
			//conn null이 아니고, conn이 닫혀있지 않으면
		if(conn != null && !conn.isClosed()) {
			conn.commit();
		}
	} catch(SQLException e) {
		e.printStackTrace();
	}

}
	
	/**
	 * 데이터베이스에 rollback 처리해주는 메소드
	 * @param conn
	 */
	
	public static void rollback(Connection conn) {
		try {
			//conn null이 아니고, conn이 닫혀있지 않으면
		if(conn != null && !conn.isClosed()) {
			conn.rollback();
		}
	} catch(SQLException e) {
		e.printStackTrace();
	}
	}
	
	
	/**
	 * Connection 객체를 close 해주는 함수
	 * @param conn
	 */
	
	public static void close(Connection conn) {
		try {
			//conn null이 아니고, conn이 닫혀있지 않으면
		if(conn != null && !conn.isClosed()) {
			conn.close();
		}
	} catch(SQLException e) {
		e.printStackTrace();
	}
	}
	
	
	
	
	/**
	 * Statement와, 자식인 PreparedStatement인 인수로 받아서
	 * 해당된 객체를 반납한다.
	 * 부모객체참조 변수는 모든 자식객체 참조 변수를 받을 수 있다.
	 * @param stmt
	 */
	public static void close(Statement stmt) {
		try {
			//conn null이 아니고, conn이 닫혀있지 않으면
		if(stmt != null && !stmt.isClosed()) {
			stmt.close();
		}
	} catch(SQLException e) {
		e.printStackTrace();
	}
	}
	
	
	/**
	 * ResultSet 객체를 close 처리해주는 메소드
	 * @param rset
	 */
	
	public static void close(ResultSet rset) {
		try {
			//conn null이 아니고, conn이 닫혀있지 않으면
		if(rset != null && !rset.isClosed()) {
			rset.close();
		}
	} catch(SQLException e) {
		e.printStackTrace();
	}
	
}
}












