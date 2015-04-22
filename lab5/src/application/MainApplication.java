package application;

import stockMarket.*;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//O Carlos decide comecar a investir na bolsa
		StockOwner carlos = new StockOwner("Carlos", 1000);
		
		//A Galp ja esta na bolsa
		Corporation galp = new Corporation("Galp", 1000000000, 5);
		
		//Obvio que ja existe a bolsa de lisboa
		StockMarket lxBolsa = new StockMarket();
		
		//Cena do quotidiano tipo Lobinho of Olissipo
		
		
	}

}
