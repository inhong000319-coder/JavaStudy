package com.kh.e_object_array.student.controller;

import com.kh.e_object_array.student.model.vo.Student;

public class StudentController {
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;	//60점으로 상수 선언(변경 불가) 후에 결과 출력 시 사용
	public StudentController (/*매개변수*/) {	// 매소드명 : StudentController 으로 선언
		
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
		
	}
	
	public Student[] printStudent() { //
		return sArr;
	}
	
	public int sumScore() {
		int total = 0; //점수의 합 0으로 초기화
		for(int i=0; i<sArr.length; i++) {
			total += sArr[i].getScore();	// getScore -> Student 클래스에서 score의 값(getter)
		}
		return total;	//모든 학생의 점수의 합이므로 0+김길동 점수, 0+김길동 점수+박길동 점수, 0+김길동 점수+박길동 점수+이길동 점수, .....
	}
	
	public double[] avgScore() {
		double[] result = new double[2]; // result라는 배열명에 실수자리 2개 배치
		
		result[0] = sumScore();	//result[0]을 sumScore로 선언
		result[1] = result[0] / sArr.length; // 전체 학생 점수의 평균 구하는 것이므로 이 식이 의하는 것은 "전체 점수 / 학생 수"
		
		return result; //반환식
	}
				
				
			}
