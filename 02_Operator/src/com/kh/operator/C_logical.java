package com.kh.operator;

import java.util.Scanner;

public class C_logical {
	/*
	 *  논리 연산자 (이항 연산자)
	 *  : 논리 값을 비교하는 연산자 (true, false)
	 *  : 결과값도 논리값
	 *  
	 *  * 종류 : && ||
	 *  
	 *   - AND연산 : &&
	 *     A && B : A, B 모두 true 여야 true
	 *     true && true => true
	 *     true && false => false
	 *     false && true => false
	 *     false && false => false
	 *     
	 *    - OR연산 : ||
	 *      A || B : A 또는 B 중에 하나라도 true 면 true
	 *      true || true => true
	 *      true || false => true
	 *      false || true => true
	 *      false || false => false
	 *      -----------
	 *      단축평가 (SCE)
	 *      - && 연산자 : 왼쪽(A) 조건이 false 라면 오른쪽(B) 연산이 수행되지 않음
	 *      - || 연산자 : 왼쪽(A) 조건이 true 라면 오른쪽(B) 연산이 수행되지 않음
	 */

	public static void main(String[] args) {
		//method1();
		method2();
	}
	
	public static void method1() {
		//입력받은 값이 1 ~ 10 사이의 값인 지 확인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		boolean result1 = num >= 1 && num <= 10;  // 1 <=num <= 10
				System.out.println("입력받은 값은 1~10 사이의 값인가? " + result1);
				
				//입력받은 값이 1 ~ 10 사이의 값이 아닌지 확인
				
				boolean result2 = num < 1 || num > 10;
				System.out.println("입력받은 값이 1~10 사이를 벗어나는가? " + result2);
	}

	public static void method2() {
		// 입력받은 문자가 소문자인지 학인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳을 입력 : ");
		String alpha = sc.nextLine();
		
		//* 문자엘에서 문자로 추출 메소드 : 무자열.charAt(위치) : char
		//  위치갑은 0부터 시작
		char chAlpha = alpha.charAt(0);
		
		boolean isSmall = chAlpha >= 'a'  &&  chAlpha <= 'z';
							// 65>= 97
				
				System.out.printf("%c 은 소문자인가? %b\n", chAlpha, isSmall );
				
		boolean isBig = chAlpha >= 'A' && chAlpha <= 'Z';
		System.out.printf("%c는 대문자 인가? %b", chAlpha, isBig);
	}
	
}
