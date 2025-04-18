package controleur;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlVerifierIdentiteTest {
	private Village village;
	private Chef abraracourcix;
	private ControlEmmenager controlEmmenager;
	private ControlVerifierIdentite controlVerifierIdentite;

	@BeforeEach
	public void initialiserSituation() {
		System.out.println("Initialisation...");
		village = new Village("le village des irr�ductibles", 10, 5);
		abraracourcix = new Chef("Abraracourcix", 10, village);
		village.setChef(abraracourcix);
		controlEmmenager = new ControlEmmenager(village);
		controlEmmenager.ajouterGaulois("Bonnemine", 10);
		controlEmmenager.ajouterDruide("Panoramix", 2, 5, 8);
		controlVerifierIdentite = new ControlVerifierIdentite(village);
	}

	@Test
	// verifierIdentite fait la m�me chose que Ishabitant donc on peut d�gager l'un
	// des 2
	void testVerifierIdentite() {
		assertTrue(controlVerifierIdentite.verifierIdentite("Bonnemine"));
		assertTrue(controlVerifierIdentite.verifierIdentite("Panoramix"));
		assertTrue(controlVerifierIdentite.verifierIdentite("Abraracourcix"));
		assertFalse(controlVerifierIdentite.verifierIdentite("toma"));
	}

}
