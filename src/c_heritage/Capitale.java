package c_heritage;


public class Capitale extends Ville { // ici on précise que Capitale hérite de Ville

	protected String monument; // ceci est l'attribut supplémentaire de Capitale
	
	public Capitale() { // constructeur par défaut
		super(); // on précise ici qu'on utilise le constructeur par défaut de Ville 
	}
	
	public Capitale(String nomVille, String pays, int nbHabitants, String monument) { // ici on fait un constructeur avec parametres
		
		super(nomVille, pays, nbHabitants); // on précise que pour assigner les valeurs de bases, on utilise le constructeur de Ville
		this.monument = monument; // on assigne enfin la valeur au nouvel attribut
	}

	public String getMonument() {
		return monument;
	}

	public void setMonument(String monument) {
		this.monument = monument;
	}
	
}
