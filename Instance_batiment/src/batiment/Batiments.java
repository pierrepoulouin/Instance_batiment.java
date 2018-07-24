package batiment;

public class Batiments {

	//Declarer les variables en private
	
    private static String materiaux;
	private static int nbEtages;
	private static int nbPieces;
	private static String typeChauffage;
	private static boolean cour;
	private static int anneeCons;
	private static boolean parking;
	private static String accesBatiment;
	private static boolean cheminee;
	private static boolean balcon;
	private static boolean escalier;
	private static boolean ascenseur;
	private static int nbAscenseur;
	private static boolean enRenovation;
	private static int habitant;
	private static int nbOuvrier;
	private static double loyer;
	
	

	//creation de la methode construireBatiment
	public static void construireBatiment () {
		System.out.println("mon batiment est fait de " + materiaux + ", il y a " + nbEtages + " etages et "+ nbPieces + " pièces. Il y a du chauffage de type " + typeChauffage + ".\nIl y a t'il une cour ? " + cour + "\nAnnée de construction : " + anneeCons + "\nIl y a t'il un parking ? " + parking + "\nL'accés du batiment se fait par " + accesBatiment + ".\nIl y a t'il une cheminée ? " + cheminee + "\nIl y a t'il un balcon ? " + balcon + "\nIl y a t'il un escalier ? " + escalier + "\nIl y a t'il un ascenseur ? " + ascenseur + " Si oui, combien ? " + nbAscenseur);
	}

/* On génère les methodes getters/setter pour avoir un accés en
 * lecture/écriture les variables en visibilité private de la
 * Class batiment (on pourra donc utiliser les variables dans d'autres
 * classes)
 */

	public static String getMateriaux() {
		return materiaux;
	}



	public static void setMateriaux(String materiaux) {
		Batiments.materiaux = materiaux;
	}



	public static int getNbEtages() {
		return nbEtages;
	}



	public static void setNbEtages(int nbEtages) {
		Batiments.nbEtages = nbEtages;
	}



	public static int getNbPieces() {
		return nbPieces;
	}



	public static void setNbPieces(int nbPieces) {
		Batiments.nbPieces = nbPieces;
	}



	public static String getTypeChauffage() {
		return typeChauffage;
	}



	public static void setTypeChauffage(String typeChauffage) {
		Batiments.typeChauffage = typeChauffage;
	}



	public static boolean isCour() {
		return cour;
	}



	public static void setCour(boolean cour) {
		Batiments.cour = cour;
	}



	public static int getAnneeCons() {
		return anneeCons;
	}



	public static void setAnneeCons(int anneeCons) {
		Batiments.anneeCons = anneeCons;
	}



	public static boolean isParking() {
		return parking;
	}



	public static void setParking(boolean parking) {
		Batiments.parking = parking;
	}



	public static String getAccesBatiment() {
		return accesBatiment;
	}



	public static void setAccesBatiment(String accesBatiment) {
		Batiments.accesBatiment = accesBatiment;
	}



	public static boolean isCheminee() {
		return cheminee;
	}



	public static void setCheminee(boolean cheminee) {
		Batiments.cheminee = cheminee;
	}



	public static boolean isBalcon() {
		return balcon;
	}



	public static void setBalcon(boolean balcon) {
		Batiments.balcon = balcon;
	}



	public static boolean isEscalier() {
		return escalier;
	}



	public static void setEscalier(boolean escalier) {
		Batiments.escalier = escalier;
	}



	public static boolean isAscenseur() {
		return ascenseur;
	}



	public static void setAscenseur(boolean ascenseur) {
		Batiments.ascenseur = ascenseur;
	}



	public static int getNbAscenseur() {
		return nbAscenseur;
	}



	public static void setNbAscenseur(int nbAscenseur) {
		Batiments.nbAscenseur = nbAscenseur;
	}



	public static boolean isEnRenovation() {
		return enRenovation;
	}



	public static void setEnRenovation(boolean enRenovation) {
		Batiments.enRenovation = enRenovation;
	}



	public static int getHabitant() {
		return habitant;
	}



	public static void setHabitant(int habitant) {
		Batiments.habitant = habitant;
	}



	public static int getNbOuvrier() {
		return nbOuvrier;
	}



	public static void setNbOuvrier(int nbOuvrier) {
		Batiments.nbOuvrier = nbOuvrier;
	}



	public static double getLoyer() {
		return loyer;
	}



	public static void setLoyer(double loyer) {
		Batiments.loyer = loyer;
	}



	
}