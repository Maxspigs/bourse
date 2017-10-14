package tp03.bean.bourse;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class Action3 {
	
private int id;
	
	private String symbole;
	private String description;
	private float prix;
	private List<String> history;
	private List<String> dividende;
	private long volume;
	private BigDecimal change;
	
	private Stock action;
	
	private static int compteur = 1;


	public Action3(String symbole) {
		super();
		this.id = compteur;
		compteur++;
		this.symbole = symbole;
	}


	public String getSymbole() {
		return symbole;
	}


	public void setSymbole(String symbole) {
		this.symbole = symbole;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public float getPrix() {
		return prix;
	}


	public void setPrix(float prix) {
		this.prix = prix;
	}


	public List<String> getHistory() {
		return history;
	}


	public void setHistory(List<String> history) {
		this.history = history;
	}


	public List<String> getDividende() {
		return dividende;
	}


	public void setDividende(List<String> dividende) {
		this.dividende = dividende;
	}


	public long getVolume() {
		return volume;
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
	
	
	
}
