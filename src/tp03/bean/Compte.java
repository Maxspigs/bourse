package tp03.bean;

import tp03.bean.portefeuille.PorteFeuilleInt;
import tp03.bean.portefeuille.PorteFeuilleNat;

public class Compte {

	private int id;
	protected String etatCompte;
	
	private static int compteur = 1;
	
	PorteFeuilleInt porteFeuilleInt;
	PorteFeuilleNat porteFeuilleNat;
	
	public Compte() {
		super();
		id = compteur;
		compteur++;
	}
	
	
	
	
	
}
