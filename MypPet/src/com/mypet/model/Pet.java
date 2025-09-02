package com.mypet.model;

// 펫의 정보를 담을 클래스
public class Pet {
	private String name;			//펫의 이름
	private int fullnessScore;		// 포만감
	private int happyScore;			// 즐거움
	private int cleanScore;			// 청결함
	private PetType type;			// 펫의 종류
	
	public Pet() {
		super();
	}

	public Pet(String name, PetType type) {
		this.name = name;
		this.type = type;
		
		// 상태(포만감, 즐거움, 청결함)에 대해서는 기본값으로 초기화
		this.fullnessScore = 50;
		this.happyScore = 50;
		this.cleanScore = 50;
	}
	/**
	 * 펫이 음식을 먹었을 때 동작할 내용(상태 변경)
	 */
	public void eat() {
		type.eat(this);
	}
	/**
	 * 펫을 놀아주었을 때 상태 변경
	 */
	public void play() {
		
	}
	/**
	 * 펫을 씻겨주었을 때 상태 변경
	 */
	public void clean() {
		
	}
	
	public void updateFullnessScore(int value) {	//메소드에서 기능 정의
		fullnessScore += value;
		
		checkScore();
	}
	public void updateHappyScore(int value) {
		happyScore += value;
		
		checkScore();
	}
	public void updateCleanScore(int value) {
		cleanScore += value;
		
		checkScore();
	}
	/**
	 * 펫이 살아있는 지 유무를 확인
	 *  - 포만감, 즐거움, 청결함 상태가 모두 0인 경우 죽음...
	 * 
	 * @return	살아있으면 true, 그렇지 않으면 false
	 */
	public boolean isAlive() {
		return fullnessScore > 0 || happyScore > 0 || cleanScore > 0;
		
	}
	/**
	 * 하루가 지날 때마다 상태 업데이트
	 * - 모든 상태를 -5로 업데이트
	 */
	public void passDay() {
		updateFullnessScore(-5);
		updateHappyScore(-5);
		updateCleanScore(-5);
		
	}
	/**
	 * 펫 정보 조회
	 * ( toString() 메소드 : 모든 필드의 값을 문자열로 반환)
	 * @return
	 */
	public String getStatus() {
		return String.format("[%s 상태] (%s)\n-포만감: %d\n-즐거움: %d\n-청결함: %d", name,type.getType(), fullnessScore, happyScore, cleanScore);	
	}
	/**
	 * 펫 이름 조회
	 * @return	펫 이름
	 */
	public String getName() {
		return name;	
		
	}
	
	/**
	 * 상태 값이 범위를 벗어날 경우 처리
	 * 각 상태의 범위 : 0 ~ 200
	 * - 100보다 큰 경우 100으로 설정, 0보다 작을 경우 0으로 설정
	 */
	private void checkScore() {
		
		// 포만감 상태
		if (fullnessScore > 100) fullnessScore = 100;
		if (fullnessScore < 0) fullnessScore = 0;
		
		//즐거윰 상태
		if (happyScore > 100) happyScore = 100;
		if ( happyScore < 0) happyScore = 0;
		
		// 철결함 상태
		if (cleanScore > 100) cleanScore = 100;
		if ( cleanScore < 0) cleanScore = 0;
		
	}
	
		
	

}
