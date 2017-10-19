package tp03.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import tp03.bean.Compte;
import tp03.bean.bourse.Action;
import tp03.bean.client.Client;
import tp03.bean.client.Entreprise;
import tp03.bean.client.Particulier;
import tp03.bean.portefeuille.PorteFeuille;
import tp03.bean.portefeuille.PorteFeuilleInt;
import tp03.bean.portefeuille.PorteFeuilleNat;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class Transaction {

	public static String actionInternational(String symbole){
		for (String str : ServiceBourse.getListeActionInt()) {
			if(str.compareTo(symbole) == 0){
				return "int";
			}
		}
		for (String str : ServiceBourse.getListeActionNat()) {
			if(str.compareTo(symbole) == 0){
				return "nat";
			}
		}
		return "";
	}
	
	public static BigDecimal acheterActions(String symbole, Long nbActions, Compte compte, Client client) throws IOException{
		String typeAction = actionInternational(symbole);
		PorteFeuille porteFeuille = null;
		porteFeuille = typeAction(compte, typeAction, porteFeuille);
		Stock stock = YahooFinance.get(symbole);
		Action action = new Action(stock);
		BigDecimal prixTransaction = YahooFinance.get(symbole).getQuote().getPrice().multiply(new BigDecimal(nbActions));
		action.setQuantite(nbActions);
		ServicePorteFeuille.ajouterAction(action, porteFeuille.getListeActions());
		incidentClient(client, prixTransaction);
		return prixTransaction;
	}

	private static void incidentClient(Client client, BigDecimal prixTransaction) {
		if(prixTransaction.doubleValue() >= 10000.00 && client instanceof Particulier){
			createIncident(client);
		}
		if(prixTransaction.doubleValue() >= 100000.00 && client instanceof Entreprise){
			createIncident(client);
		}
	}

	private static PorteFeuille typeAction(Compte compte, String typeAction, PorteFeuille porteFeuille) {
		if(compte.getPorteFeuilleInt().estVide()){			
			if(typeAction.compareTo("int") == 0)
				porteFeuille = new PorteFeuilleInt();
			if(typeAction.compareTo("nat") == 0)
				porteFeuille = new PorteFeuilleNat();	
		}
		return porteFeuille;
	}
	
	public static boolean createXml(String fileName){
		try {
			XStream stream = new XStream(new DomDriver());
			stream.alias("Client", Client.class);
			//stream.toXML(getListe()*Objet à sauvegarder*, new FileOutputStream(fileName));
			return new File(fileName).exists();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	
	public static boolean createIncident(Client client){
		try {
			XStream stream = new XStream(new DomDriver());
			stream.alias("Client", Client.class);
			stream.toXML(client, new FileOutputStream("incident.xml"));
			return new File("incident.xml").exists();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	
	/*
	public static boolean readFromXml(String fileName) throws Exception{
		XStream stream = new XStream(new DomDriver());
		stream.alias("Client", Client.class);
		this.setListe((List<Cours>)) stream.fromXML(new FileInputStream(fileName));
		return getListe();
		
	}
	*/
	
	
}
