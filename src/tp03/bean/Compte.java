package tp03.bean;

import java.math.BigDecimal;

import tp03.bean.portefeuille.PorteFeuilleInt;
import tp03.bean.portefeuille.PorteFeuilleNat;

public class Compte {

	private int id;
	protected String etatCompte;
	protected BigDecimal solde;
	
	private static int compteur = 1;
	
	PorteFeuilleInt porteFeuilleInt;
	PorteFeuilleNat porteFeuilleNat;
	
	public Compte() {
		super();
		this.id = compteur;
		compteur++;
		this.etatCompte = "actif";
	}

	public String getEtatCompte() {
		return etatCompte;
	}

	public void setEtatCompte(String etatCompte) {
		this.etatCompte = etatCompte;
	}

	public PorteFeuilleInt getPorteFeuilleInt() {
		return porteFeuilleInt;
	}

	public void setPorteFeuilleInt(PorteFeuilleInt porteFeuilleInt) {
		this.porteFeuilleInt = porteFeuilleInt;
	}

	public PorteFeuilleNat getPorteFeuilleNat() {
		return porteFeuilleNat;
	}

	public void setPorteFeuilleNat(PorteFeuilleNat porteFeuilleNat) {
		this.porteFeuilleNat = porteFeuilleNat;
	}

	public int getId() {
		return id;
	}

	public BigDecimal getSolde() {
		return solde;
	}

	public void setSolde(BigDecimal solde) {
		this.solde = solde;
	}
	
	
	
}
