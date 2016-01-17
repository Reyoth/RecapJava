package c_ClassesAbstraitesEtInterfaces;


public abstract class Personnage {
	
	protected String nom;
	protected int hp = 30, mp = 15, lvl = 1, xp = 0;
	protected Attaque attaque = new Poing();
	
	//Constructeur standard
	public Personnage(String nom) {
		this.nom = nom;
	}
	
	//Methodes Abstraite
	public abstract void lvlUp();
	public abstract void apparence();
	public abstract boolean esquive();
	public abstract int attaquer();
	
	//Methode standard
	@Override
	public String toString() {
		return "Personnage [nom=" + nom + ", class =" + getClass() +  ", pv=" + hp + ", pm=" + mp
				+ ", lvl=" + lvl + ", xp=" + xp + ", arme=" + attaque + "]";
	}

	//Getters
	public String getNom() {
		return nom;
	}

	public int getHp() {
		return hp;
	}

	public int getMp() {
		return mp;
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
