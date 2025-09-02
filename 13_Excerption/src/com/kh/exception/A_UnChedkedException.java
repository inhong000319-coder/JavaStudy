package com.kh.exception;

import java.util.Scanner;

public class A_UnChedkedException {
	
	/*
	 * RuntimeException : 프로그램 실행 시 발행하는 예외들
	 * 
	 *  - IndexOutOfBoundsException : 배열이나 리스트 등에 부적절한 인덱스로 접근 시 발생
	 *  - NullPointerException : 참조변수가 null 인 상태에서 객체 멤버로 접근할 때 발생
	 *  - ArithmeticException : 나누기 연산에서 0으로 나눌 때 발생
	 *  - ClassCastException : 허용되지 않는 객체로 형변환을 시도할 때 발생
	 *  - NegativeArraySizeException : 배열을 생성할 때 크기를 음수로 지정하면 발생
	 *  
	 *  => RuntimeException 계열 예외는 대부분 예측 가능한 상황에서 발생
	 *  	그렇기 때문에 if 문 등 조건 처리를 통해 애초에 예외가 발생하지 않도록 방지 가능
	 */
	//	--- 필드부 ------------------------
	private Scanner sc = new Scanner(System.in);
	
	public void test1() {
		// ArithmeticException
		System.out.print("정수1 : ");
		int n1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int n2 = sc.nextInt();
		
		// int result = n1 / n2;
		// => 두 번째 입력 값(n2)이 0인 경우 예외 발생. -> 프로그램이 비정상적으로 종료됨
		
		// * 조건 처리 (조건문) -> 예외 처리 아님. 예외가 발생되지 않도록 막은 것
		/*
		int result = 0;
		if(n2 !=0) {
			result = n1 / n2;
			
			//System.out.println("결과는 ..." + result); -> if 문 안에 대입도 가능
		}
		
		System.out.println("결과는 ..." + result);
		*/
		// * 예외 처리 : 예외가 발생했을 때 비정상 종료되지 않도록
		//				실행할 내용을 미리 작성해놓은 것
		/*
		 *  * try ~ catch
		 *  
		 *  try {
		 *  	예외가 발생될 수 있는 구문
		 *  } catch(발생될 예외 클래스 매개변수) {
		 *  	해당 예외가 발생했을 때 실행할 구문
		 *  }
		 */
		
		try {
			int result = n1 / n2;
			System.out.println("결과 : " + result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			
			System.out.println(e.getMessage());
			// e.printStackTrace(); // 예외 정보, 발생 지점을 확인할 수 있음
		}
		
		System.out.println("작업 끝!!!!!!!!!!!!!!!!!!!!!!");
		
		
	}
	
	public void test2() {
		//NegativeArraySizeException, ArrayIndexOutOfBoundsEception
		
		System.out.println("배열 크기 : ");
		int size = sc.nextInt();
		// * 조건 처리 
		/*
		if(size >= 77) {
		
		int[] arr = new int[size];
		System.out.println("77번 위치이 값 : " + arr[77]);
		*/
		
		try {
			int[] arr = new int[size];
			System.out.println("77번 위치이 값 : " + arr[77]);
		
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위를 벗어난 접근 발생");
		} catch(NegativeArraySizeException e) {
			System.out.println("배열 크기를 음수로 지정할 수 없다.");
		}
		// => 여러 개의 catch 사용 가능
		
		System.out.println("작업 끝");
		
	}
	
	public void test3() {
		System.out.print("배열 크기 : ");
		int size = sc.nextInt();
		
		try {
			int[] arr = new int[size];
			System.out.println("77번 위치이 값 : " + arr[77]);
		
		
		} catch (ArrayIndexOutOfBoundsException e) {
			
		}
		
		catch(RuntimeException e) { 
			// => 다형성을 활용하여 부모타입으로 catch 블럭을 작성 가능
			//		모든 자식 예외 발생 시 처리 가능
			System.out.println("인덱스가 잘못되었거나, 배열 크기가 음수인 경우");
			// => 각각의 예외 발생 시 실행할 동작이 다를 경우
			//		다중 catch 블럭을 사용하여 예외 별로 세분화할 수 있음
			//		이때, 순서에 유의해야 함 (부모 타입보다 자식타입이 위쪽에 작성되어야 함)
			
			System.out.println("작업 끝");
		} 
		

	}
	
	
	
	
	
	
	

}
