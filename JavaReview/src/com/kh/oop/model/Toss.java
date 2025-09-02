package com.kh.oop.model;

//PaymentMethod 클래스를 상속
public class Toss extends PaymentMethod {
	// private String methodName;
	
	//* 상속 시 기본적으로(자동으로) 부모 타입의 기본 생성자를 호출
	public Toss() {
		// * 부모 생성자 호출 : super([전달값])
		super("토스");
	}
	
	// public abstract void process(double money);
	// * 부모에게 물려받은 추상메소드 구현 (오버라이딩)
	@Override
	public void process(double money) {
		System.out.println("* 결제 방식 : " + getMethodName());
		System.out.println("* 결제 금액 : " + money);
		
	}

}
