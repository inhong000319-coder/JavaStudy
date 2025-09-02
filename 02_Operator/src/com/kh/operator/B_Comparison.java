package com.kh.operator;

import java.util.Scanner;

public class B_Comparison {
	/*
	 *  비교 연산자 (이항 연산자)
	 *   : 두 값을 비교하는 연산자
	 *   : 연산 수행 결과는 true 또는 flase
	 *    - 조건을 만족하는 경우 true
	 *    - 조건을 만족하지 않는 경우 false
	 *    
	 *    * 대소 비교 연산자 : > < >= <=
	 *    * 동등 비교 연산자 : == !=
	 */

	public static void main(String[] args) {
		method1();
	}
	public static void method1() {
		// Scanner 준비시키기 [1] 포함시키기 [2] 준비하기(생성)
		Scanner sc = new Scanner(System.in);
		
		//정수 두 개를 입력받아 변수에 저장
		System.out.print("정수1 입력 : ");
		int n1 = sc.nextInt();
		
		System.out.print("정수 2 입력 : ");
		int n2 = sc.nextInt();
		
		System.out.printf("n1 : %d, n2 : %d\n", n1, n2);
		//System.out.println();
		
		System.out.println("첫번째 숫자와 두번째 숫자는 같은 값인가? " + (n1 == n2));
		System.out.println("첫번째 숫자가 두번째 5숫자보다 큰가?" + (n1 > n2));
		System.out.println("두번찌 숫자는 짝수인가? " + (n2 % 2 == 0));
		
		// 문자 --> 숫자와 매칭되어 있음  유니코드, ASCII코드
		System.out.println("두번째 숫자는 'A'의 유니코드인가? " + (n2 == 'A'));
				// + n2 == 65
				// * 'A' : 65 ~ 'Z' : 90
				
	}
}
