package com.kh.c_array;

import java.util.Scanner;

public class ArrayPrctice {

	public static void main(String[] args) {

		//practice4();
		//practice4_1();
		practice7();
		
	}
	
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("0 ~ 6 사이의 숫자 입력 : ");
		int date = sc.nextInt();
		
		String[] arr = new String[7];
		
		arr[0] = "월";
		arr[1] = "화";
		arr[2] = "수";
		arr[3] = "목";
		arr[4] = "금";
		arr[5] = "토";
		arr[6] = "일";
		
		if(date<=6 && date >=0) {
			
		System.out.println(arr[date]);
		
		} else if(date<0 || date>6)
			System.out.println("잘못 입력하셨습니다.");
			
			}
	public static void practice4_1() {
		// "월 ~ 일"까지 초기화된 문자열 배열을 만들기
		String[] weeks = { "월", "화", "수", "목", "금", "토", "일" };
		
		
		//0부터 6까지 숫자를 입력 받아
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이의 숫자 입력 : ");
		int index = sc.nextInt();
		
		if(index<0 || index>= weeks.length) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
		
		//입력한 숫자와 같은 인덱스에 있는 요일을 출력
		System.out.println(weeks[index]);
		}
		
		
		
		//2
		if(index >=0 && index < weeks.length) {
			System.out.println(weeks[index]);
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public static void practice7() {
		// 로또번호 6개 숫자 : 1 ~ 45
		int[] lottos = new int[6];
		// 랜덤값 대입
		for(int i = 0; i <lottos.length; i++) {
			lottos[i] = (int)(Math.random() * 45 + 1);
			
			// 중복 값 확인
			for(int j=0; j<i; j++) {
				// lottos[i] : 현재 인덱스 위치의 값
				// lottos[j] : 0 ~ i-1 위치의 값
				if(lottos[i] == lottos[j]) {
					i--;
					break;
				}
			}
		}
		// 출력
		for(int i = 0; i<lottos.length; i++) {
			System.out.print(lottos[i] + " ");
		}
	}
	

		}

		
			
		


