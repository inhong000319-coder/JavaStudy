package com.homework2.view;

import java.util.Scanner;

import com.homework2.controller.Continue;
import com.homework2.model.Deck;
import com.homework2.model.Player;

public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력하세요 : ");
		String myName = sc.nextLine();
		System.out.print("Player1의 이름을 입력하세요 : ");
		String player1 = sc.nextLine();
		System.out.print("Player2의 이름을 입력하세요 : ");
		String player2 = sc.nextLine();
		
		
		Deck deck = new Deck();
		
		Player me = new Player(myName, true);
		Player com1 = new Player(player1, false);
		Player com2 = new Player(player2, false);
		Player[] players = {me, com1, com2};
		
		for(int i = 0; i < 3; i++) {
			for(Player p : players) {
				boolean isOpen = ( i== 2);
				p.receiveCard(deck.draw(), isOpen);
			}
		}
		
		System.out.println("");
		
		System.out.println("====== 첫 카드 3장 공개 =====");
		for (Player p : players) {
			p.showCards();
		}
		System.out.println();
		
		
		for(int round = 3; round <= 7; round++) {
			System.out.println("1. 진행");
			System.out.println("2. 그만두기");
			System.out.println("선택 : ");
			int bet = sc.nextInt();
			if(bet == 1) {
				Continue.playOneRound(players, deck);
				System.out.println("현재 카드 상태");
				
			} else if(bet == 2) {
				Player[] computerOnly = { com1, com2};
				
				me.clearCards();
				
				System.out.println("당신을 제외한 2명만 게임 진행됩니다.");
				Continue.continueGame(computerOnly, deck);
				break;
				
				
						
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
				
			}
		
		

		System.out.println("최종 카드 상태");
		Continue.showFinal(players);
		sc.close();
	}

}


