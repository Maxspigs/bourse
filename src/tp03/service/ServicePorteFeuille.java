package tp03.service;

import java.io.IOException;
import java.util.HashMap;

import tp03.bean.Compte;
import tp03.bean.bourse.Action2;
import tp03.bean.portefeuille.PorteFeuille;
import tp03.bean.portefeuille.PorteFeuilleInt;
import tp03.bean.portefeuille.PorteFeuilleNat;
import yahoofinance.YahooFinance;

public class ServicePorteFeuille {

	// Fonction statique qui permet de créer un porteFeuille
	public static PorteFeuille creerPorteFeuille(Compte compte, String type){
		return type=="nat" ? new PorteFeuilleNat() : new PorteFeuilleInt();
	}
	
	// Fonction statique qui permet d'ajouter une action dans un porteFeuille
	public static void ajouterAction(String symbole, HashMap<String, Action2> liste) throws IOException{
		liste.put(symbole, (Action2) YahooFinance.get(symbole));
	}
	
	// Fonction statique qui permet de supprimer une action dans un porteFeuille
	public static void supprimerAction(String symbole, HashMap<String, Action2> liste){
		liste.remove(symbole);
	}
	
	// Fonction statique qui permet de rechercher une action dans un porteFeuille
	public static void rechercherAction(String symbole, HashMap<String, Action2> liste){
		liste.containsKey(symbole);
	}
	
	// Fonction statique qui permet de modifier une action dans un porteFeuille
	public static boolean modifier(String symbole, Action2 action, HashMap<String, Action2> liste){
		if (liste.get(symbole) == action) {
			liste.put(symbole, action);
			return true;
		}
		else{
			return false;
		}
	}
	
}
