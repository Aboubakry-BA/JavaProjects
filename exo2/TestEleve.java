import java.util.Scanner;
public class TestEleve
{
	public static void InitialiserEleve(Eleve E)
	{
		System.out.println("Saisissez le nom de l'élève");
		Scanner sc= new Scanner(System.in);
		String nom=sc.next();
		System.out.println("Saisissez le prenom de l'élève");
		sc.nextLine();
		String prenom=sc.nextLine();
		System.out.println("Saisissez le sexe de l'élève");
		String vsexe=sc.next();
		EnumSexe sexe=EnumSexe.valueOf(vsexe);
		System.out.println("Saisissez respectivement la note de maths, d'informatique et d'anglais");
		float [] note=new float[3];
		for(int i=0;i<3;i++)
		{
			float vnote=sc.nextFloat();
			note[i]=vnote;
		}
		E.setNom(nom);
		E.setPrenom(prenom);
		E.setSexe(sexe);
		E.setNote(note);
	}
}
