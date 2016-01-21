package b_objet;

public class TestObjet {

	public static void main(String[] args) {
		
		int a = 5;
		Integer z = new Integer(10);
		z.toString();
		
		Object monObjet = new Object();
		Voiture mercedes = new Voiture( "grise" , "mercedes class A" , 142);		
		Maison petiteMaison = new Maison("rue du pendu n°13, 404 CoinPerdu", 2 , "Biloutte");
		
		monObjet.toString();
		mercedes.toString();
		"aaaa".toUpperCase();
		petiteMaison.toString();

	}

}
