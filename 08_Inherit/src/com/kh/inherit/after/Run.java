package com.kh.inherit.after;


public class Run {

	public static void main(String[] args) {
		
		Desktop dt  = new Desktop("LG", "Lg-001", "사무용PC", 1000000, false);
		System.out.println(dt.information());
		
		
		TV tv = new TV("삼성", "ss-001", "LED TV", 1500000, 55);
		String info = tv.information();
		System.out.println(info);

	}

}
