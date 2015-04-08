package stockMarket;

public class Corporation extends StockOwner {
	
	//FIELDS
	private float value;

	public Corporation(String name, float money, float value) {
		super(name, money);
		this.value = value;
	}
	
	public Share createShare(int nbShares){
		
		Share varShare = new Share(nbShares, this, this);
		
		return varShare;
	}
	
	public float getValue(){
		return this.value;
	}

}
