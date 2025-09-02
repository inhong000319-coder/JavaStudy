package com.mypet.view;

import java.util.Random;
import java.util.Scanner;

import com.mypet.controller.MyPetController;
import com.mypet.model.Cat;
import com.mypet.model.Dog;
import com.mypet.model.Pet;
import com.mypet.model.PetType;

public class MyPetView {
	
	private Scanner sc = new Scanner(System.in);
	private MyPetController mpc = new MyPetController();
	
	private PetType[] types = {new Dog(), new Cat()};
	private final int PLAY_DAYS = 10;
	
	//* 생성자를 따로 정의하지 않으면 --> 기본 생성자가 자동으로 만들어짐
	
	/**
	 *  시작 화면을 보여주는 매소드
	 */
	public void startView() {
		
		System.out.println("****** My Pet ******");
		System.out.print("이름 입력 : ");
		String userName = sc.nextLine();
		//사용자 정보 추가 -> 컨드롤러에서 수행
		mpc.createUser(userName);
		
		System.out.print("펫 이름 입력 : ");
		String petName = sc.nextLine();
		createPet(petName);
		
		mainView();
	}
	
	/**
	 * 펫 종류를 랜덤하게 뽑아서 펫 등록하는 메소드
	 * 
	 * @param petName 이름
	 */
	
	
	
	public void createPet(String petName) {
		
		//랜덤하게 펫을 뽑기 -> 펫 종류에 대해서 랜덤값 추출(0,1 2, ....)\
		//* Random 클래스 이용
		Random random = new Random();
		int rNum = random.nextInt(types.length);
		
				PetType type = types[rNum];
				//TODO : 펫 정보 들옥 -> 컨트롤러에서 수행
				Pet pet = new Pet(petName, type);
				mpc.createPet(pet);
	}
	
	/*
	 * 메인 화면
	 * -> PLAY_DAYS 만큼 반복적으로 펫을 키우는 작업을 표시
	 */
	public void mainView() {
		
		for(int i=1; i<=PLAY_DAYS; i++) {
			
			
			System.out.println("=========Day" + i + "========");
			// TODO : 현재 상태 출력 -> 컨트롤러를 통해 정보를 조히할 예정
			String petInfo = mpc.petStatus();
			System.out.println(petInfo);
			
			// 펫이 살아있는 경ㅇ, 밥을 주거나/놀아주거나/씻겨주기 작업 수행
			//펫이 살아있지 않은 경우, 게임 종료(프로그램 종료)
			if(!mpc.isPetAlive() ) {
				System.out.println("펫이 죽었습니다...");
				System.out.println("게임이 종료됩니다");
				
				return;
			}
			
			// --- 펫이 살아있는 경우
			actionMenu();		// 동작 수행
			mpc.nextDay();		//하루가 지날 때 상태 업데이트
			
			
		}
		
		
		// * 10일 동안 펫을 잘 성장시킨 경우
		System.out.println("펫이 잘 성장했습니다. 게임을 종료합니다.");
		
	}
	/*
	 * 펫에 어떠한 동작을 할 수 있도록 출력하는 메뉴
	 */
	
	public void actionMenu() {
		int action;
		do {
		System.out.println("* 원하는 행동을 선택해주세요.");
		System.out.println(("1. 밥 주기"));
		System.out.println( "2. 놀아주기");
		System.out.println("3. 씻기기");
		System.out.print(" : ");
		
		action = sc.nextInt();
				sc.nextLine();
				
				if (action < 1 || action > 3) {
					System.out.println("잘못 선택했습니다.");
					continue;
				
				}
				
				// 	TODO : 컨트롤러를 통해 -> 선택한 항복에 대한 상태 변경
		mpc.doAction(action);
	} while (action < 1 || action >3);
		
	}

}
