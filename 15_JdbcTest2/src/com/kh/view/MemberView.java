package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.MemberController;
import com.kh.model.vo.Member;

public class MemberView {
	private Scanner sc = new Scanner(System.in);
	
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("===== 회원 관리 프로그램 =====");
			System.out.println("1. 회원 추가");
			System.out.println("2. 전체회원 조회");
			System.out.println("3. 회원 아이디로 검색");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원탈퇴");
			System.out.println("6. 회원이름으로 검색");
			System.out.println("0. 프로그램 종료");
			System.out.println("==메뉴 번호==");
			
			int menu = Integer.parseInt(sc.nextLine()); //enter 값 삭제(안전장치)
			
			switch(menu) {
			case 1:
				insertMember();
				break;
			case 2:
				selectList();
				break;
			case 3:
				selectById();
				break;
			case 4:
				updateMember();
				break;
			case 5:
				deleteMember();
				break;
			case 6:
				selectByName();
				break;
			case 0:
				System.out.println("프로그램 종료합니다.");
				return;
			default :
				System.out.println("올바른 번호가 아닙니다.");
			}
		}
	}
/**
 * 1번 화면 ~ 6번 화면 설계
 */
	private void insertMember() {
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String userPw = sc.nextLine();
		
		System.out.print("이름 : ");
		String userName = sc.nextLine();
		
		System.out.print("성별(M, F) : ");
		char gender = sc.nextLine().toUpperCase().charAt(0);
		
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		
		System.out.print("취미 : ");
		String hobby = sc.nextLine();
		
		// 회원가입 입력
		mc.insertMember(userId, userPw, userName, gender, age, email, address, phone, hobby);
		
		
	}
	private void selectList() {
		mc.selectList();
	}
	private void selectById() {
		System.out.print("조회할 아이디 : ");
		String userId = sc.nextLine();
		
		
		// 조회할 회원 아이디 입력 후 조회요청
		mc.selectById(userId);
	}
	private void updateMember() {
		System.out.println("===수정화면===");
		
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String userPw = sc.nextLine();
		
		System.out.print("이름 : ");
		String userName = sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		
		System.out.print("취미 : ");
		String hobby = sc.nextLine();
		
		// 수정 할 회원아이디와 수정 내용 입력 후 수정
		mc.updateById(userId, userPw, userName, address, phone, hobby);
	}
	private void deleteMember() {
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		
		mc.deleteById(userId);
	}
	private void selectByName() {
		System.out.print("이름 : ");
		String userName = sc.nextLine();
		
		// 추후 추가 예정
	}

	/**
	 * 서버에서 화면을 요청 했을 때 응답화면
	 */
	//성공메세지 출력하는 화면
	public void displaySuccess(String message){
		System.out.println("서비스 요청 성공 : " +message);
	}
	//실패메세지 출력하는 화면
	public void displayFailed(String message){
		System.out.println("서비스 요청 실패 : "+ message);
	}
	//조회결과가 없을 때 화면
	public void displayNoData(String message){
		System.out.println("데이터 요청 결과 : "+ message);
	}
	//전체회원 출력화면 : 
	public void displayMemberList(ArrayList<Member> list) {
		
		//일반 for 문
//		for(int i = 0; i < list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		//향상된 for 문
		for(Member m : list) {
			System.out.println(m.toString());
		}
	}
	//1명 회원출력:
	public void displayMember(Member m) {
		
		System.out.println("조회된 회원 : " + m.toString());
	}
	
	
	
	





}
