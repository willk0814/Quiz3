// Will Koenig
package pkgCore;
import pkgEnum.*;
import java.util.ArrayList;
import java.util.Collections;

public class Deck{

	ArrayList<Card> cards = new ArrayList(); 
	
	public int getRemaining(Object eNum){
		int count = 0;
		if(eNum instanceof eRank){
			for(Card c : cards){
				if(c.getERank() == eNum)
					count++;
			}
		}
		else{
			for(Card c : cards){
				if(c.getESuit() == eNum)
					count++;
			}
		}
		return count;		
	}
	
	public Deck(int x) {
		for(int i =0; i < x ; i++) {
			eSuit es = null;
			for(int s = 1; s <= 4; s++) {
	
				switch (s){
				case 1:
					es = eSuit.CLUBS;
					break;
				case 2:
					es = eSuit.DIAMONDS;
					break;
				case 3:
					es = eSuit.HEARTS;
					break;
				case 4:
					es = eSuit.SPADES;
				}
				
				for(int r = 1; r <= 14; r++) {
					switch (r){
					case 1:
						cards.add(new Card(eRank.JOKER, es));
						break;
					case 2:
						cards.add(new Card(eRank.TWO, es));
						break;
					case 3:
						cards.add(new Card(eRank.THREE, es));
						break;
					case 4:
						cards.add(new Card(eRank.FOUR, es));
						break;
					case 5:
						cards.add(new Card(eRank.FIVE, es));
						break;
					case 6:
						cards.add(new Card(eRank.SIX, es));
						break;
					case 7:
						cards.add(new Card(eRank.SEVEN, es));
						break;
					case 8:
						cards.add(new Card(eRank.EIGHT, es));
						break;
					case 9:
						cards.add(new Card(eRank.NINE, es));
						break;
					case 10:
						cards.add(new Card(eRank.TEN, es));
						break;
					case 11:
						cards.add(new Card(eRank.JACK, es));
						break;
					case 12:
						cards.add(new Card(eRank.QUEEN, es));
						break;
					case 13:
						cards.add(new Card(eRank.KING, es));
						break;
					case 14:
						cards.add(new Card(eRank.ACE, es));
						break;
					}
				}
			}
		}
		Collections.shuffle(cards);
	}
	
	public Card draw() throws Exception {
		if(cards.size()==0){
			throw new Exception("Deck is empty");
		}
		return cards.remove(0);
	}
}