package com.kh.array;

public class C_ArrayCopy {

	public static void main(String[] args) {

//		shallowCopy();
		deepCopy();
		
	}
	/*
	 * 얕은 복사 => 주소값(참조값)을 복사
	 */
	
	public static void shallowCopy() {
		int[] origin = { 1, 2, 3, 4, 5};
		
		System.out.println("===== 원본 배열 출력 ====");
		for(int i = 0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		int[] copy = origin;
			//복사 -> 얕은 복사. 주소값이 복사됨
		
		System.out.println("===== 복사본 배열 출력 ====");
		
		for(int i = 0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		//TODO : 복사본 배열(copy)의 세번째 위치의 값을 200으로 변경
		
		copy[2] = 200;
		
		System.out.println("===== 복사본 배열 출력 ====");
		
		for(int i = 0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		System.out.println("===== 원본 배열 출력 ====");
		for(int i = 0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * 깊은 복사 : 새로운 배열을 생성하여 원본 배열의 값을 복사
	 */
	public static void deepCopy() {
		int[] origin = { 1,2,3,4,5 };
		
		//복사본 배열(copy)을 선언하고 원본배열(origin)의 크기만큼 할당(생성)
		
		int[] copy = new int[origin.length];
		
		System.out.println("====복사 전 copy ====");
		for(int n : copy) {
			System.out.print(n + " ");
		}
		System.out.println();
		// * for문을 이용하여 복사하기
		
		for(int i =0; i<copy.length; i++) { 
			//copy배열의 i번째 위치에
					//origin 배열의 i번째 위치의 값을 대입
			copy[i] = origin[i];
		}
		
		System.out.println("====복사 후 copy ====");
		for(int n : copy) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		copy[2] = 999;
		
		System.out.println("====값 변경 후 copy ====");
		for(int n : copy) {		// n -> origin[i] (i : 0 ~ 배열크기-1)
			System.out.print(n + " ");
		}
		System.out.println();
		
		System.out.println("====값 변경 후 origin ====");
		for(int n : origin) {
			System.out.print(n + " ");
		}
		System.out.println();
		//---------------
		//*System.arraycopy(원본배열며으 복사를 시작할 인데스,
		// 						복사본 배열명 복사본 배열의 시작 인덱스, 복사할 개수);
		
		// System.arraycopy(origin, 0, copy, 0, origin.length);
		
		copy = new int[10];		// [0, 0, 0, ...,0, 0]
		// [0, 0, 0, 0, 3, 4, 5, 0, 0, 0]
		System.arraycopy(origin,  2, copy, 4, 3);
		System.out.println("====값 변경 후 copy ====");
		for(int n : copy) {
			System.out.print(n + " ");
		}
		System.out.println();
	
		
	}

}
