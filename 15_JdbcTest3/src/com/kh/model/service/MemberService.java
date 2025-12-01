package com.kh.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.common.JDBCTemplate;
import com.kh.model.dao.MemberDao;
import com.kh.model.vo.Member;

public class MemberService {
	/*
	 * 1) Connection 객체 생성
	 * 2) DML문 실행 후 commit, rollback을 처리
	 * 3) 데이터베이스에 관련된 Connection 객체를 반납
	 */

	public int insertMember(Member m) {
		Connection conn = JDBCTemplate.getConnection();
		
		//서비스에서 MembrDao를 부른다
		int result = new MemberDao().insertMember(conn, m);
		
		if(result > 0) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		return result;
	}
	
	public ArrayList<Member> selectList() {
		Connection conn = JDBCTemplate.getConnection();
		ArrayList<Member> list = new MemberDao().selectList(conn);
		
		JDBCTemplate.close(conn);
		return list;
	}
	
	public Member selectById(Member m) {
		Connection conn = JDBCTemplate.getConnection();
		ArrayList<Member> list = new MemberDao().selectList(conn);
		
		Member member = new MemberDao().selectById(conn, m);
		
		JDBCTemplate.close(conn);
		return member;
	}
	public int updateById(Member m) {
		Connection conn = JDBCTemplate.getConnection();
		int result = new MemberDao().updateById(conn, m);
		if(result >0) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);;
		}
		
		JDBCTemplate.close(conn);
		
		return result;
		
	}
	
	public int deleteById(Member m) {
		Connection conn = JDBCTemplate.getConnection();
		int result = new MemberDao().deleteById(conn, m);
		if(result >0) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);;
		}
		
		JDBCTemplate.close(conn);
		
		return 0;
	}
	
}
