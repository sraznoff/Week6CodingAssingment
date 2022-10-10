package War;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player p1 = new Player("John");
		Player p2 = new Player("Dave");
		deck.shuffle();
		p1.draw(deck);
		for (int i = 0; i < 51; i++) {
			if (i%2 == 1 ) {
				p1.draw(deck);
			}
			else {
				p2.draw(deck);
			}
		}
		System.out.println();
		System.out.println(p1.hand.size());
		System.out.println(p2.hand.size());
		for (int i = 1; i < 20; i++) {
			Card c1 = p1.flip();
			Card c2 = p2.flip();
			if (c1.getValue() > c2.getValue()) {
				p1.incrementScore();
			}else if (c2.getValue() > c1.getValue()) {
				p2.incrementScore();
			}

		}
		System.out.println(p1.getScore() + " " + p2.getScore());

		
		

		
	}

}
