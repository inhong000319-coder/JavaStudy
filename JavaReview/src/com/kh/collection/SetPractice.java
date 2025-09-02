package com.kh.collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetPractice {

	public static void main(String[] args) {
		// Set : 순서 유지 X, 중복 X
		
		//* 입력된 단어에서 중복된 문자를 제거하고 출력
		Scanner sc = new Scanner(System.in);
		Set<Character> set = new HashSet<>();
		// -> char(문자형) : 기본자료형 -- 객체화--> Character : 참조자료형(객체)
		
		System.out.print("- 단어 입력 : ");
		String str = sc.nextLine();
		
		//* 문자열에서 문자를 하나하나 추출하여 Set에 담기 (중복제거)
		//  문자 추출 : 문자열.charAt(인덱스):char
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			set.add(ch);		//Set<Character> => char ---> Character (Auto Boxing)
		}
		
		for(Character ch : set) {
			System.out.print(ch + " ");
		}

	}

}
