package controleur;

import personnages.Gaulois;
import villagegaulois.Village;

public class ControlPrendreEtal {
	private Village village;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlPrendreEtal(ControlVerifierIdentite controlVerifierIdentite,
			Village village) {
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.village = village;
	}

	public boolean resteEtals() {
		//TODO a completer, attention le retour ne dit pas etre false :-)
		return village.rechercherEtal(null)!=null;
	}

	public int prendreEtal(String nomVendeur, String produit, int nbProduit) {
		//TODO a completer
		Gaulois gaulois = village.trouverHabitant(nomVendeur);
		int numeroEtal = -1;
		numeroEtal=village.installerVendeur(gaulois, produit, nbProduit);
		return numeroEtal;
	}

	public boolean verifierIdentite(String nomVendeur) {
		//TODO a completer, attention le retour ne dit pas etre false :-)
		return controlVerifierIdentite.verifierIdentite(nomVendeur);
	}
}
