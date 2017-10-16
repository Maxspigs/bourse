package tp03.service;

import java.math.BigDecimal;

import tp03.bean.Compte;
import tp03.bean.client.Client;

public class ServiceClient {

	
	public static boolean deposerArgentDansCompte(Client client, BigDecimal solde, int idCompte){
		if (client.getSolde().doubleValue() >= solde.doubleValue()) {
			client.getCompteById(idCompte).setSolde(solde);
			client.setSolde(client.getSolde().subtract(solde));
			return true;
		}
		else{
			return false;
		}
	}
	
	public static Compte ouvrirCompte(Client client){
		Compte compte = new Compte();
		return client.getListeCompte().put(compte.getId(), compte);
	}
	
	public static void fermerCompte(Client client, int idCompte){
		client.getCompteById(idCompte);
	}

	
}
