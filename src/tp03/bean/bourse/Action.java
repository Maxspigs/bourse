package tp03.bean.bourse;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.HistoricalQuote;
import yahoofinance.quotes.stock.StockDividend;

public class Action {

	private int id;
	private String description;
	private long quantite;
	
	private Stock stock;
	
	private static int compteur = 1;


	public Action(Stock stock) {
		super();
		this.id = compteur++;
		this.stock = stock;
		this.description = stock.toString();
	}


	public String getSymbole() {
		return this.stock.getSymbol();
	}


	public String getDescription() {
		return description;
	}


	public BigDecimal getPrix() {
		return this.stock.getQuote().getPrice();
	}


	public List<HistoricalQuote> getHistory() throws Exception{
		return stock.getHistory();
	}

	public StockDividend getDividende() {
		return stock.getDividend();
	}


	public long getVolume() {
		return stock.getQuote().getVolume();
	}

	public BigDecimal getChange() {
		return stock.getQuote().getChange();
	}

	public int getId() {
		return id;
	}


	public long getQuantite() {
		return quantite;
	}

	public void setQuantite(long quantite) {
		this.quantite = quantite;
	}
	
	
	
}
