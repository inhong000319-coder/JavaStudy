package com.kh.b_loop;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		method1();

		/*Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		for(int n = 0; n <= (num2 - num1); n++) {
			num1 += n;
			
		 System.out.println(num1);
		 */
		}
		

	

	public static void method1() { 
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else { 
			
			// [1] 첫 번째 숫자가 두 번째 숫자보다 작다고 가정
			//		첫 번째 숫자부터 두번째 숫자까지 출력
			/*
			*for(int i = num1; i<=num2; i++) {
			*	System.out.print(i + " ");
			*/
			
			int max = num1 > num2 ? num1 : num2; //num1 > num2 이 true 일 경우 num1 대
			int min = num1 > num2 ? num2 : num1; //num1 > num2 이 true 일 경우 num2 대입
			
			for(int i = min; i <=max; i++) {
				System.out.print(i + " ");
			}
		
		}
	}

}
