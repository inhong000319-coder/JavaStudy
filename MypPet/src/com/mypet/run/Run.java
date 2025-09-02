package com.mypet.run;

import com.mypet.view.MyPetView;

public class Run {
	/*
	 * MVC 패턴
	 *  - Model 	: 데이터를 저장하기 위한 용도
	 *  - View 		: 사용자에게 보여지는 화면
	 *  - Controller: 흐름을 제어하는 용도
	 */
	
	public static void main(String[] args) {
		
		new MyPetView().startView();
		
	}

}
