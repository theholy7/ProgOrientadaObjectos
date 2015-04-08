package stockMarket;

import java.util.LinkedList;

public class StockMarket {
	
	//ATTRIBUTES
	LinkedList<Share> marketShares = new LinkedList<Share>();

	public StockMarket() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void putInMarket(Share shares){
		marketShares.add(shares);
	}
	
	public void putInMarket(Share shares, int nbShares){
		if(nbShares <= shares.quantity){
			shares.quantity = shares.quantity - nbShares;
			Share newShare = new Share(nbShares, shares.corp , shares.guy);
			putInMarket(newShare);
		}
		else{
			System.out.println("Computer says no");
		}

	}
	
	public Share buy(StockOwner stOwner, Corporation corp, int nbShares){
		
		return null;
	}
}
