package com.kh.b_condition;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0 && num % 2 == 0) {
		System.out.println("짝수다.");
		} else if(num < 0) {
			System.out.println("양수만 입력해 주세요.");
		} else if(num > 0 && num % 2 != 0) { 
			System.out.println("홀수다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

}
