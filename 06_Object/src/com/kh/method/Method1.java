package com.kh.method;

public class Method1 {
/*
 *  메소드 : 클래스 내부에 있는 함수(기능)
 *  
 *  [표현법]
 *  
 *  	[접근제한자] [예약어] 반환형 메소드병([매개변수]) {
 *  		// 수행할 내용(기능)
 *  	}
 */
	public static void main(String[] args) {
		System.out.println("=== 프로그램 시작 ===");
		
		hiEveryone(26);
		
		hiEveryone(20);
		
		// hiEveryone();	//=> 매개변수가 없는 hiEveryone 메소드는 존재하지 않음
		
		System.out.println("=== 프로그램 종료 ===");

	}
	
	public static void hiEveryone(int age) {
		// 반환형 : void => "결과 값이 없음"을 의미함.
		// 메소드명 : hiEveryone
		// 매개변수 정보 : 1개. 정수형 age 변수
		// => 메소드가 호출될 때 전달되는 값을 저장할 공간
		
		System.out.println("Hi, Everyone!");
		System.out.println("age : " + age);
	}

}
