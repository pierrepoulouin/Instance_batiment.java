package batiment;

 public class Application {

	public static void main(String[] args) {
		
		//Creation de l'instance batimentPierre de la classe Batiments
		Batiments batimentPierre = new Batiments();
		
		/*Initialisation des variables
		 * Utilisation des methodes get/set
		 */
		
		batimentPierre.getMateriaux();
		batimentPierre.setMateriaux("Briques");
		batimentPierre.getNbEtages();
		batimentPierre.setNbEtages(5);
		batimentPierre.getNbPieces();
		batimentPierre.setNbPieces(3);
		batimentPierre.getTypeChauffage();
		batimentPierre.setTypeChauffage("charbon");
		batimentPierre.isCour();
		batimentPierre.setCour(false);
		batimentPierre.getAnneeCons();
		batimentPierre.setAnneeCons(1974);
		batimentPierre.isParking();
		batimentPierre.setParking(false);
		batimentPierre.getAccesBatiment();
		batimentPierre.setAccesBatiment("interphone");
		batimentPierre.isCheminee();
		batimentPierre.setCheminee(false);
		batimentPierre.isBalcon();
		batimentPierre.setBalcon(false);
		batimentPierre.isEscalier();
		batimentPierre.setEscalier(true);
		batimentPierre.isAscenseur();
		batimentPierre.setAscenseur(true);
		batimentPierre.getNbAscenseur();
		batimentPierre.setNbAscenseur(1);
		
		//On appelle la methode construireBatiment de la Class Batiment
		batimentPierre.construireBatiment();
		
		

	}

}
