package tp03.bean.factory;

import tp03.bean.bourse.Action;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class ActionFactory {

	public static Action createAction(Stock stock){
	 Action action = new Action(stock.getSymbol());
	 action.setDescription(stock.toString());
	 action.setPrix(stock.getQuote().getPrice());
	 return action;
	}

}
