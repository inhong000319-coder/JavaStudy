package com.kh.api;

public class API2_StringBuilder {

	//java.lang.StringBuilder 클래스
	//* 같은 메모리 공간에서 값을 변경
	
	public static void main(String[] args) {
		
		// * StringBuilder 객체 생성 => String 변수 필요
		String str = "summer";
		StringBuilder sb = new StringBuilder(str);
		
		System.out.println(sb);
		System.out.println(sb.toString());
		
		int hash = System.identityHashCode(sb);
		System.out.println(hash);
		
		// * 값을 변경 : 변수명.append(추가할 값)
		sb.append("is hot");
		sb.append("!!!!!!");
		
		System.out.println(sb);
		
		int hash2 = System.identityHashCode(sb);
		System.out.println(hash2);
		
		
	}

}
