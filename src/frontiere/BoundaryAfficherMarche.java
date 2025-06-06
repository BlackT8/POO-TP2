package frontiere;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
		String[] infosMarche = controlAfficherMarche.donnerInfosMarche();
		
		if(infosMarche.length == 0) {
			System.out.println("Le marché est vide, revenez plus tard \n");
		}else {
			StringBuilder message = new StringBuilder();
			System.out.println(nomAcheteur + " vous trouverez au marché \n");
			
			for (int i = 0; i < infosMarche.length; i++) {
				String vendeur = infosMarche[i];
				i++;
				
				String quantite = infosMarche[i];
				i++;
				
				String produit = infosMarche[i];
				i++;
				
				message.append("- " + vendeur + " qui vend " + quantite + " " + produit + "\n");
			}
			System.out.println(message.toString());
		}
	}
}