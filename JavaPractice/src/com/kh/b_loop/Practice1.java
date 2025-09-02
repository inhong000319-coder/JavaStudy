package com.kh.b_loop;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 사용자로부터 한 개의 값을 입력 받아
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		//입력받은 값부터 1까지 출력
		// 단, 입력한 값은 1보다 크거나 같아야 함
		if (num >= 1) {
			//출력
			// ex) 4 -> 4 3 2 1
			for (int i = num; i > 0; i--) {
				System.out.print(i + " ");
			}
		} else {
			//num의 값이 1보다 작은 경우 실행되는 부분
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

}
