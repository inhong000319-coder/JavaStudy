package com.kh.b_loop;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			
			for(int j = n; j>i; j--) {
				System.out.println("*");
				
			}
			System.out.println();
			
		}
		
		sc.close();
	}

}
