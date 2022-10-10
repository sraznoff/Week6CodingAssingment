package War;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	public  ArrayList<Card> cards = new ArrayList<Card>();
	public int length;
	public Deck() {
		Deck.this.build();
	}
	
	public Card draw() {
		Card result = cards.get(cards.size()-1);
		cards.remove(cards.size()-1);
		length --;
		return result;
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	public void build() {
		String[] suits = Card.suits();
		for(String suit : suits) {
			for (int i = 2; i < 15; i++) {
				Card card = new Card(i, suit);
				cards.add(card);
				length ++;
			}
		}
	}
}
