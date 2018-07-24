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
		System.out.println("mon batiment est fait de " + materiaux + ", il y a " + nbEtages + " etages et "+ nbPieces + " pièces. Il y a du chauffage de type " + typeChauffage + ".\nIl y a t'il une cour ? " + cour + "\nAnnée de construction : " + anneeCons + "\nIl y a t'il un parking ? " + parking + "\nL'accés du batiment se fait par " + accesBatiment + ".\nIl y a t'il une cheminée ? " + cheminee + "\nIl y a t'il un balcon ? " + balcon + "\nIl y a t'il un escalier ? " + escalier + "\nIl y a t'il un ascenseur ? " + ascenseur + " Si oui, combien ? " + nbAscenseur);
	}



	
}