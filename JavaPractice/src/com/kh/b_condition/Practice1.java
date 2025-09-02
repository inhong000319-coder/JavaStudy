package com.kh.b_condition;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. 입력\n");
		System.out.print("2. 수정\n");
		System.out.print("3. 조회\n");
		System.out.print("4. 삭제\n");
		System.out.print("7. 종료\n");
		
		System.out.print("메뉴 번호를 입력하세요 : " );
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
			default : 
				System.out.println("없는 메뉴입니다.");
			
		}
		sc.close();
	}

}
