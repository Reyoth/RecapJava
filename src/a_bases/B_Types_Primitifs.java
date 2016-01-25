package a_bases;

public class B_Types_Primitifs {
	
	/* Il existe 2 sortes de type en Java :
	 * 	- les types primitifs, qui font référence à une valeur en mémoire
	 * 	- les types Objets, qui font référence à l'ensemble des éléments qui composent l'Objet
	 * 
	 * Il existe 8 types primitifs en Java.
	 * Chaque type primitif posède une class du même nom commancant par une majuscule.
	 * Ces class permettent l'usage de méthodes ou valeurs spécifiques au type donné.
	 * Par exemple la class Double permet d'accéder à la valeur minimum d'un double.
	 * ex : Double.MIN_VALUE
	 * 
	 * Les types entiers :
	 * 	- byte	: codé sur 8 bits, valeur min = -128, valeur max = 127
	 * 	- short	: codé sur 16 bits, valeur min = -32.768, valeur max = 32 767
	 * 	- int	: codé sur 32 bits, valeur min = -2 147 483 648, valeur max = 2 147 483 647
	 * 	- long	: codé sur 64 bits, valeur min = -9 223 372 036 854 775 808, valeur max= 9 223 372 036 854 775 807
	 * 
	 * Les types décimaux :
	 * 	- float : codé sur 32 bits, précision de 7 chiffres, valeur min = 1.4E-45, valeur max = 3.4028235E38
	 * 	- double: codé sur 64 bits, précision de 15 chiffres, valeur min = 4.9E-324, valeur max = 1.7976931348623157E308
	 * 
	 * Le types caractère
	 * 	- char	: codé sur 16 bits, soit 65536 valeurs possibles.
	 * 			  Java utilise l'Unicode dont les 127 premiers caractères sont les caractères ASCII
	 * 
	 * 			  Attention ! les caractères ' " / servent de séparateur.
	 * 			  Pour les utlisiser comme char, il faut utiliser \ devant.
	 * 
	 * Le type booléen
	 * 	- boolean	: codé sur 8 bits, représente une valeur logique "true" ou "false"
	 * 
	 * */
	public static void testPrimitifs(){
		System.out.println("Les types entier :");
		System.out.println("byte min = " + Byte.MIN_VALUE + ", byte max = " + Byte.MAX_VALUE);
		System.out.println("short min = " + Short.MIN_VALUE + ", short max = " + Short.MAX_VALUE);
		System.out.println("int min = " + Integer.MIN_VALUE + ", int max = " + Integer.MAX_VALUE);
		System.out.println("long min = " + Long.MIN_VALUE + ", long max = " + Long.MAX_VALUE);
		System.out.println("\nLes types décimaux :");
		System.out.println("float min = " + Float.MIN_VALUE + ", float max = " + Float.MAX_VALUE);
		System.out.println("double min = " + Double.MIN_VALUE + ", double max = " + Double.MAX_VALUE);
		System.out.println("\nLe type char :");
		System.out.println("\nLe type boolean :");
		
	}

}
