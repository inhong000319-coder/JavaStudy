package com.mypet.controller;

import com.mypet.model.Pet;

public class MyPetController {
	private String userName;	// 사용자 이름
	private Pet pet;			// 펫 정보
	
	// * 생성자 생략 -> 기본생성자가 만들어짐
	
	public String getUserName() {
		return userName;
	}
	public void createUser(String userName) {
		this.userName = userName;
	}
	
	public Pet getPet() {
		return pet;
	}
	public void createPet(Pet pet) {
		this.pet = pet;
	}
	
	/**
	 * 펫 상태 정보 조회
	 * @return	펫 상태 정보
	 */
	public String petStatus() {
		return pet.getStatus();
	}
	/**
	 * 펫 살아있는 지 유무 조회
	 * @return 펫의 생존 여부
	 */
	public boolean isPetAlive() {
		return pet.isAlive();
	}
	/**
	 * 펫에 대한 행동을 처리하는 메소드
	 * @param action (1: 밥 주기, 2: 놀아주기, 3: 씻기기)
	 */
	public void doAction(int action) {
		
		switch(action) {
		case 1:
			pet.eat();		// pet에서 eat 메소드 호출
			break;
		case 2:
			pet.play();		// pet에서 play 메소드 호출
			break;
		case 3:
			pet.clean();	// pet에서 clean 메소드 호출
			break;
		}
		
	}
	
	/**
	 * 하루가 지났을 때 펫의 상태 업데이트
	 */
	public void nextDay() {
		
		pet.passDay();			// pet에서 passDay 메소드 호출
		
	}

}
