package a_bases;

public class Bases {
	
	/* La méthode main ne sert qu'à lancer notre programme
	 * interdiction d'écrire le tout votre code dedans.
	 * Elle est par ailleurs statique comme toutes les méthodes de cette classe Bases.
	 * Ce qui signifie qu'elles sont intépendantes de tout objet.*/
	public static void main(String[] args) {
		testBases(); // appel de la méthode testBases
	}
	
	
	public static void testBases(){		
		// les conditions
		int x; // on déclare la variable x (on reserve un espace mémoire)
		x = 0; // on initialise la variable x (on lui donne une valeur)
		int y;
		y = 2;

		if (x > 0 && y < 0){
			System.out.println("Youpiiie");
		}
		else if(y == 3) {

		}
		else {
			System.out.println("Snifff");
		}

		//#############################################
		// les boucles
		int a = 0;// ici on déclare et initialise la variable a
		int b = 0;
		
		/* While (condition) {...}
		 * TODO*/
		while (a < 5) {
			b = b + 2;
			a = a + 1;
		}

		System.out.println("b = " + b);
		System.out.println("a = " + a);
		
		a = 0; // on reinitialise les valeurs à 0
		b = 0;

		/* Do {...} while (condition); 
		 * Attention, le do while execute une premiere fois le code avant
		 * de verifier si la condition est remplie*/
		do {
			b = b+ 2;
			a = a + 1;
		}while(a < 5);

		System.out.println("b = " + b);
		System.out.println("a = " + a);

		/* For (initialisation;condition;incrémentation) {...}
		 * le for est toujours composé de 3 parties :
		 * l'initialisation du compteur | la conditions | l'(dé)incrémentation du compteur*/
		for (int i = 1; i <= 3; i++) { //i++ peut se noter aussi i = i + 1
			System.out.println("coucou");
		}

		int valeur = 50;
		int[] monTableau= new int[5]; //déclaration d'un tableau d 5 cases allant de 0 à 4

		for (int i = 0; i < monTableau.length; i++) { //monTableau.length = la longueur du tableau donc 5
			monTableau[i] = valeur; //l'indice du tableau s'incrementera au fur et a mesure que la boucle tourne
			valeur = valeur - 10;
			System.out.println(monTableau[i]);
		}
		System.out.println("valeur = " + valeur);
		
		
		// Le for each TODO
		int [] tabI= {5,2,3,4,6}; //déclaraton/initialisation du tableau
		
		for (int i : tabI) { //for each "int" in tabI (pour chaque "int" dans tabI)
			System.out.println(i);
		}
		
		//###### Test avec appels de methodes (voir bas de la page pour les methodes) ######
		System.out.println("Voici mon message :");
		System.out.println(welcome() + welcome2());
		
		// addition() étant une méthode qui ne renvoie rien (void), c'est une procédure
		addition(5, 15); 
		// ici, division renvoie un double, c'est donc une fonction
		System.out.println("Hors de ma méthode " + division(5.5 ,100));
				
	}// fin de la méthode testBases()	
	//#################################################################

	//############# Les méthodes (fonction ou procédure) ###########
	
	//Méthode qui retourne un string Bonjour (fonction)
	public static String welcome() { // entête = Welcome()message string;
		return "Bonjour";
	}
	//celle-ci retourne à vous!
	public static String welcome2(){
		return " à vous !";
	}

	//#### Méthode avec parametres (type procédure) ####
	//Entête : addition( premierChiffre: int ; deuxiemeChiffre : int );
	public static void addition( int premierChiffre, int deuxiemeChiffre) {

		int nombreTemp; // déclaration de la variable 
		nombreTemp = premierChiffre + deuxiemeChiffre; // initialisation de la variable
		System.out.println( nombreTemp);
	}

	//#### Méthode avec parametres (type fonction) ####
	// Entête : division( prems : double ; deums : double ) nombreTemp : double;
	// Attention!!!!, de type fonction car retourne un double
	public static double division(double prems, double deums) {
		double nombreTemp;	/* la variable n'est pas la même que celle de la procédureci-dessus
							 * a cause de la portée des variables (comprise entre {} )*/
		nombreTemp = prems / deums;
		System.out.println("Dans ma méthode : " + nombreTemp);
		return nombreTemp;
	}
}
