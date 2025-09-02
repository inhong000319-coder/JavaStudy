package com.kh.poly.ex2;

public class Run {

	public static void main(String[] args) {
		//[1] 부모타입 참조변수로 부모 객체를 다루는 경우
		Car c1 = new Car("Red", "가솔린", 2024);
		//Car ----> Car
		//*color	*color
		//*fuel		*fuel
		//*year		*year
		//*drive()		*drive()
		c1.drive();
		
		//[2] 자식타입 참조변수로 자식 객체를 다루는 경우
		Lamborghini c2 = new Lamborghini("Red", "고급휘발유", 2025);
		//Lamborghini	-----> Lamborghini
			//*color			*color
			//*fuel				*fuel
			//*year				*year
			//*drive()			*drive()
			//*moveLamborghini  *moveLamborghini
		c2.drive();
		c2.moveLamborghini();
		
		System.out.println("=================================");
		
		//[3] 부모 타입의 참조변수로 자식 객체를 다루는 경우
		Car c3 = new Genesis("Black", "경유", 2020);
		// Car		---->  Genesis
		//*color			*color
		//*fuel				*fuel
		//*year				*year
		//*drive()			*drive()
		//					*moveGenesis
		c3.drive();
		// c3.moveGenesis(); //=> 오류
		((Genesis)c3).moveGenesis();
		// => 자식객체의 멤버에 접근하고자 한다면,
		//		강제형변환 후 접근 가능 -> 다운캐스팅
		// ----------------------
		/*
		 * * 다형성 : 부모 타입으로부터 파생된 자식 객체들을
		 * 				부모 타입 하나로 다룰 수 있는 기술
		 * 
		 * 	- 장점 : 하나의 부모 타입만으로 여러 자식 객체들을 다룰 수 있어
		 * 			"편리"하고 "코드 길이 감소"됨
		 * 
		 * 	* 클래스 간의 형변환 (* 상속 관계에서만 가능 *)
		 * 	- 업캐스팅(Up Casting)
		 * 		: 자식 타입 -> 부모타입 형변환 (자동 형변화)
		 * 		  ex) Car c3 = new Genesis();
		 * 
		 *  - 다운캐스팅(Down Casting)
		 *  	: 부모타입 -> 자식타입 형변환 (강제 형변환)
		 *  		ex) (Genesis(s)c3).moveGenesis();
		 *  
		 *  * 동적 바인딩
		 *  	: 프로그램이 실행되기 전에는 컴파일 되면서 정적바인딩됨
		 *  		실질적으로 참조하는 자식 객체에 해당하는 메소드가 "오버라이딩"되면서
		 *  		프로그램 실행 시 동적으로 해당 메소드를 찾아서 실행
		 */
		
		//* 다형성 적용 전 *
		Lamborghini[] lArr = new Lamborghini[3];	// Lamborghini 객체들만 담을 수 있음
		lArr[0] = new Lamborghini("Red", "고급휘발유", 2020);
		
		Genesis[] gArr = new Genesis[3]; //Genesis 객체들만 담을 수 있음
		gArr[0] = new Genesis("Black", "ruddn", 2022);
		
		for(Lamborghini lam : lArr) {
			if(lam != null) {
			lam.drive();
			}
		}
		
		for(Genesis gen : gArr) {
			if(gen != null) {
			gen.drive();
		}
		}
		
		System.out.println("======================================");
		// * 다형성 적용 후*
		Car[] cArr = new Car[6];
		cArr[0] = new Car("흰색" , "휘발유", 2012);
		cArr[1] = new Lamborghini("blue", "고급유", 2023);
		cArr[2] = new Genesis("검정", "경유", 2025);
		
		for(Car c : cArr) {
			
			if (c !=null) {
				c.drive();
				
				// 해당 클래스 타입으로 생성된 인스턴스(객체)인지 확인
				if(c instanceof Lamborghini) {
					((Lamborghini)c).moveLamborghini();
				} else if ( c instanceof Genesis) {
					((Genesis)c).moveGenesis();
				}
			}
		}
		
		
	}

}
