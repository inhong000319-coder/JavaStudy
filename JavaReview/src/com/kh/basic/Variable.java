package com.kh.basic;

public class Variable {

	public static void main(String[] args) {
		test1();

	}
	
	// 변수 : 데이터를 저장하는 공간
	
	// * 변수 선언 : 자료형 변수명;
	// * 값 대입 : 변수명 = 값;
	
	// 자료형 : 데이터의 모양과 크기 (종류)
	// "abc", "안녕", "1001"  --> String (문자열)
	// 100, 0, -22			----> int (정수), byte, short, long
	//10.55, 0/35/ -34.34 	-----> double (실수), float
	//'a', '김', '5' 		-----> char (문자형)
	// true, flase			-----> boolean (논리형)
	
	public static void test1() {
		//이름, 수학점수, 영어점수, 통과여부에 대한 데이터를 저장
		String name = "홍길동";
		int math = 70;
		int eng = 80;
		boolean isPassed = false;
		
		// 평균 점수를 구하기
		int avg = (math + eng) /2;
		//평균 점수가 60보다 큰 경우 통과
		isPassed = avg>60;
		
		System.out.println("이름 : " + name);
		System.out.print("수학 점수 : " + math + "\n");
		System.out.printf("영어 점수 : %d\n", eng);
		System.out.println("평균 : " + avg);
		
		System.out.println("통과 여부 : " + (isPassed ? "P" : "NP"));
		
	}

}
