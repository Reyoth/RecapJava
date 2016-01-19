package a_bases;

public class Bases {
	
	/* La méthode main ne sert qu'à lancer notre programme.
	 * INTERDICTION d'écrire tout votre code dedans.
	 * Elle est par ailleurs statique comme toutes les méthodes de cette classe Bases.
	 * Ce qui signifie qu'elles sont intépendantes de tout objet. (On ne crée pas d'objet pour les utiliser).*/
	public static void main(String[] args) {
		testBases(); // appel de la méthode testBases
	}
	
	
	public static void testBases(){		
		
		int x; // On déclare la variable x (on reserve un espace mémoire).
		x = 5; // On initialise la variable x (on lui donne une valeur).
		int y; // Les types primitifs sont boolean, byte, short, int, long, double, char.
		y = 3;
		
		// ###### lES STRUCTURES DE CONTROLE ######
		
		/* le test 
		 * 		if (condition) {...}
		 * 		else if (condition) {...}
		 * 		else {...}
		 * La (condition) renvoie TOUJOURS un boolean (true/false).
		 * Il n'est pas obligatoire d'âjouter un "else if / else" si ce n'est pas nécéssaire.
		 * On peut aussi avoir autant de "else if" que l'on souhaite mais cela rend le code difficile à lire,
		 * par contre un "else" n'a JAMAIS de condition*/
		if (x > 0 && y < 0){
			System.out.println("Youpiiie");
		}
		else if(y == 3) {
			System.out.println("C'est égale à 3");
		}
		else if (x > Integer.MAX_VALUE) { // Integer.MAX_VALUE vaut la valeur maximum d'un int soit 2147483647
			System.out.println("là, ca ne va pas etre possible...");
		}
		else if ((y&1)==1) { // comparaison bit à bit, ici on regarde si le 1er bit de y = 1
			System.out.println("on a comparer le 1er bit de y avec 1, si c'est égale c'est qu'il est impaire");
		}
		else {
			System.out.println("Snifff");
		}
		
		/*le switch
		 * cette structure rend plus lisible un code comprennant beaucoup de possibilité
		 * de plus, contrairement au "if", il permet d'executer plusieurs cas à la suite si 
		 * on ne mets pas de "break;".
		 * Ainsi, ici, si x vaut 8 il écrira juste "x = 8" mais si il vaut 5, il écrira :
		 * x = 5
		 * x = 4
		 * x = 3
		 * x = 2
		 * x = 1*/
		switch (x) {
		case 8:
			System.out.println("x = 8");
			break;
		case 7:
			System.out.println("x = 7");
			break;
		case 6:
			System.out.println("x = 6");
			break;
		case 5:
			System.out.println("x = 5");
		case 4:
			System.out.println("x = 4");
		case 3:
			System.out.println("x = 3");
		case 2:
			System.out.println("x = 2");
		case 1:
			System.out.println("x = 1");
			break; // si on oublie ce break, "default" sera aussi executé

		default:
			System.out.println("Je ne sais pas compter jusque là");
			break;
		}

		//#############################################

		int a = 0;// ici on déclare et initialise la variable a
		int b = 0;
		
		/* les boucles
		 * 		while (condition) {...}
		 * Cette boucle permet d'executer le code entre {} tant que sa (condition) est vrai.
		 * Il faut donc bien faire attention a etre sur qu'a un moment, elle devient fause sinon
		 * on aura une boucle folle qui ne s'arretera que quand le programme aura planté ou si
		 * on a forcé sa fermeture.*/
		while (a < 5) {
			b = b + 2; // équivaut à: b+=2;
			a = a + 1; // équivaut à: a++;
		}

		System.out.println("b = " + b);
		System.out.println("a = " + a);
		
		a = 0; // on reinitialise les valeurs à 0
		b = 0; // peut aussi s'écrire:  a = b = 0;

		/* 		Do {...} while (condition);
		 * Comme le "while" sauf qu'ici, il execute une premiere fois le code avant
		 * de verifier si la condition est remplie.
		 * De plus, il fini par ; contrairement au "while"*/
		do {
			b = b + 2;
			a = a + 1;
		}while(a < 5);

		System.out.println("b = " + b);
		System.out.println("a = " + a);

		/* 		for (initialisation;condition;incrémentation) {...}
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
		System.out.println("Dans ma méthode : " + nombreTemp); // à éviter la plus part du temps
		return nombreTemp; // puisqu'on retourne la valeur, on pourra l'afficher dans le main() si nécessaire
	}
}
