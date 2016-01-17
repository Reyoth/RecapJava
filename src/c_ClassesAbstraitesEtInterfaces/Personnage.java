package c_ClassesAbstraitesEtInterfaces;

/* Une classe abstraite ne peut être instanciée.
 * Elle peut posseder des méthodes abstraites mais ce n'est pas obligatoire.
 * ainsi, Personnage p1 = new Personnage("Bob"); sera interdit*/
public abstract class Personnage {
	
	protected String nom;
	protected int hp = 30, lvl = 1, xp = 0;
	protected Attaque attaque = new Poing();
	
	// Constructeur standard
	public Personnage(String nom) {
		this.nom = nom;
	}
	
	/* Methodes Abstraite
	 * Elles ne posèdent pas de corps, c'est à dire pas de {} et finissent par ;
	 * Et peuvent exister que dans les classes abstraites et les interfaces.
	 * Elles devront par contre obligatoirement être redéfinie dans les classes héritières.*/
	public abstract void lvlUp();
	public abstract void apparence();
	public abstract boolean esquive();
	public abstract int attaquer();
	
	/* Methode standard
	 * Pour rappel, toString() est une méthode qui sert à décrire l'objet instancié*/
	@Override
	public String toString() {
		return "Personnage [nom=" + nom + ", class =" + getClass() +  ", pv=" + hp
				+ ", lvl=" + lvl + ", xp=" + xp + ", arme=" + attaque + "]";
	}

	//Getters
	public String getNom() {
		return nom;
	}

	public int getHp() {
		return hp;
	}

	public int getLvl() {
		return lvl;
	}

	public int getXp() {
		return xp;
	}

	public Attaque getAttaque() {
		return attaque;
	}

}
