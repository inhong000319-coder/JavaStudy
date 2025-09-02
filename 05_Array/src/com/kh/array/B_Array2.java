package com.kh.array;

public class B_Array2 {
	/* 
	 * 변수 종루
	 * - 일반 변수 : 리터럴(값 자체) 자체를 저장하는 공간(변수)
	 * 		=> 기본 자료형 (byte, short, int,...
	 * - 참조 변수 : 주소 값을 저장하는 공간(변수)
	 * 		=> 기본 자료형 외의 자료형 (int[], double[], char[], .., String,...
	 * 		으로 선언된 변수
	 * 
	 * * 배열 특징
	 *  - 배열을 생성한 후 직접 값을 초기화하지 않아도 기본값으로 초기화됨
	 *  		=>Heap 이라는 메모리 공간은 빈 공간으로 존재할 수 없어서
	 *  			공간이 만들어질 때 JVM에 의해서 기본값으로 초기화됨
	 *  
	 *  * 배열 단점
	 *  	- 생성한 후 배열의 크기를 변경할 수 없음
	 *  		=> 크기를 변경하고자 한다면 새로 생성해야 함
	 */

	public static void main(String[] args) {
		// 정수형 배열 iArr 선언하고 크기가 10인 배열 생성
		int[] iArr = new int[10]; // => 인덱스 범의 : 0 ~ 9
		// 실수형 배열 dArr 선언하고 크기가 4인 배열 생성
		double[] dArr = new double[4]; // => 인덱스 범위 : 0 ~ 3
		//=> 배열을 생성까지만 한 상태
		
		// iArr 배열의 값들을 출력
		for(int i=0; i<iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println("\n---------");
		// dArr 배열의 값들을 출력
		for(int i=0; i<dArr.length; i++) {
			System.out.print(dArr[i] + " ");
		}
		System.out.println("\n-----------");
		
		System.out.println("iArr -> " + iArr);
		// => 배열의 자료형 + @ + 주소값(16진수)
		System.out.println("dArr -> " + dArr);
		
		System.out.println(dArr.hashCode()); 	//=> 주소값의 10진수 형티 (참고)
		//--------------------------
		int[] arr = null;	//아무것도 참조하고 있지 않음
		System.out.println(arr);
		
		/*
		iArr = null;
		System.out.println(iArr[0]); 		//null[0] -> 오류 발생
		*/
		
		arr = new int[5];
		System.out.println(arr[4]);
//		System.out.println(arr[5]); //ArrayIndexOUtOfBoundsException..  오류 발생 -> 인덱스 범위 초과
		
		System.out.println(arr);
		System.out.println("----배열 재할당----");
		arr = new int[7];
		System.out.println(arr);

	}

}
