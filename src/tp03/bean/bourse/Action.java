package tp03.bean.bourse;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class Action extends Stock {
	
	private double quantite;
	
	public Action(String symbol) {
		super(symbol);
	}

}
