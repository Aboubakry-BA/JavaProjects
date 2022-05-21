import java.util.Scanner;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        AttackFactory attackFactory = new AttackFactory();

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un mot de passe");
        String psw = sc.nextLine();

        System.out.println("Cracker password par :");
        System.out.println("1: Brute Force!:");
        System.out.println("2: Dictionnaire:");

        int choix = sc.nextInt();

        switch (choix) {
            case 1:
                Attack bruteForce = attackFactory.getAttack("Brute force");
                long debut = System.currentTimeMillis();
                bruteForce.attack(psw);
                long fin = System.currentTimeMillis();
                System.out.println("La recherche a durée "+((fin-debut)/1000)+" secondes");
                break;
            case 2:
                Attack dictionnaire = attackFactory.getAttack("Dictionnaire");
                long debut2 = System.currentTimeMillis();
                dictionnaire.attack(psw);
                long fin2 = System.currentTimeMillis();
                System.out.println("La recherche a durée "+((fin2-debut2)/1000)+" secondes");
                break;
            default:
                System.out.println("Il faut choisir entre 1 && 2");
                break;
        }
        sc.close();
    }
}
