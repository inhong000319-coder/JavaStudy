package com.mypet.model;

public class Cat implements PetType {
	/**
	 * 먹이를 받았을 때 상태 변경
	 * - 포만감 + 10, 즐거움 +5, 청결함 -5
	 * 
	 * @param pet 펫 정보
	 */
	
	@Override
	public void eat(Pet pet) {
		pet.updateFullnessScore(10);
		pet.updateHappyScore(5);
		pet.updateCleanScore(-5);
	}
	/**
	 * 놀아주었을 때 상태 변경
	 * - 포만감-5, 즐거움 + 20, 청결함 -10
	 */

	@Override
	public void play(Pet pet) {

		pet.updateFullnessScore(-5);
		pet.updateHappyScore(20);
		pet.updateCleanScore(-10);
	}

	@Override
	public void clean(Pet pet) {
		
		pet.updateFullnessScore(-5);
		pet.updateHappyScore(-10);
		pet.updateCleanScore(20);
		
	}

	@Override
	public String getType() {
	
		return "고양이";
	}

}
