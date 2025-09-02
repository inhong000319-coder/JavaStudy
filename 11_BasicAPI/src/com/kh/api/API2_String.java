package com.kh.api;

public class API2_String {

	public static void main(String[] args) {
		//test1();
		test2();

	}
	
	public static void test1() { 
		
		String str1 = "Happy";
		String str2 = "Happy";
		
		System.out.println(str1 == str2); // 결과 : true
		// 결과가 true인 이유
		//	문자열 값 자체를 대입하게 되면 "상수풀"이라는 공간에 저장되어
		//	같은 곳을 가리키게 됨 (주소 값이 같음)-> 주소를 비교한 것
		
		System.out.println( str1 == "Happy");
		//str1이 가리키고 있는 주소와 "Happy"라는 값 자체가 저장된 주소를 비교
		// => 결국은 둘 다 같은 곳을 가리키게 됨
		
		System.out.println("=============");
		//-----------
		String str3 = new String("Happy");
		String str4 = new String("Happy");
		
		System.out.println(str3 == str4); // false
		// => 문자열 객체를 생성해서 값을 대입하게 되면
		//	메모리에 새로운 영역에 할당하므로 각각 다른 위치에 저장됨
		
		System.out.println(str3 == "Happy");
		// => str3이 가리키는 주소와 "Happy" 값 자체는 상수풀에 저장되어 있어 다름
		
		//* 문자열 값을 비교하고자 할 때 : equals
		System.out.println(str3.equals("Happy"));
		
		System.out.println("============================");
		
		String str5 = "Good";
		String str6 = "Luck";
		
		System.out.println(str5);
		System.out.println(str5.toString());
		//=> String 클래스에서 toString() 재정의되어 있음
		//	저장된 값을 리턴하도록 정의
		
		// * 주소값(해시값) 을 확인하는 메소드 : System.identityHashCode(변수)
		int hash = System.identityHashCode(str5);
		System.out.println(hash);
		
		// 문자열을 합쳐주는 메소드 : concat
		str5 = str5.concat(str6);
		System.out.println(str5);
		
		int hash2 = System.identityHashCode(str5);
		System.out.println(hash2);
		
		// * 문자형 배열로 변환
		char[] arr = str1.toCharArray();
		System.out.println(arr[0]);
		
		// * 문자형 배열 -> 문자열로 변환 : static valueOf(배열) : String
		System.out.println(String.valueOf(arr));
		
	}
	
	public static void test2() {
		
		// * equals => 문자열A.equals(문자열B):boolean
		// 				문자열A와 문자열B가 같은지 비교하여 리턴
		String str1 = "Hello";
		
		System.out.println(str1.equals("Hello"));
		System.out.println(str1.equals("Bye"));
		
		// * charAt => 문자열.charAt(인덱스):char
		//				문자열에서 인덱스 위치의 문자를 리턴
		System.out.println(str1.charAt(1));
		
		// * length => 문자열.length():int
		//				해당 문자열의 길이를 리턴
		System.out.println(str1.length());
		
		//=> str1 변수의 마지막 문자 출력 'o'
		System.out.println(str1.charAt(str1.length()-1));
		
		//toUpperCase => 문자열.toUpperCase():String
		//				해당 문자열의 알파벳을 모두 대문자로 변환하여 리턴
		 
		//toLowerCanse => 문자열.toLowerCase():String
		//					해당 문자열의 알파벳을 모두 소문자로 변환하여 리턴
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		// contains	=> 문자열A.contains(문자열B):boolean
		//				문자열A에 문자열B가 포함되어 있는지 확인하여 리턴
		System.out.println(str1.contains("el"));
		System.out.println(str1.contains("tt"));
		
		//indexOf	=> 문자열A.indexOf(문자열B):int
		//				문자열A에 문자열B의 시작 인덱스를 리턴
		System.out.println(str1.indexOf("el"));
		System.out.println(str1.indexOf("tt"));// -1리턴
		
		//substirng => 문자열.substring(시작인덱스):String
		//				문자열에서 시작인덱스부터 마지막 위치까지 문자열 추출
		
		//substring 	=> 문자열.substring(시작인덱스):String
		//					문자열에서 시작인데스부터 마지막 위치까지 문자열을 추출하여 리턴
		//				=>문자열.substring(시작인덱스, 끝인덱스):String
		
		
		//repeat		=> 문자열.repeat(개수):String
		//					문자열을 개수만큼 반복하여 문자열 반환
		System.out.println(str1.repeat(5));
		System.out.println("=".repeat(10));
		
		//split		=> 문자열.split(구분자):String[]
		//				해당 문자열을 구분자를 기준으로 분리하여 문자열 배열형태로 반환
		String str2 = "JAVA#PYTHON#SQL";
		String[] arr = str2.split("#");
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		
	}

}
