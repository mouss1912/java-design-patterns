package fr.diginamic.composite;

public class Employe implements IElement {

	private String nom;
	private String prenom;
	private double salaire;
	
	
	public Employe(String nom, String prenom, double salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public double getSalaire() {
		return salaire;
	}


	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	/*   Methodes */

	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return salaire;
	}
	
	
}
