package com.homework2.model;

public class Player {
	private String name;
	private boolean isHuman;
	private Card[] cards = new Card[7];
	private boolean[] open = new boolean[7];
	private int cardIndex = 0;
	
	public Player(String name, boolean isHuman) {
		this.name = name;
		this.isHuman = isHuman;
	}
	
	public void receiveCard(Card c, boolean isOpen) {
		if(cardIndex < 7) {
			cards[cardIndex] = c;
			open[cardIndex] = isOpen;
			cardIndex++;
		}
	}
	
	public void showCards() {
		System.out.println(name + " : ");
		for(int i = 0; i < cardIndex; i++) {
			if(isHuman) {
				System.out.print(cards[i] + " ");
			} else {
				
			
			if (open[i]) {
				System.out.print(cards[i] + " ");	// 카드 공개
			} else {
				System.out.print("██ ");	// 카드 비공개
			}
			}
		}
		System.out.println();
	}
	
	public void showAllCards() {
	    System.out.print(name + " : ");
	    for (int i = 0; i < cardIndex; i++) {
	        System.out.print(cards[i] + " ");  // 숨김 처리 없이 전부
	    }
	    System.out.println();
	}
	
	public int getCardIndex() {
		return cardIndex;
	}
	public void clearCards() {
		cards = new Card[7];	// 새 배열로 교체
		open = new boolean[7];	// 공개 여부 초기화
		cardIndex = 0;			// 인덱스 리셋
	}
	
}





