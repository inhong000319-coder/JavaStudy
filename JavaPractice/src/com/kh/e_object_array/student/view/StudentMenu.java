package com.kh.e_object_array.student.view;

import com.kh.e_object_array.student.controller.StudentController;
import com.kh.e_object_array.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
		System.out.println("======== 학생 정보 출력 ==========");
		Student[] stdArr = ssm.printStudent();
		for(int i=0; i<stdArr.length; i++) {
			System.out.println(stdArr[i].inform());
		}
		System.out.println("====== 학생 성적 출력 ========");
		double[] scores = ssm.avgScore();
		
		System.out.print("학생 점수 합계 : ");
		System.out.println((int)scores[0]);
		
		System.out.print("학생 점수 평균 : ");
		System.out.println(scores[1]);
		
		
		System.out.println("======== 성적 결과 출력 ========");
		for(Student student : stdArr) {
			System.out.print(student.getName() + "학생은 ");
			
			if(student.getScore() >= StudentController.CUT_LINE) {
				System.out.println("통과입니다.");
			} else {
				System.out.println("재시험 대상입니다.");
			}
		}
	}

}
