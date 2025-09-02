package com.kh.b_condition;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0-100) : ");
		int num = sc.nextInt();
		
		if(num >= 90 && num <=100) {
			System.out.println("A");
		} else if(num >= 80 && num < 90) {
			System.out.println("B");
		} else if(num >= 70 && num < 80) {
			System.out.println("C");
		} else if(num >=0 && num < 70) {
			System.out.println("F");
		} else {
			System.out.println("점수를 올바르게 입력해주세요.");
		}
	}
}
