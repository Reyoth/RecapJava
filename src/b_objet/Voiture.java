package b_objet;

public class Voiture {
	private String couleur;
	private String modele;
	private int chevaux;

	/**/
	public Voiture(String couleur, String modele, int chevaux) {
		this.couleur = couleur;
		this.modele = modele;
		this.chevaux = chevaux;
	}

	@Override
	public String toString() {
		return "Voiture [couleur=" + couleur + ", modele=" + modele + ", chevaux=" + chevaux + "]";
	}

	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getChevaux() {
		return chevaux;
	}
	public void setChevaux(int chevaux) {
		this.chevaux = chevaux;
	}
	
	
}
