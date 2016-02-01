package a_bases;

public class B_Types_Primitifs {

	/* Il existe 2 sortes de type en Java :
	 *
	 * 	- les types primitifs, qui font référence à une valeur en mémoire
	 * 	- les types Objets, qui font référence à l'ensemble des éléments qui composent l'Objet
	 *
	 * Il existe 8 types primitifs en Java.
	 * Chaque type primitif posède une class du même nom commençant par une majuscule.
	 * Ces class permettent l'usage de méthodes ou valeurs spécifiques au type donné.
	 * Par exemple la class Double permet d'accéder à la valeur minimum d'un double.
	 * ex : Double.MIN_VALUE*/
	public static void testPrimitifs(){

		/* Les types entiers :
		 *
		 * - byte	: codé sur 8 bits, valeur min = -128, valeur max = 127
		 * - short	: codé sur 16 bits, valeur min = -32.768, valeur max = 32 767
		 * - int	: codé sur 32 bits, valeur min = -2 147 483 648, valeur max = 2 147 483 647
		 * - long	: codé sur 64 bits, valeur min = -9 223 372 036 854 775 808, valeur max= 9 223 372 036 854 775 807
		 *
		 * Attention, lors de l'initialisation, il faut ajouter "L" a la valeur du long
		 * exemple	: long l = 50L */
		System.out.println("Les types entier :");

		int a; // déclaration : on reserve un espace mémoire qui vaut null pour l'instant
		a = 0; // initialisation : on assigne une valeur à cet espace

		int b = 5; // délcaration et initialisation en une fois
		int i, ij = 8, kl = 85; // déclaration multiple de même type et initialisation de certaines valeurs

		long l= 85L; // ne pas oublier le "L" pour le long

		System.out.println("a =" + a + ", b =" + b + ", ij =" + ij + ", kl =" + kl + ", l =" + l + ", i =" + (i=8));

		/* Exemple d'utilisation des class liées aux types entier,
		 * elles commencent toujours par une majuscule*/
		System.out.println("byte min = " + Byte.MIN_VALUE + ", byte max = " + Byte.MAX_VALUE);
		System.out.println("short min = " + Short.MIN_VALUE + ", short max = " + Short.MAX_VALUE);
		System.out.println("int min = " + Integer.MIN_VALUE + ", int max = " + Integer.MAX_VALUE);
		System.out.println("long min = " + Long.MIN_VALUE + ", long max = " + Long.MAX_VALUE);

		/* Les types décimaux :
		 *
		 * - float 	: codé sur 32 bits, précision de 7 chiffres, valeur min = 1.4E-45, valeur max = 3.4028235E38
		 * - double	: codé sur 64 bits, précision de 15 chiffres, valeur min = 4.9E-324, valeur max = 1.7976931348623157E308
		 *
		 * Attention, lors de l'initialisation, il faut ajouter "f" a la valeur du float.
		 * De plus, la virgule est toujours symbolisée par un point.
		 * exemple	: float f = 50.95f */
		System.out.println("\nLes types décimaux :");

		float f = 85.52f, g = 0.3256f; // ne par oublier le "f" pour le float
		double d = 12.8523, e = 589654.5236569;

		/* Exemple d'utilisation des class liées aux types decimaux,
		 * elles commencent toujours par une majuscule*/
		System.out.println("float min = " + Float.MIN_VALUE + ", float max = " + Float.MAX_VALUE);
		System.out.println("double min = " + Double.MIN_VALUE + ", double max = " + Double.MAX_VALUE);

		/* Le types caractère
		 * - char	: codé sur 16 bits, soit 65536 valeurs possibles.
		 *
		 * Java utilise l'Unicode dont les 127 premiers caractères sont les caractères ASCII.
		 * Attention ! les caractères ' " / servent de séparateur.
		 * Pour les utlisiser comme char, il faut utiliser \ devant.*/
		System.out.println("\nLe type char :");

		/* Le type booléen
		 * 	- boolean	: codé sur 8 bits, représente une valeur logique "true" ou "false"*/
		System.out.println("\nLe type boolean :");

		boolean p = true, k = false;
		System.out.println("p ET k vaut : " + Boolean.logicalAnd(p, k));
		System.out.println("p OU k vaut : " + Boolean.logicalOr(p, k));
	}

}
