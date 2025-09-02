package com.kh.exception.run;

import com.kh.exception.A_UnChedkedException;
import com.kh.exception.B_CheckedException;
import com.kh.exception.MyException;

public class Run {

	public static void main(String[] args) {
		/*
		 * * 에러 종류
		 *  - 시스템 에러 : 컴퓨터의 오작동으로 발생. 소스코드로 해결 불가. 심각한 에러
		 *  - 컴파일 에러 : 소스코드 문법상의 오류 => 빨간 줄로 표시 (개발자가 실수)
		 *  - 런타임 에러 : 코드 상 문법 문제는 없지만 실행 중에 발생하는 에러
		 *  				(실행 환경이나 입력 문제 등으로 발생)
		 *  
		 *  - 논리 에러 : 프로그램 문법에는 문제가 없지만, 의도한 동작이나 결과가 다르게 나오는 경우
		 *  
		 *  => 시스템 에러를 제외한 컴파일 에러, 런타임 에러, 논리 에러들을
		 *  	개발자가 처리할 수 있는 예외(Exception)에 해당
		 *  
		 *  이렇게 예외가 발생했을 때 프로그램이 비정상 종료되지 않도록 처리하는 방법 => 예외 처리
		 *  
		 *  * 예외 처리 방법
		 *  	1. try ~ catch 이용
		 *  	2. throws 이용
		 */
		
		A_UnChedkedException a = new A_UnChedkedException();
		
//		a.test1();
//		a.test2();
//		a.test3();
		
		B_CheckedException b = new B_CheckedException();
//		b.test1();
		
		method1();
		
	}
	
	public static void method1 () {
		
		// * 예외 발생시키는 구문 : throw
		try {
		
		throw new MyException("내가 만든 예외 클래스 발생됨");
		
		} catch(MyException e) {
			e.printStackTrace();
		}
	}
	
	
}

