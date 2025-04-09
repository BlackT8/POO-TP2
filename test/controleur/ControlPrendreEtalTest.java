package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Village;

class ControlPrendreEtalTest {
	
	private Village village;
	private Chef abraracourcix;
	private ControlPrendreEtal controlPrendreEtal;
	private Gaulois obelix;
	private Gaulois asterix;

	@BeforeEach
	public void initialiserSituation() {
		village = new Village("le village des irréductibles", 10, 1);
		abraracourcix = new Chef("Abraracourcix", 10, village);
		village.setChef(abraracourcix);
		Gaulois obelix = new Gaulois("Obelix", 1);
		Gaulois asterix = new Gaulois("Asterix", 1);
		village.ajouterHabitant(asterix);
		controlPrendreEtal = new ControlPrendreEtal(new ControlVerifierIdentite(village), village);
	}

	
	@Test
	void testControlPrendreEtal() {
		assertNotNull(controlPrendreEtal, "Constructeur ne renvoie pas null");
	}
	
	@Test
	void testResteEtals() {
		assertTrue(controlPrendreEtal.resteEtals());
		village.installerVendeur(obelix, "néant", 2);
		assertFalse(controlPrendreEtal.resteEtals());
	}

	@Test
	void testPrendreEtal() {
		assertEquals(controlPrendreEtal.prendreEtal("Obelix", "néant", 4),0);
		village.installerVendeur(asterix,"gourde",1);
		assertEquals(controlPrendreEtal.prendreEtal("Asterix", "gourde", 1),-1);
	}

	@Test
	void testVerifierIdentite() {
		assertFalse(controlPrendreEtal.verifierIdentite("n'existe pas"));
		assertTrue(controlPrendreEtal.verifierIdentite("Asterix"));
	}

}
