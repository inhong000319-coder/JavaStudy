package com.kh.d_object.practice2.run;

import com.kh.d_object.practice2.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setTitle("객체지향의 사실과 오해");
		b1.setAuthor("조영호");
		b1.setPublisher("위키북스");
		b1.setPrice(25000);
		b1.setDiscountRate(0.1);
		
		Book b2 = new Book();
		b2.setTitle("클린 코드");
		b2.setAuthor("로버트 C. 마틴");
		b2.setPublisher("인사이트");
		b2.setPrice(38000);
		b2.setDiscountRate(0.15);
		
		Book b3 = new Book();
		b3.setTitle("실용주의 프로그래며");
		b3.setAuthor("앤드류 헌트, 데이비드 토마스");
		b3.setPublisher("인사이트");
		b3.setPrice(35000);
		b3.setDiscountRate(0.15);
		
		b1.inform();
		b2.inform();
		b3.inform();
	}

}
