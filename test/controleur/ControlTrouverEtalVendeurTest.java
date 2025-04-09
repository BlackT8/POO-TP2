package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlTrouverEtalVendeurTest {
	
	private Village village;
	private Chef abraracourcix;

	@BeforeEach
	public void init() {
		village = new Village("le village des irréductibles", 10, 1);
		abraracourcix = new Chef("Abraracourcix", 10, village);
		village.setChef(abraracourcix);
	}

	@Test
	void testControlTrouverEtalVendeur() {
		fail("Not yet implemented");
	}

	@Test
	void testTrouverEtalVendeur() {
		fail("Not yet implemented");
	}

}
