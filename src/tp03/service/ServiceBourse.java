package tp03.service;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import tp03.bean.Compte;
import tp03.bean.client.Client;
import tp03.bean.client.Particulier;

public class ServiceBourse {
	
	
	 static String fileName01 = "Symboles_Actions_Internationnales";
	 static String fileName02 = "Symboles_Actions.Canada";
	 
	 private static List<String> listeActionInt;
	 private static List<String> listeActionNat;

	public static void start() throws Exception{
		listeActionInt = ServiceBourse.loadStockInList(ServiceBourse.fileName01);
		listeActionNat = ServiceBourse.loadStockInList(ServiceBourse.fileName02);
		Client client01 = new Particulier();
		Compte compte01 = ServiceClient.ouvrirCompte(client01);
		client01.rajouterCompte(compte01);
		ServiceClient.deposerArgentDansCompte(client01, new BigDecimal(3000.00), 1);
		//Transaction.acheterActions("GOOGL", new Long(30), compte01., client01);
	}
	
	
	public static List<String> loadStockInList(String fileName) throws Exception {
		try {
			List<String> listeAction = new ArrayList();
			return listeAction = FileUtils.readLines(getFichier(fileName), "UTF-8");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	public static boolean rechercherDansListe(String symbole, List<String> liste){
		return liste.contains(symbole);
	}
	
	public static File getFichier(String fileName) throws Exception {
		return new File(fileName);
	}


	public static List<String> getListeActionInt() {
		return listeActionInt;
	}


	public static void setListeActionInt(List<String> listeActionInt) {
		ServiceBourse.listeActionInt = listeActionInt;
	}


	public static List<String> getListeActionNat() {
		return listeActionNat;
	}


	public static void setListeActionNat(List<String> listeActionNat) {
		ServiceBourse.listeActionNat = listeActionNat;
	}
	
	
}
