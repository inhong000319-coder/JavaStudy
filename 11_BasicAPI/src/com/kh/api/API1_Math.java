package com.kh.api;

public class API1_Math {

	public static void main(String[] args) {
		//상수 필드
		System.out.println("파이 : " + Math.PI);
		
		//랜덤값 반환 : random()
		System.out.println("랜덤값 : " + Math.random());

		
		//절대값 알려주는 메소드 : abs
		int num = -123;
		System.out.println("절대값 : " + Math.abs(num));
		
		// 제곱값을 알려주는 메소드 : pow
		System.out.println("2의 10승 : " + Math.pow(2,  10));
		
		// 올림 : ceil
		double num2 = 12.49;
		System.out.println("올림 : " + Math.ceil(num2));
		
		//반올림 : round
		System.out.println("반올림 : " + Math.round(num2));
		
		//버림 : floor
		System.out.println("버림 : " + Math.floor(num2));
		// -----------
		// Math match = new Math();
		//=> 기본생성자가 private 으로 되어 있음! 객체 생성 불가
		
		/*
		 * Math 클래스
		 *  - 패키지 경로 : java.lang
		 *  
		 *  * 특징 : 모든 필드는 상수 필드, 모든 메소드는 static 메소드 생성자가 private 으로 되어 있어 생설 불가
		 *  
		 *  * 한 번만 메모리 영역에 올려놓고 재샤용하는 개념=>싱글톤 패턴
		 */
	}

}
