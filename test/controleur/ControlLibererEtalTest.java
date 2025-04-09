package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlLibererEtalTest {
	
	private Village village;
	private Chef abraracourcix;
	private ControlLibererEtal ctrl;

	@BeforeEach
	public void init() {
		village = new Village("le village des irréductibles", 10, 1);
		abraracourcix = new Chef("Abraracourcix", 10, village);
		village.setChef(abraracourcix);
		ctrl = new ControlLibererEtal(new ControlTrouverEtalVendeur(village));
	}

	@Test
	void testControlLibererEtal() {
		assertNotNull(ctrl, "Constructeur ne renvoie pas null");
	}

	@Test
	void testIsVendeur() {
		fail("Not yet implemented");
	}

	@Test
	void testLibererEtal() {
		fail("Not yet implemented");
	}

}
