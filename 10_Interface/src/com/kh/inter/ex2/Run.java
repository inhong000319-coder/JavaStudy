package com.kh.inter.ex2;

public class Run {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		// | 원(반지름:5)	| 사각형(가로:3, 세로:4)	|
		shapes[0] = new Circle(5);
		shapes[1] = new Rectangle(3, 4);
		
		//* 반복문을 사용하여 도형의 넓이를 출력
		for(int i=0; i<shapes.length; i++) {
			
			if(shapes[i] instanceof Circle) {
				System.out.print("원의 넓이 : ");
			} else if(shapes[i] instanceof Rectangle) {
				System.out.print("사각형의 넓이 : ");
			}
			
			System.out.println(shapes[i].calculateArea() );
		}

	}

}
