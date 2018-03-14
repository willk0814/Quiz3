package pkgCore;
import pkgEnum.*;
public class Card implements Comparable { 

	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		//return 0;
		return c.getERank().compareTo(this.getERank());
	}
		
	private eRank rank;
	private eSuit suit;
	
	public Card(eRank r, eSuit s){
		this.rank = r;
		this.suit = s;
	}
	 
	public eRank getERank(){
		return this.rank;
	}
	
	private void setERank(eRank x) {
		this.rank = x;
	}
	
	public eSuit getESuit() {
		return this.suit;
	}
	
	private void setESuit(eSuit x) {
		this.suit = x;
	}
}

	

