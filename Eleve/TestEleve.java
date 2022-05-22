import java.util.Scanner;
public class TestEleve {
    public static void main(String[] args) {
        Eleve E = new Eleve();
        creerEleve(E);
        System.out.println("--------------------------------------------------------------------");
        System.out.println();
        afficherEleve(E);
    }
    public static void creerEleve(Eleve E){
        String Prenom;
        String Nom;
        Genre Sexe;
        float Notes[] = new float [3];

        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir le nom de l'eleve ");
        Nom = sc.next();
        System.out.println();
        System.out.print("Saisir le prénom de l'éleve ");
        sc.nextLine();
        Prenom = sc.nextLine();
        System.out.println();
        
        String vsexe;
        do {
            System.out.print("Saisir le sexe de l'élève (M/F) ");
            vsexe = sc.next().toUpperCase();
            System.out.println();
        } while (!vsexe.equals("M") && !vsexe.equals("F"));
        Sexe = Genre.valueOf(vsexe);
        System.out.println("Saisir succesivement les notes d'informatique, de maths et d'anglais");
        System.out.println();
        for (int i = 0; i < Notes.length; i++) {
            do {
                System.out.print("Saisir la note "+(i+1)+"  ");
                Notes[i] = sc.nextFloat();
                System.out.println();
            } while (Notes[i] < 0 || Notes[i] > 20);
        }
        
        E.setNom(Nom);
        E.setPrenom(Prenom);
        E.setSexe(Sexe);
        E.setNotes(Notes);
        sc.close();
    }
    public static void afficherEleve(Eleve E){
        System.out.println("L'élève s'appelle "+E.getPrenom()+" "+E.getNom());
        System.out.println();
        System.out.println("L'élève en question est de sexe "+E.getSexe());
        System.out.println();
        System.out.println(E.getPrenom()+" a eu "+E.getNotes()[0]+" en Informatique");
        System.out.println();
        System.out.println(E.getPrenom()+" a eu "+E.getNotes()[1]+" en Maths");
        System.out.println();
        System.out.println(E.getPrenom()+" a eu "+E.getNotes()[2]+" en Anglais");
        System.out.println();
    }
}