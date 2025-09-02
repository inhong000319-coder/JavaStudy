package com.kh.api;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class API_Date {

	public static void main(String[] args) {

		//java.uttil.Date 클래스
		//날짜, 시간 관련 클래스
		
		Date date = new Date();
		
		System.out.println(date);
		
		/*
		Date date2 = new Date(2025, 8, 19);
		System.out.println(date2);
		*/
		
		
		//* 특정일에 대한 데이터로 생성
		//new Date(연도, 월, 일)
		//	- 연도 : 지정연도-1900
		//	- 월 : 지정월-1
		Date date2 = new Date(2025-1900, 8-1, 19);
		System.out.println(date2);
		
		// * 형식을 지정하는 클래스 : java.text.SimpleDateFormat
		
		// 형식 정의
		String format = "yyyy년 MM월 dd일 hh시 mm분 ss초";
		
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		System.out.println(sdf.format(date));
		
		// ---------------------
		
		//java.time.LocalDateTime
		LocalDateTime date3 = LocalDateTime.now();
		// * LocaDateTime.now
		System.out.println(date3);
		
		System.out.println(date3.getMonth()); //영어로 반환
		System.out.println(date3.getMonthValue());	//숫자로 반환
		
		//일 정보 반환 : getDayOfMonth
		System.out.println(date3.getDayOfMonth());	// 월 기준 일 반환
		System.out.println(date3.getDayOfYear());	// 연 기준 일 반환
		
		// 올해 며칠 남았는지
		System.out.println("올해는 ..." + (365 - date3.getDayOfYear()) + "일 남았습니다."	);
		
		// *시 정보 반환 : getHour
		System.out.println(date3.getHour());
		
		// * 퇴근까지 얼마나 남았는지 -> 18시
		System.out.println("퇴근까지..." +(18 - date3.getHour()) + "남았습니다.");
		
		//*형식 지정하기
		//java.time.format.DateTimeFormatter
		
		date3.format(
				DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")
				);
		
		
		System.out.println(format);
		
		
	}
}
