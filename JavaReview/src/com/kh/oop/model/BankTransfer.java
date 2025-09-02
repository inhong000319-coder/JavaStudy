package com.kh.oop.model;

// PaymentMethod 상속
public class BankTransfer extends PaymentMethod {
	//계좌번호
	private String accountNumber;
	
	public BankTransfer(String accountNumber) {
		super("계좌이체");
		this.accountNumber = accountNumber;
	}

	@Override
	public void process(double money) {
		System.out.println("* 결제 방식 : " + getMethodName());
		System.out.println("* 계좌번호 : " + accountNumber);
		System.out.println("* 결제금액 : " + money);
		
	}
	
	

}
