package stockMarket;

public class Share {
	//FIELDS
	int quantity;
	
	//ATTRIBUTES
	Corporation corp;
	StockOwner guy;
	
	//Constructor
	public Share(int quantity, Corporation corp, StockOwner guy) {
		super();
		this.quantity = quantity;
		this.corp = corp;
		this.guy = guy;
	}
	

}
