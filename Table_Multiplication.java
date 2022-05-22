import java.util.Scanner;
public class Table_Multiplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        do {
            System.out.println("Veuillez saisir une valeur positive");
            a = sc.nextInt();
        }while (a < 0);
        for (int i = 1; i <= a; i++) {
            System.out.println("Table de "+i);
            for (int j = 1; j < 13; j++) {
                System.out.println(i+"*"+j+"="+(i*j));
            }
            System.out.println();
        }
        sc.close();
    }
}
