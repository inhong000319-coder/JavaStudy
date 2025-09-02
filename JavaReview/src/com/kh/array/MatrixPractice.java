package com.kh.array;

public class MatrixPractice {
	/*
	 * 2차원 배열 : 배열 안에 배열. 1차원 배열의 묶음. 행열 구조.
	 * 
	 * * 선언
	 * 		자료형[][] 변수명;
	 * 
	 * *할당
	 * 		변수명 = new 자료형[][]
	 * 		*행크기 => 1차원 배열이 몇 개인지
	 * 		*열크기 => 1차원 배열의 데이터 개수
	 * 			- 열크기 생략 시 가변 배열 생성 가능
	 * 
	 * *값 대입
	 * 		변수명[행인덱스][열인덱스] = 값;
	 */

	public static void main(String[] args) {
		// 2X3 크기의 배열에 1 ~ 6 값으로 초기화
		
		int[][] arr = new int[2][3];
		
		arr[0][0] = 1;	// 행인덱스*3 + 열인덱스 + 1
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 4;
		
		//*2차원 배열 + 반복문 => 반복문 2개(인덱스 2개)
		for(int i=0; i<arr.length; i++) { //행의 인덱스로 사용
			for(int j=0; j<arr[i].length; j++) {   // 열의 인덱스로 사용
				
				arr[i][j] = i*3 + j+1;
				
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
		}
		

	}

}
