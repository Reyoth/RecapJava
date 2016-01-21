package a_bases;

public class D_Methodes {

	/* ###### LES METHODES (fonction ou procédure)###### */
	
	public static void testMethodes(){
		// ###### Test avec appels de methodes (voir bas de la page pour les methodes) ######
		System.out.println("Voici mon message :");
		System.out.println(welcome() + welcome2());

		// addition() étant une méthode qui ne renvoie rien (void), c'est une procédure
		addition(5, 15); 
		// ici, division renvoie un double, c'est donc une fonction
		System.out.println("Hors de ma méthode " + division(5.5 ,100));
	}


	// Méthode qui retourne un string Bonjour (type fonction)
	public static String welcome() { // entête = Welcome()message string;
		return "Bonjour";
	}
	// celle-ci retourne à vous!
	public static String welcome2() {
		return " à vous !";
	}

	// #### Méthode avec parametres (type procédure) ####
	// Entête : addition( premierChiffre: int ; deuxiemeChiffre : int );
	public static void addition( int premierChiffre, int deuxiemeChiffre) {

		int nombreTemp; // déclaration de la variable 
		nombreTemp = premierChiffre + deuxiemeChiffre; // initialisation de la variable
		System.out.println( nombreTemp);
	}

	// #### Méthode avec parametres (type fonction) ####
	// Entête : division( prems : double ; deums : double ) nombreTemp : double;
	// Attention!!!!, de type fonction car retourne un double
	public static double division(double prems, double deums) {
		double nombreTemp;	/* la variable n'est pas la même que celle de la procédureci-dessus
		 * a cause de la portée des variables (comprise entre {} )*/
		nombreTemp = prems / deums;
		System.out.println("Dans ma méthode : " + nombreTemp); // à éviter la plus part du temps
		return nombreTemp; // puisqu'on retourne la valeur, on pourra l'afficher dans le main() si nécessaire
	}
}
