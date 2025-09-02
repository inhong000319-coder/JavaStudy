package com.kh.api;

public class API3_Wrapper {
	/*
	 * Wrapper 클래스 : 기본 자료형을 객체화해주는 클래스
	 * 
	 * 		boolean		---->	Boolean
	 * 			char	---->	Character
	 * 			byte	---->	Byte
	 * 			short	---->	Short
	 * 			int		----> 	Integer
	 * 			long	---->	Long
	 * 			float	---->	Float
	 * 			double	---->	Double
	 * 
	 *  * 기본 자료형을 객체화해야 하는 이유
	 *  	- 다형성을 적용시키고 싶을 때
	 *  	- 메소드 호출 시 매개변수가 기본자료형이 아닌 객체 타입만 요구될 때
	 */

	public static void main(String[] args) {
		// * Boxing : 기본 자료형 -> Wrapper 클래스(객체화)
		int n1 = 100;
		int n2 = 200;
		
		//n1.equals(n2) // => 기본 자료형은 equals 사용 불가
		
		//래퍼 클래스를 사용하여 변환
		Integer i1 = Integer.valueOf(n1);
		Integer i2 = Integer.valueOf(n2);
				
				System.out.println(i1.equals(i2));
				System.out.println(i1.compareTo(i2));
				
				
				
				//래퍼 클래스 없이 변환
				Integer i3 = n1;		//Auto boxing
				System.out.println(i3);
				
				// * 래퍼 클래스를 사용해야 하는 경우
				//	=>10,100,.."10:,"배ㅐㅐ
				Integer i4 = Integer.valueOf("500");
				Integer i5 = Integer.valueOf("777");
						
						//----------------------
				
				// UnBoxing : 래퍼 클래스 --> 기본자료형
				
				// 래퍼클래스에서 제공한는 메소드 사용 (xxxValue())
				
				int n3 = i3.intValue();
				int n4 = i4.intValue();
				
				int n5 = 15;

	}

}
