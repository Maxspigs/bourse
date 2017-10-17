package tp03.bean.portefeuille;

import java.util.HashMap;

import tp03.bean.bourse.Action;

public class PorteFeuilleInt extends PorteFeuille {
	
	private static int compteur = 1;

	public PorteFeuilleInt() {
		super();
		this.identifiant = "" + compteur;
		compteur++;
		this.listeActions = new HashMap<String, Action>();	
	}

	
}
