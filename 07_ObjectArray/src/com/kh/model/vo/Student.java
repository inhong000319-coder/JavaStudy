package com.kh.model.vo;

public class Student { // => 학생 정보
	// 데이터 -> 이름, 나이, 학년, 키, 성적, 학번, .....
	// 이름:String, 나이:int, 성적:double => private(-)
	
	// 기능 -> 공부한다, 밥 먹기, 술 마시기, 질문하기, ...
	
	// 학생 정보 출력 printInfo():void
	// getter.setter -> private 필드
	private String name;	//이름
	private int age;		//나이
	private double score;
	
	public Student(String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 성적 : " + score);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return age;
	}
	public void setScore(double score) {
		this.score = score;
	}

}
