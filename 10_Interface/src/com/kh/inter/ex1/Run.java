package com.kh.inter.ex1;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// * 사용자가 선택한 메뉴에 따라 동물 객체를 크기가 3인 배열에 담기
		/*
		 * 1. 고양이
		 * 2. 호랑이
		 * 3. 쥐
		 */
		Scanner sc = new Scanner(System.in);
		Animal[] aniArr = new Animal[3];
		
		for(int i = 0; i<aniArr.length; i++) {
			System.out.println("------- 동물 목록 ------");
			System.out.println("1. 고양이");
			System.out.println("2. 호랑이");
			System.out.println("3. 쥐");
			
			System.out.print(" : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				aniArr[i] = new Cat();
				break;
			case 2:
				aniArr[i] = new Tiger();
				break;
			case 3:
				aniArr[i] = new Mouse();
				break;
			}
		}
		
		// * 배열에 각 위치에 접근하여 메소드 호출
		for(Animal animal : aniArr) {
			animal.makeSound();
			
			// Baby 일 경우에는 "움직이지 못합니다."
			if(animal instanceof Baby) {
				System.out.println("움직이지 못합니다.");
			} else {
				animal.move();
			}
		}
		

	}

}
