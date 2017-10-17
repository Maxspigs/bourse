package tp03.bean.bourse;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.HistoricalQuote;

public class Action {
	
private int id;
	

	private String description;
	private BigDecimal prix;
	private List<String> history;
	private List<String> dividende;
	private long volume;
	private BigDecimal change;
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

	public List<String> getDividende() {
		return dividende;
	}


	public long getVolume() {
		return stock.getQuote().getVolume();
	}


	public void setVolume(long volume) {
		this.volume = volume;
	}


	public BigDecimal getChange() {
		return change;
	}


	public void setChange(BigDecimal change) {
		this.change = change;
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
