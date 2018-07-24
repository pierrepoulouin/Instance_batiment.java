package batiment;

 public class Application {

	public static void main(String[] args) {
		
		//Creation de l'instance batimentPierre de la classe Batiments
		Batiments batimentPierre = new Batiments();
		
		//Initialisation des variables 
		
		batimentPierre.materiaux = "Briques ";
		batimentPierre.nbEtages = 5;
		batimentPierre.nbPieces = 3;
		batimentPierre.typeChauffage = "charbon";
		batimentPierre.cour = true;
		batimentPierre.anneeCons = 1974;
		batimentPierre.parking = false;
		batimentPierre.accesBatiment = "interphone";
		batimentPierre.cheminee = false;
		batimentPierre.balcon = false;
		batimentPierre.escalier = true;
		batimentPierre.ascenseur = true;
		batimentPierre.nbAscenseur = 1;
		
		batimentPierre.construireBatiment();
		
		

	}

}
