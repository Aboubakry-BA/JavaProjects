//import java.util.Date;
import java.util.Scanner;
//import java.text.SimpleDateFormat;

public class TestClasse {
    public static void main(String[] args) {
        Classe C = new Classe();
        creerClasse(C);
        System.out.println("--------------------------------------------------------------------");
        afficherClasse(C);
    }
    public static void creerClasse(Classe C){
        String nomClasse;
        int nbrEleve;
        //Date anneeSortie = new Date();

        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir le nom de la classe  ");
        //sc.nextLine();
        nomClasse = sc.nextLine();
        System.out.println();
        System.out.print("Saisir le nbre d'élèves  ");
        nbrEleve = sc.nextInt();
        System.out.println();
        Eleve[] liste = new Eleve[nbrEleve];
        /*
            System.out.print("Saisir l'Année de sortie  ");
            String vanneeSortie = sc.next();
            System.out.println();
            anneeSortie = Date.valueOf(vanneeSortie);
            SimpleDateFormat D = new SimpleDateFormat("yyyy");
            anneeSortie = D.parse(vanneeSortie);
        */
        
        for (int i = 0; i < nbrEleve; i++) {
            TestEleve.creerEleve(liste[i]);
        }
        sc.close();
    }
    public static void afficherClasse(Classe C){
        System.out.println("Le nom de la classe est "+C.getnomClasse());
        System.out.println();
        System.out.println("Le nombre d'élèves est de "+C.getnbrEleve());
        System.out.println();
        //System.out.println("L'année de sortie est "+C.getanneeSortie());
        System.out.println();
        for (int i = 0; i < C.getnbrEleve(); i++) {
            TestEleve.afficherEleve(C.getliste()[i]);
        }
    }
}
