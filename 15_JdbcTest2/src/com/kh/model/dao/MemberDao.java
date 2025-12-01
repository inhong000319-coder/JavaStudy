package com.kh.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.kh.model.vo.Member;

public class MemberDao {
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static final String ID = "C##KH";
	private static final String PASSWORD = "KH";
	
	/**
	 * 사용자가 입력한 정보들을 DB에 추가하는 메소드(회원정보 추가)
	 * @param m 사용자 정보가 있는 Member 객체
	 * @return insert 쿼리문을 수행하고 처리된 row수
	 * kdj	create 2025.09.23
	 */
	public int insertMember(Connection conn, Member m) {
//		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		int result = 0;
	
		try {
			// 1. 오라클 드라이버를 로드
			Class.forName(DRIVER);
			// 2. 오라클 접속 요청
			conn = DriverManager.getConnection(URL, ID, PASSWORD);
			// 3. 트랜잭션 제어 사용자 설정
			conn.setAutoCommit(false);
			
			
			// 4. sql
			String sql = "INSERT INTO MEMBER "
					+ "VALUES (SEQ_USERNO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			
			// 5. statement 생성
			//stmt = conn.createStatement();
			
			// 수정.
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, m.getUserId());
			pstmt.setString(2, m.getUserPw());
			pstmt.setString(3, m.getUserName());
			pstmt.setString(4, Character.valueOf(m.getGender()).toString());
			pstmt.setInt(5, m.getAge());
			pstmt.setString(6, m.getEmail());
			pstmt.setString(7, m.getAddress());
			pstmt.setString(8, m.getPhone());
			pstmt.setString(9, m.getHobby());
			
			
			//6. statement 통해서 쿼리문 실행
			result = pstmt.executeUpdate();
			//7. commit, rollback
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		
	} finally {
		try {
			// 자원반납
			if(conn != null) {
			conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(pstmt != null) {
			pstmt.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		return result;
	}
	
	/**
	 * 사용자가 요청한 회원정보 리스트를 가져오는 메소드(회원정보 전체 추출)
	 * @return 회원정보 리스트를 리턴
	 */

	public ArrayList<Member> selectList(){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		// ResultSet -> 반복문 -> Member -> list.add(Member)
		ArrayList<Member> list = new ArrayList<Member>();
		//1. 오라클 드라이버 로드
		try {
			Class.forName(DRIVER);
			// 2. 오라클 접속
			conn = DriverManager.getConnection(URL,  ID, PASSWORD);
			// 3. 트랜잭션 설정 
			conn.setAutoCommit(false);
			// 4. statement 생성
			stmt = conn.createStatement();
			// 5. select 쿼리문 생성
			String sql = "SELECT * FROM MEMBER";
			// 6. 쿼리문 실행
			rset = stmt.executeQuery(sql);
			// 7. ResultSet에 있는 각 레코드 객체를 추출해서 Member 객체를 만들고, ArrayList list.add(member)
			while(rset.next()) {
				char gender = rset.getString("GENDER") == null ? ' ' : rset.getString("GENDER").charAt(0);
				Member m = new Member(
						rset.getInt("USERNO"),
						rset.getString("USERID"), 
						rset.getString("USERPW"),
						rset.getString("USERNAME"), 
						gender, 
						rset.getInt("AGE"), 
						rset.getString("EMAIL"),
						rset.getString("ADDRESS"), 
						rset.getString("PHONE"), 
						rset.getString("HOBBY")
						);
				list.add(m);
				
			}//End Of While
			
		} catch (ClassNotFoundException e ) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				rset.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	
		
		return list;
	}
	
	public Member selectById(Member m) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		// ResultSet -> 반복문 -> Member -> list.add(Member)
		Member member = null;
		//1. 오라클 드라이버 로드
		try {
			Class.forName(DRIVER);
			// 2. 오라클 접속
			conn = DriverManager.getConnection(URL,  ID, PASSWORD);
			// 3. 트랜잭션 설정 
			conn.setAutoCommit(false);
			// 4. statement 생성
			stmt = conn.createStatement();
			// 5. select 쿼리문 생성
			String sql = "SELECT * FROM MEMBER WHERE USERID = '"+m.getUserId()+"'";
			// 6. 쿼리문 실행
			rset = stmt.executeQuery(sql);
			
			// 7. ResultSet에 있는 각 레코드 객체를 추출해서 Member 객체를 만들고
			if(rset.next()) {
				char gender = rset.getString("GENDER") == null ? ' ' : rset.getString("GENDER").charAt(0);
				member = new Member(
						rset.getInt("USERNO"),
						rset.getString("USERID"), 
						rset.getString("USERPW"),
						rset.getString("USERNAME"), 
						gender, 
						rset.getInt("AGE"), 
						rset.getString("EMAIL"),
						rset.getString("ADDRESS"), 
						rset.getString("PHONE"), 
						rset.getString("HOBBY")
						);
				
			}// End Of If
			
		} catch (ClassNotFoundException e ) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			// 8. 객체 반납
			try {
				rset.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return member;
	}
	
	public int updateById(Member m) {
		Connection conn = null;
		PreparedStatement pstmt = null;
	
		try {
			Class.forName(DRIVER);
			
			conn = DriverManager.getConnection(URL, ID, PASSWORD);
			
			conn.setAutoCommit(false);
			
//			String sql = "UPDATE MEMBER SET" +  
//			"USERPW = '" +m.getUserPw()+"'," +
//			"USERNAME = '"+m.getUserName()+"', " + 
//			"ADDRESS = '"+m.getAddress()+"', " +
//			"PHONE = '"+m.getPhone()+"', " + 
//			"HOBBY = '"+m.getHobby()+ "' " +
//			"WHERE USERID = '"+m.getUserId()+ "' ";
			String sql = "UPDATE MEMBER SET USERPW=?, USERNAME=?, ADDRESS=?, PHONE=?, HOBBY=?, WHERE USERID =?";
			
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, m.getUserPw());
			pstmt.setString(2, m.getUserName());
			pstmt.setString(3, m.getAddress());
			pstmt.setString(4, m.getPhone());
			pstmt.setString(5, m.getHobby());
			pstmt.setString(6, m.getUserId());
			
			int count = pstmt.executeUpdate();
			
			if(count >0) {
				conn.commit();
			}else {
				conn.rollback();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		
	} finally {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return 0;
		
	}
	
	public int deleteById(Member m) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		
		try {
		Class.forName(DRIVER);
		
		conn = DriverManager.getConnection(URL, ID, PASSWORD);
		
		conn.setAutoCommit(false);
		
		stmt = conn.createStatement();
		
		String sql = "DELETE FROM MEMBER WHERE USERID = '"+m.getUserId()+"'";
		
		int count = stmt.executeUpdate(sql);
		
		if(count >0) {
			conn.commit();
			System.out.println(">>삭제 성공");
		} else {
			conn.rollback();
			System.out.println(">>삭제 실패");
		}
		
		}catch (Exception e) {
			e.printStackTrace();
	} finally {
		try {
			if(conn != null) {
			conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(stmt != null) {
			stmt.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		return result;
	}
}
