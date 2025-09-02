package com.kh.homework1;

import java.util.Scanner;


public class Run {

	public static void main(String[] args) {

		Controller lc = new Controller();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		
		
		Buyer b = new Buyer(name, age, gender);
		lc.insertBuyer(b);
		
		System.out.println("=======Brand======");
		System.out.println("1. lambo");
		System.out.println("2. porsche");
		System.out.println("3. ferrari");
		System.out.println("4. mclaren");
		System.out.println("5. bugatti");
		System.out.print("Select number : ");
		
		int car = sc.nextInt();
		
		if(car == 1) {
			//System.out.println(mList[0]);
			System.out.println( lc.modelInfo(0) );
			
	}
	}
	
}