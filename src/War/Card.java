package War;

import java.util.HashMap;

public class Card {
	private int value;
	private String suit;
	private String name;
	public Card(int value, String suit) {
		this.value = value;
		this.setSuit(suit);
		this.name = rank(value) + " of " + suit;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String describe() {
		return name;
	}
	public static String[] suits() {
		String[] result = {"Spades", "Hearts", "Clubs", "Diamonds"};
		return result;
	}

	public String rank(int value) {
		HashMap<Integer, String> ranker = new HashMap<>();
		ranker.put(2, "Two");
		ranker.put(3, "Three");
		ranker.put(4, "Four");
		ranker.put(5, "Five");
		ranker.put(6, "Six");
		ranker.put(7, "Seven");
		ranker.put(8, "Eight");
		ranker.put(9, "Nine");
		ranker.put(10, "Ten");
		ranker.put(11, "Jack");
		ranker.put(12, "Queen");
		ranker.put(13, "King");
		ranker.put(14, "Ace");
		return ranker.get(value); 
	}

	

}
