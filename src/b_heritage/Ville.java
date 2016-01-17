package b_heritage;

public class Ville { // Ville est ici la class mère
	
	protected String nomVille; // ceci sont ses attributs en protected et non private pour qu'ils puissent etre hérité
	protected String pays;
	protected int nbHabitants;
	
	public Ville() { // constructeur par défaut
		
	}
	
	public Ville(String nomVille, String pays, int nbHabitants) { //ici son constructeur avec parametres
		
		this.nomVille = nomVille; // ici on assigne les valeurs
		this.pays = pays;
		this.nbHabitants = nbHabitants;
	}

	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
}


