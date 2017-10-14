package tp03.service;

import tp03.bean.portefeuille.PorteFeuille;

public interface CompteService {

	public static void activerCompte(PorteFeuille porteFeuille) {
		String etatCompte = porteFeuille.getEtat();
		switch (etatCompte) {
		case "actif":
			System.out.println("Votre compte est déjà ouvert");
				
			break;
		case "fermer":
			porteFeuille.setEtat("fermer");
			break;
		case "bloquer":

			break;
		default:
		}

	}
}
