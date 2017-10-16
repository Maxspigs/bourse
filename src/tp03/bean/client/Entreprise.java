package tp03.bean.client;

import java.math.BigDecimal;

public class Entreprise extends Client {

	private String nomEntreprise;
	private String cote;
	private double nbEmploye;
	
	private static int compteur = 1;
	
	public Entreprise() {
		this.solde = new BigDecimal(0.0);
		this.id = compteur;
		compteur++;
	}

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	public String getCote() {
		return cote;
	}

	public void setCote(String cote) {
		this.cote = cote;
	}

	public double getNbEmploye() {
		return nbEmploye;
	}

	public void setNbEmploye(double nbEmploye) {
		this.nbEmploye = nbEmploye;
	}
	
	
	
}
