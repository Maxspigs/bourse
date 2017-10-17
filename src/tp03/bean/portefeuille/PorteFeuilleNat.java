package tp03.bean.portefeuille;

import java.util.HashMap;

import tp03.bean.bourse.Action;

public class PorteFeuilleNat extends PorteFeuille {

	private static int compteur = 1;

	public PorteFeuilleNat() {
		super();
		this.identifiant = "" + compteur;
		compteur++;
		this.listeActions = new HashMap<String, Action>();	
	}
	
}
