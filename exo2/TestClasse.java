import java.util.Scanner;
public class TestClasse{
	public static void InitialiserClasse(Classe C)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Nom de la classe?");
		String nom=sc.nextLine();
		System.out.println("Nombre d'élèves?");
		int nombre=sc.nextInt();
		System.out.println("Promotion ?");
		int promotion=sc.nextInt();
		System.out.println("Données de l'élève?");
		Eleve dut[]=new Eleve[nombre];
		for (int i=0;i<nombre;i++)
		{
			TestEleve.InitialiserEleve(dut[i]);
		}
	}
}
