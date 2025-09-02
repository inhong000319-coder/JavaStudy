package com.kh.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	/*
	 *  CheckedException : 반드시 예외처리가 필요한 예외
	 *  
	 *   => 조건 검사가 어렵고, 예측 불가능한 상황에서 발생하므로
	 *   	미리 예외처리 구문은 작성해야 함
	 *   
	 *   => 주로 외부 매개체 입출력이 일어날 때 발생 (파일, 네트워크 통신 등)
	 */
	public void test1() {
//		test2();
		
		try {
		test3();
		} catch(IOException e) {
			System.out.println("예외 발생");
		}
	}
	public void test2() {
		
		// Scanner 와 비슷한 객체 (문자열로만 읽음)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("입력 : ");
		
		try {
		String str = br.readLine();
		System.out.println(str);
		
		} catch(IOException e) {
			System.out.println("예외 발생");
		}
	}
		
		public void test3() throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("입력 : ");
			
			String str = br.readLine();
			System.out.println(str);
		}
		
		
	

}














