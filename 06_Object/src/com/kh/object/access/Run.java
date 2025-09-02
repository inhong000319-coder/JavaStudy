package com.kh.object.access;

public class Run {

	public static void main(String[] args) {
		// AccessTest 객체 생성
		AccessTest test = new AccessTest();
		
		//public 멤버 접근
		System.out.println(test.publicField);
		test.publicMethod();
		
		// protected 멤버 접근
		System.out.println(test.protectedField);
		test.protectedMethod();
		
		//default 멤버 접근
		System.out.println(test.defaultField);
		test.defaultMethod();
		
		// private 멤버 접근 => X
//		System.out.println(test.privateField);
//		test.privateMethod();
		//=> private 제한자 사용 이유
		//	 : 객체의 데이터를 외부로부터 안전하게 보호하기 위함(정보 은닉)
		//	   객체 지향 핵심 원리 중 하나인 캡슐화 실현하는데 사용
	}

}
