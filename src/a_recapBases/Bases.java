package a_recapBases;

public class Bases {
	
	//la méthode main ne sert qu'a lancer notre programme
	//evitez d'ecrire le tout dedans
	public static void main(String[] args) {
		//testBases();
	}
	
	
	
	public static void testBases(){
		//###### Test avec appels de methodes (voir bas de la page pour les methodes) ######
		System.out.println("Voici mon message :");
		System.out.println(welcome() + welcome2());

		addition(5, 15);
		System.out.println("Hors de ma méthode " + division(5.5 ,100));

		//###### Exo sans methodes ######
		//les conditions
		int x; //on déclare la variable x
		x = 0; //on initialise la variable x
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
		//les boucles
		int a = 0;//on déclare et initialise la variable a
		int b = 0;

		while (a < 5) {
			b = b + 2;
			a = a + 1;
		}

		System.out.println("b = " + b);
		System.out.println("a = " + a);

		//Attention, le do while execute une premiere fois le code avant
		//de verifier si la condition est remplie
		a = 0; //on reinitialise les valeurs à 0
		b = 0;

		do {
			b = b+ 2;
			a = a + 1;
		}while(a < 5);

		System.out.println("b = " + b);
		System.out.println("a = " + a);

		//le for est toujours composé de 3 parties :
		//la déclaration/initialisation | la conditions | l'incrémentation/déincrementation
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
		
		
		//Le for each
		int [] tabI= {5,2,3,4,6}; //déclaraton/initialisation du tableau
		
		for (int i : tabI) { //for each "int" in tabI (pour chaque "int" dans tabI)
			System.out.println(i);
		}
	}//fin de la méthode testBases()	
	//#################################################################

	//############# Les methodes (fonction ou procédure) ###########
	
	//fonction qui retourne un string Bonjour
	public static String welcome() { //entete = Welcome()message string;
		return "Bonjour";
	}


	//fonction aussi
	public static String welcome2(){
		return " a vous !";
	}

	//#### procedure avec parametres ####
	//Addition( premierChiffre: int ; deuxiemeChiffre : int );
	public static void addition( int premierChiffre, int deuxiemeChiffre) {

		int nombreTemp; //déclaration de la variable ( on reserve un espace mémoire)
		nombreTemp = premierChiffre + deuxiemeChiffre; //initialisation d la variable ( on lui donne une valeur)
		System.out.println( nombreTemp);
	}

	//#### fonction avec parametres ####
	//Division( prems : double ; deums : double ) nombreTemp : double;
	//Attention!!!!, fonction car retourne un double
	public static double division(double prems, double deums) {
		double nombreTemp;  //la variable n'est pas la même que celle de la procédure ci-dessus 
							//a cause de la portée des variables (comprise entre {} )
		nombreTemp = prems / deums;
		System.out.println("Dans ma méthode : " + nombreTemp);
		return nombreTemp;
	}
}
