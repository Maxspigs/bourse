package tp03.bean.bourse;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class Action extends Stock {
	
	private Long quantite;
	
	public Action(String symbol) {
		super(symbol);
	}

	public double getQuantite() {
		return quantite;
	}

	public void setQuantite(Long quantite) {
		this.quantite = quantite;
	}

}
