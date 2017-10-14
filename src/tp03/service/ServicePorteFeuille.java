package tp03.service;

import java.io.IOException;
import java.util.HashMap;

import tp03.bean.bourse.Action;
import yahoofinance.YahooFinance;

public class ServicePorteFeuille {

	// Fonction statique qui permet d'ajouter une action dans un porteFeuille
	public static void ajouterAction(String symbole, HashMap<String, Action> liste) throws IOException{
		liste.put(symbole, (Action) YahooFinance.get(symbole));
	}
	
	// Fonction statique qui permet de supprimer une action dans un porteFeuille
	public static void supprimerAction(String symbole, HashMap<String, Action> liste){
		liste.remove(symbole);
	}
	
	
	
}
