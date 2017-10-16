package tp03.bean.client;

import java.math.BigDecimal;
import java.util.HashMap;

import tp03.bean.Compte;

public abstract class Client {

	protected int id;
	protected String email;
	protected BigDecimal solde;
	
	protected HashMap<Integer, Compte> listeCompte;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getSolde() {
		return solde;
	}

	public void setSolde(BigDecimal solde) {
		this.solde = solde;
	}

	public HashMap<Integer, Compte> getListeCompte() {
		return listeCompte;
	}

	public void setListeCompte(HashMap<Integer, Compte> listeCompte) {
		this.listeCompte = listeCompte;
	}

	public Compte getCompteById(int idCompte){
		return this.listeCompte.get(id);	
	}
	
	public void setCompteById(int idCompte, Compte compte){
		this.listeCompte.put(idCompte, compte);
	}
	
	public void rajouterCompte(Compte compte){
		this.listeCompte.put(this.id, compte);
	}
}
