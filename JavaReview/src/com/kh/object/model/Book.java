package com.kh.object.model;

public class Book {
	// --- 필드부 ------
	// [접근제한자] [예약어] 자료형 변수명;
	private String title;
	private String author;
	
	// --- 생성자부 -----
	// => 특징 : 반환형이 없고, 이름이 클래스명과 동일
	// 접근제한자 생성자명([매개변수]) {
	// 		* 객체가 생성될 때 수행할 내용 (초기화)
	//}
	
	// * 기본 생성자 : 생성자가 하나도 정의되어 있지 않았을 때, 자동으로 추가되는 생성자
	public Book() {}
	
	// * 매개변수 생성자 : 전달되는 값을 해당 필드에 초기화해주는 생성자
	public Book(String title, String author) {
		// this => 현재 객체를 의미함
		this.title = title;
		this.author = author;
		
	}
	
	// --- 메소드부 -----
	// 접근제한자 예약어 반환형 메소드명(매개변수) {
	//			동작할 내용
	// }
	public String toString() {
		//=> 오버라이딩되는 메소드
		//=> 모든 필드의 값을 문자열로 반환
		
		return "title : " + title + ", author : " + author;
	}
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setTitle(String title) {
		this.title = title;  // 현재 객채에 title이라는 변수 를 초기ㅗ하
	}
	

	// title 필드의 getter
	public String getTitle() {
		return title;
	}
	
	

}
