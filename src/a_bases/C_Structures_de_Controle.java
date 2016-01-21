package a_bases;

public class C_Structures_de_Controle {
	
	public static void testStructures(){		

		int x; // On déclare la variable x (on reserve un espace mémoire).
		x = 5; // On initialise la variable x (on lui donne une valeur).
		int y; // Les types primitifs sont boolean, byte, short, int, long, double, char.
		y = 3;

		// ###### lES STRUCTURES DE CONTROLE ######

		/* Le test if
		 * 
		 * 		if (condition) {...}
		 * 		else if (condition) {...}
		 * 		else {...}
		 * 
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
			System.out.println("là, ca ne va pas être possible...");
		}
		else if ((y&1)==1) { // comparaison bit à bit, ici on regarde si le 1er bit de y = 1
			System.out.println("on a comparé le 1er bit de y avec 1, si c'est égale c'est qu'il est impaire");
		}
		else {
			System.out.println("Snifff");
		}

		/* Le switch
		 * 
		 * 		switch (variable) {
		 * 		case comparaison: instruction
		 * 		break;
		 * 		}
		 * 
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


		int a = 0, b = 0; // ici on déclare et initialise la variable a et b qui sont toutes 2 de type int

		/* La boucle while
		 * 
		 * 		while (condition) {...}
		 * 
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

		/* La boucle do while
		 * 
		 * 		do {...} while (condition);
		 * 
		 * Comme le "while" sauf qu'ici, il execute une premiere fois le code avant
		 * de verifier si la condition est remplie.
		 * De plus, il fini par ; contrairement au "while"*/
		do {
			b = b + 2;
			a = a + 1;
		}while(a < 5);

		System.out.println("b = " + b);
		System.out.println("a = " + a);

		/* La boucle for
		 * 
		 * 		for (initialisation ; condition ; (dé)incrémentation) {...}
		 * 
		 * le for est toujours composé de 3 parties bien que la 1ere et la 3eme peuvent rester vide.
		 * Il peut etre utilisé comme simple boucle mais il est surtout très pratique pour
		 * initialiser ou modifier une collection (liste, tableau, ... ).*/
		for (int i = 1; i <= 3; i++) { // i++ peut se noter aussi i = i + 1
			System.out.println("coucou");
		}

		int valeur = 50;
		int[] monTableau= new int[5]; // déclaration d'un tableau de 5 cases allant de 0 à 4

		for (int i = 0; i < monTableau.length; i++) { // monTableau.length = la longueur du tableau donc 5
			monTableau[i] = valeur; // l'indice du tableau s'incrementera au fur et a mesure que la boucle tourne
			valeur = valeur - 10; // se note aussi valeur -= 10;
			System.out.println(monTableau[i]);
		}
		System.out.println("valeur = " + valeur);



		int [] tabI= {5,2,3,4,6}; // déclaraton et initialisation du tableau pour la suite

		/* Le for each
		 * 		for ( type variable : tableau ) {...}
		 * Contrairement au for, le for each est essentiellement utilisé pour parcourir 
		 * les valeurs d'une collection (liste, tableau, ... ).
		 * Ici, "i" ne pointe pas sur une case du tableau mais est une copie de la valeur de cette case.
		 * Ainsi, changer la valeur de i n'aura aucun incident sur les valeurs du tableau parcouru.*/
		for (int i : tabI) { // for each "int" in tabI (pour chaque "int" dans tabI)
			System.out.println(i);
		}			
	}
}
