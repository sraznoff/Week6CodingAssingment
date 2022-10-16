package War;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player p1 = new Player("John");
		Player p2 = new Player("Dave");
		deck.shuffle();
	//	p1.draw(deck);
		for (int i = 0; i < 52; i++) {
			if (i%2 == 1 ) {
				p1.draw(deck);
			}
			else {
				p2.draw(deck);
			}
		}
		//p1.describe();
		//p2.describe();
		for (int i = 1; i <=26 ; i++) {
			Card c1 = p1.flip();
			Card c2 = p2.flip();
			if (c1.getValue() > c2.getValue()) {
				p1.incrementScore();
				System.out.println(p1.getName() + "("+p1.getScore()+"): " + c1.describe() +" vs. " + p2.getName() + "("+p2.getScore()+"): "+ c2.describe());
				System.out.println(p1.getName() + " wins round.");
			}else if (c2.getValue() > c1.getValue()) {
				p2.incrementScore();
				System.out.println(p1.getName() + "("+p1.getScore()+"): " + c1.describe() +" vs. " + p2.getName() +"("+p2.getScore()+"): "+ c2.describe());
				System.out.println(p2.getName() + " wins round.");
			}else {
				System.out.println(p1.getName() + "("+p1.getScore()+"): " + c1.describe() +" vs. " + p2.getName() +"("+p2.getScore()+"): "+ c2.describe());
				System.out.println("Its a draw.");
			}
			System.out.println("=================================================");

		}
		System.out.println(p1.getName() +": "+ p1.getScore() + " - " + p2.getName() + ": "+p2.getScore());
		if (p1.getScore() > p2.getScore()) System.out.println(p1.getName() + " wins.");
		else if (p1.getScore() < p2.getScore()) System.out.println(p2.getName() + " wins.");
		else System.out.println("It's a tie");
		

		
	}

}
