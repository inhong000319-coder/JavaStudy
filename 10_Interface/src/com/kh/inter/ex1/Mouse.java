package com.kh.inter.ex1;

public class Mouse implements Animal, Baby {

	@Override
	public void move() {
		// Baby라서 움직일 수 없음..
	}

	@Override
	public void eat() {
		System.out.println("쥐는 치즈를 먹습니다.");
		
	}

	@Override
	public void makeSound() {
		System.out.println("찍 찍");
		
	}
	

}
