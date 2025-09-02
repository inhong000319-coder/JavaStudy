package com.kh.basic;

public class Loop {
	
	/*
	 * 반복문 : 특정 부분(코드)을 반복하여 수행해주는 문법
	 * *for*, *while*
	 * 
	 * for(초기식; 조건식; 증감식) {
	 * 			//반복할 내용
	 * }
	 * 
	 *  * 향상된 for문(foreach)
	 *  for(자료형 변수명 : 리스트) {
	 *  //반복할 내용
	 *  }
	 *  //=> 변수 : 리스트 내에 요소(데이터)들을 순차적으로 접근
	 *  // => 자료형은 리스트에 담긴 데이터와 동일해야 함
	 */

	public static void main(String[] args) {
//		test1();
		test2();

	}
	
	public static void test1() {
		// *1부터 10까지의 총 합
		
		int total = 0;
		for(int i =1; i<=10; i++) {
			total += i;
		}
		System.out.println("1부터 10까지 총 합 : " + total);
	
	}
	
	public static void test2() {
		// * 1부터 10까지의 홀 수 합
		// - 분기문 : break, continue
		
		int total = 0;
		for(int i=1; i<= 100; i++) {
			if(i% 2 ==0) {
				continue;
			}
			total +=i;
		}
		System.out.println(total);
	}

}
