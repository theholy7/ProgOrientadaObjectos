package stockMarket;

import java.util.LinkedList;


public class StockOwner {
	
	//FIELDS
	protected String name;
	protected float money;
	
	//ATTRIBUTES
	LinkedList<Share> shares = new LinkedList<Share>();
		
	//CONSTRUCTOR
	public StockOwner(String name, float money) {
		super();
		this.name = name;
		this.money = money;
	}
	
	public void credit(float money){
		
	}
	
	public void debit(float money){
		
	}
	
	public void removeShare(Share share){
		
	}
	
	public void addShare(Share share){
		
	}

}
