package com.kh.collecton.set.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.collecton.set.mode.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		HashSet hs1 = new HashSet();
		
		hs1.add("반가워요");
		hs1.add(new String("반가워요"));
		
		hs1.add(new String("안녕하세요"));
		hs1.add(new String("힘내요"));
		hs1.add(new String("힘내요"));
		
		System.out.println(hs1);
		//=> 저장순서 유지 x, 인덱스 x, 중복된 데이터 저장 불가
		
		// * String 클래스에는 hashCode() 가 오버라이딩 되어 있음
		//	=> 실제 담긴 문자열을 가지고 10진수의 형태로 반환
		
		// * String 클래스에 equals() 도 오버라이딩 되어 있음
		// => 실제 담긴 문자열의 값을 비교하여 일치하면 true, 그렇지 않으면 false
		
		HashSet<Student> hs2 = new HashSet<>();
		
		hs2.add( new Student("홍길동", 40, 77));
		hs2.add(new Student("장원영", 20, 100));
		hs2.add(new Student("안유진", 25, 98));
		hs2.add(new Student("장원영", 20, 100));
		
		System.out.println(hs2);
		// => 중복 제거가 되지 않음
		
		// * Object 클래스의 hashCode()
		// => 해당 객체의 "주소값"을 가지고 10진수 형태로 반환
		
		// * Object 클래스의 equals()
		//	=> 두 객체의 "주소값"을 비교해서 같으면 true, 다르면 false
		
		// --------------
		
		// Student 에 hashcode() 오버라이딩
		// => 실제 각 필드에 담긴 데이터들이 일치하면(합해서) 10진수 형태로 반환
		// Student 에 equals() 오버라이딩
		// => 실제 각 필드에 담긴 데이터를 가지고 비교. 모두 일치하면 true, 그렇지 않으면 false
		
		System.out.println(new Student("장원영", 20, 100).hashCode());
		System.out.println(new Student("장원영", 20, 100).hashCode());

		System.out.println(new Student("장원영", 20, 100).equals(new Student("장원영", 20, 100)));
		
//		hs2.get(0);	//Set 구조에는 인덱스 개념을 사용하지 않으므로 get 메소드 자체가 없음
		
		// HashSet 에 담긴 데이터는 순차적으로 접근 가능
		
		// 1. for 문 사용
		for(Student s : hs2) {
			System.out.println(s);
		}
		
		System.out.println("=".repeat(30));
		
		// 2. ArrayList 에 저장한 다음 반복문 사용
		//	 * ArrayList 에 저장하는 방법 1) ArrayList 생성 후 addAlll 메소드 사용
		ArrayList<Student> list = new ArrayList<>();
		list.addAll(hs2);
		
		System.out.println(hs2);
		
		//	*ArrayList 에 저장하는 방법ㅈ 2) ArrayList 생성과 동시에 전달
		ArrayList<Student> list2 = new ArrayList<>(hs2);
		for(int i=0; i<list2.size(); i++) {
			System.out.println( list2.get(i));
		}
		System.out.println("-----------------------------------");
		//3. Iterator 반복자를 이용하여 순차적 접근
		Iterator<Student> it = hs2.iterator();
		
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
		
	}

}
