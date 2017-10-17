package tp03.bean.bourse;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class Action2 extends Stock {
	
	private Long quantite;
	
	public Action2(String symbol) {
		super(symbol);
	}

	public double getQuantite() {
		return quantite;
	}

	public void setQuantite(Long quantite) {
		this.quantite = quantite;
	}

}
