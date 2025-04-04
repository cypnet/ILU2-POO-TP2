package controleur;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlPrendreEtalTest {
	private Village village;
	private Chef abraracourcix;
	private ControlEmmenager controlEmmenager;
	private ControlPrendreEtal controlPrendreEtal;
	private ControlVerifierIdentite controlVerifierIdentite;

	@BeforeEach
	public void initialiserSituation() {
		System.out.println("Initialisation...");
		village = new Village("le village des irréductibles", 10, 1);
		abraracourcix = new Chef("Abraracourcix", 10, village);
		village.setChef(abraracourcix);
		controlEmmenager = new ControlEmmenager(village);
		controlEmmenager.ajouterGaulois("Bonnemine", 10);
		controlVerifierIdentite = new ControlVerifierIdentite(village);
		controlPrendreEtal = new ControlPrendreEtal(controlVerifierIdentite, village);
	}

	@Test
	void testPrendreEtal() {
		assertTrue(controlPrendreEtal.prendreEtal("Panoramix", "ballon", 5) == -1);
		assertTrue(controlPrendreEtal.prendreEtal("Bonnemine", "fleurs", 10) != -1);
		// actu il n'y aplus d'étal disponible, essayé d'ajouter et tester que ça ne
		// marche pas

	}

}
