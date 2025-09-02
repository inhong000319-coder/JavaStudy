package com.kh.object.capsule;

public class Person {
	// --------- 필드부 --------
	private String name;		// 이름
	private int age;			// 나이
	
	// --------- 생성자부 ----------
	public Person() {}		// 기본 생성자(매개변수X)
	
	// ------------메소드부 ------------
	//* private 변수의 값을 조회 또는 변경하기 위한 메소드
	// => getter / setter 메소드 정의
	//		-getter : 해당 필드의 값을 반환
	//		-setter : 해당 필드의 값을 전달된 값으로 변경
	
	//name 필드의 getter 메소드 정의
	public String getName() {
		return name;
		// return this.name;
	}
	// name 필드의 setter 메소드 정의
	public void setName(String name) {
		this.name =  name;
	}
	// age 필드의 getter 메소드 정의
	public int getAge() {
		return age;
	}
	
	//age 필드의 setter 메소드 정의
	public void setAge(int age) {
		this.age = age;
	}
	
	public void introduce() {
		System.out.println("안녕하세요.");
		System.out.println("저는 " + name + "입니다.");
		System.out.println("나이는 " + age + "살입니다.");

	}
}

