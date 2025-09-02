package com.kh.a_basic;

import java.util.Scanner;

public class OperatorPractice {

	public static void main(String[] args) {

		//practice1();
		practice2();
		
	}

	public static void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다" : "양수가 아니다";
		System.out.println(result);
		
	}
	public static void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num2 = sc.nextInt();
		
		String result2 = num2 > 0 ? "양수다" : (num2 == 0 ? "0이다." : "음수다.");
		System.out.println(result2);
	}
}
