package War;

import java.util.ArrayList;

public class Player {
	private ArrayList<Card> hand;
	private int score;
	private String name;
	
	public Player(String name) {
		this.name = name;
		this.score = 0;
		this.hand = new ArrayList<Card>();
	}
	public void describe() {
		System.out.println(name);
		System.out.println(hand.size());
		for (Card card : hand) {
			System.out.println(card.describe());
		}
	}
	public void draw(Deck deck) {
		Card card = deck.draw();
		hand.add(card);
		
	}
	public Card flip() {
		Card card = hand.get(hand.size()-1);
		hand.remove(hand.size()-1);
		return card;
	}
	public int getScore() {
		return score;
	}
	public void incrementScore() {
		this.score ++;
	}
	public String getName() {
		return name;
	}
}
