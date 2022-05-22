import java.util.Scanner;
public class Tableau{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 0;
        float somme = 0f, moyenne = 0f;
        do {
            System.out.println("Saisir le nombre d'éléments du tableau");
            m = sc.nextInt();
            System.out.println("--------------------------------------");
        } while (m < 0);
        float tab[] = new float [m];
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Saisir la valeur numéro "+(i+1));
            tab[i] = sc.nextFloat();
            somme = somme + tab[i];
        }
        System.out.println();
        moyenne = somme/(tab.length);
        float min = tab[0];
        float max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
            if (tab[i] > max) {
                max = tab[i];
            }
            System.out.println("La valeur numéro "+(i+1)+" est "+tab[i]);
        }
        System.out.println();
        System.out.println("La somme des valeurs du tableau est "+somme);
        System.out.println("La somme des valeurs du tableau est "+moyenne);
        System.out.println("La somme valeur minimale du tableau est "+min);
        System.out.println("La somme valeur maximale du tableau est "+max);
        sc.close();
    }
}