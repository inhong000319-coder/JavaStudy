package com.kh;

public class Variable {
	//자바 프로그램 실행 시 반드시 필요한 것!
	public static void main(String[] args) {
		printVariable();  //해당 메소드 출력 안하려면 주석 추가 -> //printVariable();
		declareVariable();
		// printVariable 메소드 호출(실행)
	}
	
	public static void printVariable() {
		/*
		 * 변수의 목적 ? 데이터를 저장하기 위한 공간
		 *  - 가독성 증가
		 *  - 개발자의 실수를 줄일 수 있음
		 *  - 재사용성 증가
		 *  - 유지보수 좋아짐
		 */
		
		// 월급 = 시급 * 근무시간 * 근무일수
		// 출력형식 -> xxx : 0000원
		// * 2025년 최저시급 : 10030원 + 200원
		
		System.out.println("홍길동 : " + (10230*8*5) + "원");
		System.out.println("아이유 : " + (10230*6*5) + "원");
		System.out.println("진 : " + (10230*15*28) + "원");
		System.out.println("유재석 : " + (10230*20*31) + "원");
		
		System.out.println();
		//변수를 사용하여 시급에 대한 부분을 변경해보자.
		//*2025년 최저시급 : 10030 -> 숫자, 정수형
		//int = pay;  //변수 선언
		int pay = 10030;  // 변수 선언 및 초기화
		pay = pay + 500; // int pay = 10530;
		
		System.out.println("홍길동 : " + (pay*8*5) + "원");
		System.out.println("아이유 : " + (pay*6*5) + "원");
		System.out.println("진 : " + (pay*15*28) + "원");
		System.out.println("유재석 : " + (pay*20*31) + "원");
		
		
	}
	
	public static void declareVariable() {
		/*
		 * 변수 선언 : 값을 저장하기 위한 변수를 메모리 공간에 할당하는 것
		 * 
		 * [표현식]
		 * 		자료형 변수명;
		 * 
		 *  - 자료형 : 변수의 크기나 모양을 지정하는 부분
		 *  - 변수명 : 변수의 이름을 부여하는 부분 (의미있게 작성)
		 *  ***
		 *  명명 규칙
		 *   [1] 카멜케이스 : 소문자로 시작하고, 다른 단어가 붙을 경우 첫글자를 대문자로 시작한다.
		 *   	 - 상수 : 스네이크케이스 (SNAKE_CASE).  모두 대문자로 작성하고 다른 단어는 _로 구분
		 *   [2] 예약어는 사용할 수 없음. (ex. static void public...)
		 *   [3] 공백 사용 불가
		 *   {4] 특수문자는 _와 $만 사용 가능
		 *   [5] 숫자로 시작할 수 없음
		 *   [6] 대소문자를 구분, 길이는 제한 없음
		 */
		
		// 1. 논리형 (boolean) : 논리값을 저장. true, false. 1byte.
		//true 값을 저장하는 isTrue라는 변수 선언 및 초기화
		boolean isTrue = true;
		//false 값을 저장하는 isFalse라는 변수 선언 및 초기화
		boolean isFalse = false;
		
		System.out.println();
		
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("isFalse의 갑 : " + isFalse);
		
		System.out.println();
		
		isTrue = 1 + 3 > 1;
		System.out.println("1 + 3 > 1 의 결과 : " + isTrue);
		
		//--------------------
		// 2. 숫자 ( 정수형, 실수형)
		// 2-1) 정수형 : 딱 떨어지는 수. 소수점 X
		// 		byte(1B) / short(2B) / int(4B) / long(8B)
		
		// byte 자료형 변수 bNum을 선언하고 저장할 수 있는 범위 내의 최소값 저장
		// -> -128 ~ 127
		byte bNum = -128;
		
		// bNum 변수에 1000을 저장
		// bNum = 1000;		// (byte) = (int)
		// --> 범위를 벗어나는 값을 저장하려고 해서 오류 발생
		
		// 2-2) 실수형 : 소숫점 o
		// 		float (4B) / double (8B)
		
		// float 자료형 변수 fNum에 0.0을 저장
		float fNum = 0.0f;  	//소숫점 7자리까지 표현 가능 자료형
								// 값 자체(리터럴)를 저장할 때는 접미사 f/F를 붙여준다
		double dNum = 0.0;		//소숫점 15자리까지 표현 가능
								// 실수형의 기본자료형
		// ----------
		// 3. 문자형 (char, String)
		// 3-1) 문자 : char (2B)
		
		// 'a' 라는 데이터를 저장하는 변수 ch 선언 및 초기화
		char ch = 'a';
		// '김' 이라는 데이터를 변수에 저장 -> 새로운 변수에 저장
		char ch1 = '김';
		
			System.out.println();
		// 3-2) 문자열 : String (참조자료형)
		// 문자열 변수 str 선언 -> 자료형 변수명;
		String str;
		//str 변수에 " 안녕하세요" 데이터를 저장(대입, 할당)
		str = "안녕하세요";
		// * 문자열의 길이 : 변수명.length();
		System.out.println( "str 데이터 길이 : " + str.length());
		//----------------------
		
		// 상수 : 변하지 않는 값을 저장하는 공간
		/* [ㅍ현식]
		 * 			final 자료형 변수명;
		 */
		// 최대 허용자 수를 저장하기 위한 상수 선언
		final int MAX_USERS;
		MAX_USERS = 21;		// 값을 저장(초기화)
		
		// 최대 허용자 수를 25로 변경(저장)
		// MAX_USERS = 25;		=> 재할당 불가
		
		System.out.println();
		// * 대표적인 상수 : 파이(3.141592...)
		System.out.println( Math.PI);
		
	}
}
		
		
		
		
		
		
		
		
		
