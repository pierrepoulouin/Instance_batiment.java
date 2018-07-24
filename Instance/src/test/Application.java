package test;

public class Application {

	public static void main(String[] args) {

		//creation de l'instance cuisineSimplon de la classe Cuisine.
		Cuisine cuisineSimplon = new Cuisine();

		//Initialisation des variables de la class Cuisine avec l'exemple cuisineSimplon

		cuisineSimplon.nom = " Bing";
		cuisineSimplon.prenom = " Pierre";
		cuisineSimplon.tasse  = " Tasse Batman";

		//On stock la methode machineCafe de l'instance cuisineSimplon
		String bonCafeSimplon = cuisineSimplon.machineCafe("arabica", " eau bénite", " bouton On");

		//On imprime la variable où est stocké la méthode

		System.out.println(bonCafeSimplon);

		//La cuisine de Pierre
		Cuisine cuisinePierre = new Cuisine();

		cuisinePierre.nom = " Poulouin";
		cuisinePierre.prenom = " Pierre";
		cuisinePierre.tasse = " tasse PeterPan";

		String bonCafePierre = cuisinePierre.machineCafe("Colombien", " Cristaline", " bouton On");

		System.out.println(bonCafePierre);

		
		//La cuisine d'Athanasia

		Cuisine cuisineAthanasia = new Cuisine();

		cuisineAthanasia.nom = " Akatsouki";
		cuisineAthanasia.prenom = " Athanasia";
		cuisineAthanasia.tasse = " tasse Fee Clochette ";

		String bonCafeAthanasia = cuisineAthanasia.machineCafe("Arabica", " Volvic", " bouton On");

		System.out.println(bonCafeAthanasia);




	}

}
