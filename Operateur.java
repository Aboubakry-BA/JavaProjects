import java.util.Scanner;

/**
 *
 * @author Aboubakry
 */
public class Operateur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String operateur;
        System.out.println("Saisir le premier nombre");
        int nombre1 =scanner.nextInt();
        System.out.println("Saisir le deuxieme nombre");
        int nombre2 =scanner.nextInt();
        System.out.println("saisir un opérateur:");
        scanner.nextLine();
        operateur=scanner.nextLine();
        int resultat=0;
        switch(operateur){
            case "+":
                resultat=nombre1+nombre2;
                System.out.println("le resultat est:"+resultat);
            break;
            case "-":
                resultat=nombre1-nombre2;
                System.out.println("le resultat est:"+resultat);
            break;
            case "*":
                resultat=nombre1*nombre2;
                System.out.println("le resultat est:"+resultat);
            break;
            case "/":
                if (nombre2!=0){
                resultat=nombre1/nombre2;
                System.out.println("le resultat est:"+resultat);}
                else {
                  System.out.println("le diviseur doit etre different de zero");  
                }
            break;
            case "%":
                if (nombre2!=0){
                resultat=nombre1/nombre2;
                System.out.println("le resultat est:"+resultat);}
                else {
                  System.out.println("le diviseur doit etre different de zero");
                }
               
            break;
            default:
                System.out.println("L'operateur saisi est invalide");
        }
        scanner.close();
    }
    
}
