package com.kh.a_basic;

import java.util.Scanner;

public class VariablePractice {
	public static void main(String[] args) {
		//practice1();
		//practice4();
		//practice2();
		practice3();
	}

	public static void practice1() {
		
		System.out.print("이름을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요 (남/여) : ");
		String gender = sc.nextLine();
		// sc.next(), sc.nextLine() : String 형태로만 읽어옴
		//  	=> 문자타입으로 추출하고자 할 경우 : 문자열.charAt(위치) : charAt
		char gen = gender.charAt(0);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("키 " + height + "cm인 " + age + "살 "+ gender + "자 " + name + "씨 반갑습니다^^");
		
		System.out.println();
		System.out.printf("키 %.1fcm인 %d살 %c자 %s님 반갑습니다^^" , height, age, gen, name);
		
		sc.close();
	}
	public static void practice4() {
		
		System.out.println();
		System.out.print("문자열을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String name1 = sc.nextLine();
		
		char n1 = name1.charAt(0);
		char n2 = name1.charAt(1);
		char n3 = name1.charAt(2);
		
		System.out.printf("첫 번째 문자 : %c", n1);
		System.out.println();
		System.out.printf("두 번째 문자 : %c", n2);
		System.out.println();
		System.out.printf("세 번째 문자 : %c", n3);
		
		System.out.println();
		System.out.println();
		
		char n4 = name1.charAt(0);
		System.out.println("첫 번째 문자 : " + n4);
		char n5 = name1.charAt(1);
		System.out.println("두 번째 문자 : " + n5);
		char n6 = name1.charAt(2);
		System.out.println("세 번째 문자 : " + n6);
		
		sc.close();
	}
	public static void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 몫 결과 : " + (num1 / num2));
		System.out.println("나누기 나머지 결과 : " + (num1 % num2));
	}
	public static void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		double w = sc.nextDouble();
		System.out.print("세로 : ");
		double l = sc.nextDouble();
		
		System.out.println("면적 : " + (w * l));
		System.out.println("둘레 : " + ((w + l) * 2));
	}
}
