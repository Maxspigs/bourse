package tp03.bean.client;

import java.math.BigDecimal;

public class Particulier extends Client {
	private String nom;
	private String prenom;
	
	private static int compteur = 1;
	
	public Particulier() {
		this.solde = new BigDecimal(0.0);
		this.id = compteur;
		compteur++;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
}
