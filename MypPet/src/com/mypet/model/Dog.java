package com.mypet.model;

public class Dog implements PetType{

	/**
	 * 밥을 주었을 때 상태 변경
	 * - 포만감 +15, 즐거움 +10, 청결함 -5
	 */
	@Override
	public void eat(Pet pet) {
		pet.updateFullnessScore(15);
		pet.updateHappyScore(10);
		pet.updateCleanScore(-5);
	}

	/**
	 * 놀아주었을 때 상태 변경
	 * - 포만감-5, 즐거움+15, 청결함 -10
	 */
	@Override
	public void play(Pet pet) {
		pet.updateFullnessScore(-5);
		pet.updateHappyScore(15);
		pet.updateCleanScore(-10);
		
	}
	/**
	 * 싯겨주었을 때 상태 변경
	 * - 포만감-5, 즐거움-5, 청결함+25
	 */

	@Override
	public void clean(Pet pet) {
		pet.updateFullnessScore(-5);
		pet.updateHappyScore(-5);
		pet.updateCleanScore(25);
		
	}

	@Override
	public String getType() {
		
		return "강아지";
	}

}
