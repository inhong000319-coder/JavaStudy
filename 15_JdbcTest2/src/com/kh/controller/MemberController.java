package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.dao.MemberDao;
import com.kh.model.vo.Member;
import com.kh.view.MemberView;

// view 에서 controller 에게 요청 하는 방법
// controller 는 요청을 받아 어떻게 MemberDao를 부르는 지, 
// MemberDao 에서 작업한 결과값을 어떻게 리턴값을 받는지, 
// Controller 에서 리턴 받는값을 어떻게 View 에게 전달하는지 
public class MemberController {
	
	/**
	 * 사용자로부터(View 클래수로부터) 회원가입요청을 받는다.
	 * MemberDao 에게 가입 요청을 하고 (매개변수 전달), 가입에 대한 결과를 리턴 받는다.
	 * @param 매개변수... 값을 전부 제공받는다.
	 */
	
	public void insertMember(String userId, String userPw, String userName, char gender,int  age, String email, String address, String phone, String hobby) {
		Member m = new Member();
		m.setUserId(userId);
		m.setUserPw(userPw);
		m.setUserName(userName);
		m.setGender(gender);
		m.setAge(age);
		m.setEmail(email);
		m.setAddress(address);
		m.setPhone(phone);
		m.setHobby(hobby);
		
		int result = new MemberDao().insertMember(m);
		
		if(result > 0) {
			new MemberView().displaySuccess(userName + "님 회원가입이 성공하였습니다.");
		} else {
			new MemberView().displaySuccess("회원가입 실패");
			//회원가입 실패
		}
		
		
	}
	public void selectList() {
		ArrayList<Member> list = new MemberDao().selectList();
		
		if(list.isEmpty()) {
			new MemberView().displayNoData("보여줄 회원정보가 없습니다.");
		}else {

			new MemberView().displayMemberList(list);
		}
		
	}
	
	public void selectById(String userId) {
		Member m = new Member();
		m.setUserId(userId);;
		
		Member member = new MemberDao().selectById(m);
		
		if(member == null) {
			new MemberView().displayNoData("보여줄 정보가 없습니다.");
		}else {

			new MemberView().displaySuccess(userId + "님의 정보" + member);
		}
		
	}
	public void updateById(String userId, String userPw, String userName, String address, String phone, String hobby) {
		Member m = new Member();
		m.setUserId(userId);
		m.setUserPw(userPw);
		m.setUserName(userName);
		m.setAddress(address);
		m.setPhone(phone);
		m.setHobby(hobby);
		
		int result = new MemberDao().updateById(m);
		
		if(result > 0) {
			new MemberView().displaySuccess(userName +"님 회원정보 수정이 성공했습니다.");
		} else {

			new MemberView().displayFailed(userName +"님 회원정보 수정이 실패했습니다.");
		}
		
		
	}
	public void deleteById(String userID) {
		Member m = new Member();
		m.setUserId(userID);
		
		int result = new MemberDao().deleteById(m);
		if(result > 0) {
			new MemberView().displaySuccess(userID +"님 회원정보 삭제가 성공했습니다.");
		} else {

			new MemberView().displayFailed(userID +"님 회원정보 삭제가 실패했습니다.");
			
		}
	}
}



