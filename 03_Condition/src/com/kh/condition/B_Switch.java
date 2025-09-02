package com.kh.condition;

import java.util.Scanner;

public class B_Switch {
	/*
	 * switch
	 * : if문과 동일한 조건문이지만, 동등비교를 통해 흐름을 제어
	 * : 실행할 코드만 실행하고 종료하기 위해선 break 를 사용
	 * 
	 * switch (비교대상) {
	 * 		case 값1: 
	 * 		//비교대상 == 값1 경우 실행할 내용
	 * 		break;
	 * 		case 값2:
	 * 		//실행할 내용
	 * 		[break;]	//생략 가능. 단, 아래 내용이 이어서 실행됨
	 * 		default:
	 * 			//모든 case에 해당되지 않을 때
	 * 			//실행할 내용
	 * 			[break;]
	 * }
	 */

	public static void main(String[] args) {
		method1();
	}
	
	public static void method1() {
		/* 정수를 입력받아 아래 조건에 맞게 출력
		 * 
		 * 1: 빨간색
		 * 2: 노란색
		 * 3: 파란색
		 * 그외: 초록색
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~3 사이의 정수 입력 : ");
		int n = sc.nextInt();
		
		// --> 비교 대상 : n (입력받은 값)
		switch(n) {
		case 1:
			System.out.println("빨간색");
			break;
		case 2:
			System.out.println("노란색");
			break;
		case 3:
			System.out.println("파란색");
			break;
			default : 
				System.out.println("초록색");
		}
	}

}
