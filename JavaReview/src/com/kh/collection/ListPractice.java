package com.kh.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListPractice {
	/*
	 * 컬렉션 : 자바에서 제공하는 자료구조 기반의 프레임워크
	 * 
	 * 		- 자료구조 : 데이터를 효율적으로 관리하는 방법들
	 * 		- 프레임워크 : 기능을 쉽게 사용할 수 있도록 만들어놓은 틀
	 * 
	 * - 종류 : List, Set, Map
	 * 
	 * 		* List : 저장 순서가 유지되고, 중복을 허용
	 * 		* Set  : 저장 순서가 유지되지 않고, 중복을 허용하지 않음
	 * 		* Map  : 키-밸류 한쌍으로 데이터를 관리
	 * 				 키 값은 중복될 수 없음
	 */

	public static void main(String[] args) {
		// 제네릭 : 타입을 지정할 수 있는 방법
		// => 타입을 강제화할 수 있음. 클래스형변환도 생략.
		
		List<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("===== TODO LIST =====");
		System.out.println("1. 할 일 추가");
		System.out.println("2. 전체보기");
		System.out.println("9. 종료하기");
		
		System.out.print(" 선택 : ");
		int menu = sc.nextInt();
		sc.nextLine();		// 버퍼 비운다는 뜻
		
		
		switch(menu) {
		case 1:
			System.out.print("추가할 할일 입력 : ");
			String todo = sc.nextLine();
			
			list.add(todo);		//리스트에 할일 추가
			break;
		case 2:
			System.out.println("---- 전체 목록 ----");
			
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
				
			}
			break;
		case 9:
			System.out.println("종료합니다");
			//break; //=> switch 만 빠져나옴. 종료X
			return;		//메소드 자체를 종료시킴
			default:
				System.out.println("없는 메뉴입니다. 다시 선택해주세요.");
		}

	}

}
}
