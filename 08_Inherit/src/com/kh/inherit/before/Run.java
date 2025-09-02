package com.kh.inherit.before;

public class Run {

	public static void main(String[] args) {

		//Desktop 객체 생성
		Desktop dt  = new Desktop("LG", "Lg-001", "사무용PC", 1000000, false);
				System.out.println(dt.information());
				
				// Tv 객체 생성
		TV tv = new TV("삼성", "ss-001", "LED TV", 1500000, 55);
		String info = tv.information();
		System.out.println(info);
		
	}

}
