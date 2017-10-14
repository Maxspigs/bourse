package tp03.bean.portefeuille;

import java.util.HashMap;

import tp03.bean.bourse.Action;

public abstract class PorteFeuille {

	protected String identifiant;
	protected String identifiantClientAssocie;
	protected String type;
	protected HashMap<String, Action> listeActions;
	protected String etat;
	
	public String getIdentifiantClientAssocie() {
		return identifiantClientAssocie;
	}
	public void setIdentifiantClientAssocie(String identifiantClientAssocie) {
		this.identifiantClientAssocie = identifiantClientAssocie;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public HashMap<String, Action> getListeActions() {
		return listeActions;
	}
	public void setListeActions(HashMap<String, Action> listeActions) {
		this.listeActions = listeActions;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getIdentifiant() {
		return identifiant;
	}
	
	
	
	
}
