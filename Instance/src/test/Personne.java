package test;

public class Personne {
	public String nom;
	public String prenom;
	public String tel;
	public String email;
	
	String people() {
		return nom + prenom + tel + email;
	}
}
