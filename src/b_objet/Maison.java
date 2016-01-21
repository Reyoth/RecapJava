package b_objet;

public class Maison {
	private String adresse;
	private int etage;
	private String proprio;
	
	/**/
	public Maison(String adresse, int etage, String proprio) {
		this.adresse = adresse;
		this.etage = etage;
		this.proprio = proprio;
	}

	/**/
	@Override
	public String toString() {
		return "Cette maison se situe à l'adresse : \"" + this.adresse + 
				"\", elle posède " + this.etage + " etage(s) et le proprio est " + this.proprio ;
	}

	/**/
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}

	public String getProprio() {
		return proprio;
	}

	public void setProprio(String proprio) {
		this.proprio = proprio;
	}
	
	
}
