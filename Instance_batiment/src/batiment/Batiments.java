package batiment;

public class Batiments {

	//Declarer les variables
	
    public static String materiaux;
	public static int nbEtages;
	public static int nbPieces;
	public static String typeChauffage;
	public static boolean cour;
	public static int anneeCons;
	public static boolean parking;
	public static String accesBatiment;
	public static boolean cheminee;
	public static boolean balcon;
	public static boolean escalier;
	public static boolean ascenseur;
	public static int nbAscenseur;
	public static boolean enRenovation;
	public static int habitant;
	public static int nbOuvrier;
	public static double loyer;
	
	

	//creation de la methode construireBatiment
	public static void construireBatiment () {
		System.out.println(materiaux + nbEtages + nbPieces + typeChauffage + cour + anneeCons + parking + accesBatiment + cheminee + balcon + escalier + ascenseur + nbAscenseur);
	}



	
}