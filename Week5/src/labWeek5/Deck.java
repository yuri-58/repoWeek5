package labWeek5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Deck {
	cards52 alpha = new cards52();
	public List<String> deckOfCards(){
		List<String> tempAlpha = alpha.cardName(true);
		List<String> tempBeta = alpha.cardSuit(true);
		List<String> newDeck = new ArrayList<String>();
		for(int i = 0; i < alpha.cardSize(); i++) {
			for(int j = 0; j < alpha.suitSize(); j ++) {
				newDeck.add(tempAlpha.get(i) + " of " + tempBeta.get(j));
			}
		}
		return newDeck;
	}
	public List<String> shuffleDeck() {
		List<String> tempAlpha = deckOfCards();
		List<String> tempBeta = new ArrayList<String>();
		List<String> tempDelta = new ArrayList<String>();
		Random randomNum = new Random();
		do {
			int randNum = randomNum.nextInt(52);
			tempBeta.add(tempAlpha.get(randNum));
			for(String beta : tempBeta) {
					if (!tempDelta.contains(beta)) {
						tempDelta.add(tempAlpha.get(randNum));
				}
			}
		} while(tempDelta.size() < 52);
		return tempDelta;
	}
	public int randomNumber() {
		Random randNum = new Random();
		return randNum.nextInt(52);
	}
	public List<String> drawDeck(){
		List<String> tempAlpha = shuffleDeck();
		List<String> tempBeta = new ArrayList<String>();
		for(int i = 0; i < 5; i++) {
			tempBeta.add(tempAlpha.get(i));
		}
		return tempBeta;
	}
	public void dealDeck(int a){
		Map<Integer, List<String>> playerDeck = new HashMap<Integer, List<String>>();
		for(int i = 0; i < a; i++) {
			List<String> apple = drawDeck();
			playerDeck.put(i, apple);
		}
		for (Map.Entry<Integer, List<String>> entry : playerDeck.entrySet()) {
			System.out.println("Player " + (entry.getKey() + 1) + ": " + entry.getValue());
		}
	}
}

