package a_bases;

public class A_Test_Bases {
	
	/* La méthode main ne sert qu'à lancer notre programme.
	 * INTERDICTION d'écrire tout votre code dedans.
	 * Elle est par ailleurs statique comme toutes les méthodes du package a_bases.
	 * Ce qui signifie qu'elles sont intépendantes de tout objet. (On ne crée pas d'objet pour les utiliser).*/
	public static void main(String[] args) {
		
		// appel de la méthode static testStructure qui se trouve dans class C_Structures_de_Controle
		//C_Structures_de_Controle.testStructures();
		C_Structures_de_Controle.dessineMoiUnSapin();
		// appel de la méthode static testMethodes qui se trouve dans class D_Methodes
		//D_Methodes.testMethodes();
	}
}
