package com.homework2.controller;

import com.homework2.model.Deck;
import com.homework2.model.Player;

public class Continue {
	public static void playOneRound(Player[] players, Deck deck) {
		for (Player p : players) { 
			boolean open = (p.getCardIndex() != 7);
			p.receiveCard(deck.draw(), open);
				
			}
			
			showAll(players);
			System.out.println();
			
	
	}
	
	public static void continueGame(Player[] players, Deck deck) {
		while (players[0].getCardIndex() <= 7) {
			playOneRound(players,deck);
			try {Thread.sleep(1000); } catch (Exception e) {}
		}
	}

	public static void showAll(Player[] players) {
		for(Player p : players) {
			p.showCards();
		}
		System.out.println();
}
	
	public static void showFinal(Player[] players) {
		for (Player p : players) {
			p.showAllCards();
		}
		System.out.println();
	}
	}
