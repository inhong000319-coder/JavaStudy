package com.kh.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class MapPractice {
	/*
	 *  * Map : 키-밸류 한쌍으로 데이터를 관리하는 구조
	 *  		- 키 : 중복 허용하지 않음 (Set 방식)
	 *  		- 밸류 : 키값이 중복되지 않는 경우 중복 허용 (List 방식)
	 */

	public static void main(String[] args) {
		
		//* {아이디 - 비밀번호} 데이터를 저장하는 Map 생성
		Map<String, String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("**** 로그인 시스템 ****");
			System.out.println("1. 회원가입");	// 데이터 추가(C)
			System.out.println("2. 로그인");	// 데이터 조회(R)
			System.out.println("3. 정보 수정");	// 데이터 수정(U)
			System.out.println("4. 회원 탈퇴");	// 데이터 삭제(D)
			System.out.println("9. 종료합니다.");
			System.out.println("메뉴 선택 : ");
			
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				//회원가입 => 아이디, 비밀번호를 입력받아서, Map 에 추가
				System.out.print("아이디를 입력하세요 : ");
				String id = sc.nextLine();
				
				System.out.print("비밀번호를 입력하세요 : ");
				String pwd = sc.nextLine();
				
				//Map 에 데이터 추가 : put(키값, 밸류값)
				map.put(id, pwd);
				
				System.out.println("회원가입에 성공했습니다.");
				break;
			case 2:
				//로그인 => 아이디, 비밀벊를 입력받아서
				//			[1] Map에 아이디(키값)가 있는 지 확인 -> 있으면 비밀번호를 비교
				//			--> 없으면 "아이디가 존재하지 않습니다.
				//          [2] Map에 아이디에 해당하는 비밀번호와 입력된 비밀번호가 일치하는 지 확인
				//			-> 일치 하면 "로그인 성공" --> 일치하지 않으면 "비밀번호가 잘못됐습니다."
				System.out.print("아이디 입력 : ");
				String id2 = sc.nextLine();
				
				if(map.containsKey(id2)) {
					//Map 에 입력된 아이디가 키값에 존재하는 이유
					System.out.print("비밀번호 입력 : ");
					String pwd2 = sc.nextLine();
					
					//Map 에서 아이디(키값)에 해당하는 비밀번호(밸류값)를 조회
					//	get(키값) : 밸류값
					if(map.get(id2).equals(pwd2)) {
						//입력된 비밀번호와 입력되어 있는 비밀번호가 일치하는 경우
						System.out.println("로그인 성공");
					} else {
						// 일치하지 않는 경우
						System.out.println("비밀번호가 잘못되었습니다.");
					}
				} else {
					// 존재하지 않는 경우
					System.out.println("아이디가 존재하지 않습니다.");
				}
				
				break;
			case 3:
				// 정보 수정
				// 아이디를 입력받아 Map 에 존재하는 경우 새로운 비밀번호를 입력받아 수정
				//				존재하지 않는 경우 "아이디가 존재하지 않습니다"
				System.out.print("아이디 입력 : ");
				String id3 = sc.nextLine();
				
				if(!map.containsKey(id3)) {
					//아이디가 존재하지 않는 경우
					System.out.println("아이디가 존재하지 않습니다.");
				} else {
					// 존재하는 경우
					System.out.print("새로운 비밀번호 입력 : ");
					String newPwd = sc.nextLine();
					
					// * put(키값, 밸류값) => 키값이 존재하는 경우, 밸류값을 덮어씌움
					map.put(id3, newPwd);
					
					System.out.println("수정 완료되었습니다.");
				}
				break;
			case 4:
				//회원 탈퇴
				// 아이디, 비밀번호를 입력받아 모두 일치하는 경우 탈퇴(삭제)
				//		하나라도 일치하지 않는 경우 탈퇴 실패 "회원 탈퇴에 실패했습니다."
				System.out.print("아이디 입력 : ");
				String id4 = sc.nextLine();
				
				if (!map.containsKey(id4)) {
					System.out.println("회원 탈퇴에 실패했습니다.");
				} else {
					System.out.println("비밀번호 입력 : ");
					String pwd4 = sc.nextLine();
					
					if(!map.get(id4).equals(pwd4)) {
						System.out.println(("회원탈퇴에 실패했습니다."));
					} else { 
						//아이디, 비밀번호가 모두 일치하는 경우
						
						//회원 탈퇴 => Map 에서 아이디에 해당하는 데이터를 삭제
						// remove(키값)
						map.remove(id4);
						System.out.println("회원 탈퇴에 성공했습니다.");
					}
				}
				
				break;
			case 9:
				//프로그램 종료
				return;
				default :
					System.out.println("잘못 선택했습니다. 다시 선택해주세요.");
					
			}
			
		}

	}

}
