package com.kh.loop;

public class D_Break {
	/*
	 *  분기문 : break
	 *   => 반복문 내에서 사용 시 가장 가까운 반복문을 종료
	 */
	public static void main(String[] args) {
		// 1 ~ 100 사이의 랜덤값을 추출하여 출력 => "랜덤값 : " + X
		// 단, 해당값이 짝수일 경우 반복문 종료
		while(true) {	// => 무한히 반복될 것임
			// 랜덤값 추출
			int random = (int)(Math.random() * 100 + 1);
			
//			 랜덤값이 짝수인 경우 반복문 종료
			if (random % 2 ==0) {
//				System.out.println("반복문 종료 --> " + random);
				break;
			}
			
			System.out.println("랜덤값 : " + random);
		}

	}

}
