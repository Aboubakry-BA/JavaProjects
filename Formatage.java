import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Formatage{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir une valeur");
        double a = sc.nextDouble();
        int limite;
        do {
            System.out.println("Veuillez saisir le nombre de chiffres après la virgule");
            limite = sc.nextInt();
        } while (limite <= 0);
        String formatage = "#.";
        for (int i = 0; i < limite; i++) {
            formatage += "#";
        }
        NumberFormat f = new DecimalFormat(formatage);
        String s = f.format(a);
        System.out.println("La valeur de a est : "+s);
        sc.close();
    }
}