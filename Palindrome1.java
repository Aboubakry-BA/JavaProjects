import java.util.Scanner;
public class Palindrome1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez une chaine de caractères");
        String chaine1 = sc.next();
        chaine1 = chaine1.toUpperCase();
        StringBuilder strb = new StringBuilder(chaine1);
        String chaine2 = strb.reverse().toString();
        System.out.println("La chaine inverse est "+chaine2);
        if(chaine1.equals(chaine2))
            System.out.println("Par conséquent "+chaine1+" est un palindrome");
        else 
            System.out.println("Par conséquent "+chaine1+" n'est pas un palindrome");
        sc.close();
    }
}