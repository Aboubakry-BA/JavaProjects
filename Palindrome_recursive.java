import java.util.Scanner;
public class Palindrome_recursive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez une chaine de caractères");
        String chaine1 = sc.next().toUpperCase();
        boolean bool = recursivite(chaine1);
        if (bool)
            System.out.println("On a donc un palindrome");
        else 
            System.out.println("On n'a pas un palindrome");
        sc.close();
    }
    public static boolean recursivite(String ch) {
        int j = ch.length()-1;
        if (ch.length() == 0 || ch.length() == 1) {
            return true;
        }
        if (ch.charAt(0) == ch.charAt(j)) {
            ch = ch.substring(1,j);
            return recursivite(ch);
        }
        else return false;
    }
}