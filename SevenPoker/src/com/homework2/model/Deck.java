package com.homework2.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	private List<Card> cards = new ArrayList<>();	// 배열에 저장
	private static final String[] design = {"♠","♥","♦","♣"};	// 문양 설정
	
	public Deck() {
		for(String s : design) {
			for(int r = 2; r <= 14; r++) {
				cards.add(new Card(s, r));
			}
		}
		Random divide = new Random();
		boolean[] used = new boolean[cards.size()];
		
	
		
	}
	public Card draw() {
		return cards.remove(cards.size() - 1);
	}
	}





