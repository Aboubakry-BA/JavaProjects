import java.util.Scanner;
public class Palindrome2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reverse = "";
        System.out.println("Saisissez une chaine de caractères");
        String chaine1 = sc.next();
        chaine1 = chaine1.toUpperCase();
        for (int i = chaine1.length(); i > 0 ; i--) {
            reverse += chaine1.charAt(i-1);
        }
        System.out.println("La chaine inverse est "+reverse);
        if(chaine1.equals(reverse))
            System.out.println("Par conséquent "+chaine1+" est un palindrome");
        else 
            System.out.println("Par conséquent "+chaine1+" n'est pas un palindrome");
        sc.close();
    }
}