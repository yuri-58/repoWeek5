package labWeek5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class cards52 {
	public cards52() { //Need to name it the same as the class
	}
	public static List<String> cardName(boolean a) {
		List<String> cards = new ArrayList<String>();
		cards.add("Ace");
		cards.add("King");
		cards.add("Queen");
		cards.add("Jack");
		cards.add("10");
		cards.add("9");
		cards.add("8");
		cards.add("7");
		cards.add("6");
		cards.add("5");
		cards.add("4");
		cards.add("3");
		cards.add("2");
		return cards;
	}
	public static int cardValue(String card) {
		int value = 0;
		for(int i = 0; i < 13; i++) {
			if(card == "Ace") {
				value = 14;
			} else if(card == "King") {
				value = 13;
			} else if(card == "Queen") {
				value = 12;
			} else if(card == "Jack") {
				value = 11;
			} else if(card == "10") {
				value = 10;
			} else if(card == "9") {
				value = 9;
			} else if(card == "8") {
				value = 8;
			} else if(card == "7") {
				value = 7;
			} else if(card == "6") {
				value = 6;
			} else if(card == "5") {
				value = 5;
			} else if(card == "4") {
				value = 4;
			} else if(card == "3") {
				value = 3;
			} else if(card == "2") {
				value = 2;
			}
		}
		return value;
	}
	public List<String> cardSuit(boolean a){
		List<String> suit = new ArrayList<String>();
		suit.add("Spades");
		suit.add("Hearts");
		suit.add("Diamonds");
		suit.add("Clubs");
		return suit;
	}
	public String randomCard() {
		List<String> alpha = cardName(true);
		List<String> beta = cardSuit(true);
		String randoCard = "";
		Random rando = new Random();
		int upperBoundName = 13;
		int upperBoundSuit = 4;
		int randoName = rando.nextInt(upperBoundName);
		int randoSuit = rando.nextInt(upperBoundSuit);
		String delta = alpha.get(randoName);
		randoCard = delta + " of " + beta.get(randoSuit)
		+ " :which has value of " + cardValue(delta);
		return randoCard;
	}
	public int cardSize() {
		return 13;
	}
	public int suitSize() {
		return 4;
	}
}
