package com.kh.loop;

public class B_While {
	/*
	 * while 문
	 * 
	 * [표현식]
	 * 			[초기식;]  // => 생략 가능
	 * 			while(조건식) {
	 * 				//반복할 내용
	 * 				 [증감식;]
	 * 		}
	 *  * 실행 순서
	 *  	조건식 검사 -> 조건식 결과 true인 경우 반복할 내용 수행
	 *  	-> 조건식 검사 -> 조건식 결과가 true인 경우 반복할 내용 수행
	 *  	-------계속 반복 --------
	 *  -> 조건식 검사 -> 조건식 결과 false인 경우 반복문 종료
	 */
	public static void main(String[] args) {

		//"Happy" 5번 출력 -> while문 사용
		
		int n = 10;	//초기식
		while(n > 5) {
			System.out.println("Happy");
			
			n--;
		}
	}

}
