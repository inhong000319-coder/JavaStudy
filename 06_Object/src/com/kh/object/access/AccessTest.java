package com.kh.object.access;

/*
 *  접근 제한자 : 클래스 내의 멤버(변수, 메소드)들에 접근할 수 있는 범위를 제한함
 *  			- 클래스 정의 시에도 사용
 *  
 *  ** 클래스에 사용 가능한 접근제한자 : 2가지
 *  	public, default
 *  
 *  ** 클래스 내에 멤버(변수, 메소드)에 사용 가능한 접근 제한자 : 4가지
 *  	public, protected, default, private
 *  
 *  ** 접근 범위
 *  	 - public : 어디서든 접근 가능 ( 같은 패키지, 다른 패키지 모두)
 *  	 - protected : 같은 패키지 또는 상속 관계에서만 접근 가능
 *  	 - default : 같은 패키지 내에서만 접근 가능
 *  	 - private : 해당 클래스 내에서만 접근 가능
 *  
 */

public class AccessTest {
	// --- 필드(변수) : 접근제한자 예약어 자료형 변수명;
	public  String publicField = "public 필드";
	protected String protectedField = "protected 필드";
	String defaultField = "default 필드";
	private String privateField = "private 필드";
	
	//--- 메소드
	public void publicMethod() {
		System.out.println("public 메소드");
	}
	
	protected void protectedMethod() {
		System.out.println("protected 메소드");
	}
	
	void defaultMethod() {
		System.out.println("default 메소드");
		
	}
	
	private void privateMethod() {
		System.out.println("private 메소드");
	}
	
			



}
