import java.util.Random;
import java.util.Scanner;

public class Tableaux{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 0, n = 0, Min = 5, Max = 10;
        do {
            System.out.println("Saisir le nombre d'éléments du tableau |");
            System.out.print("Veuillez à ce que ce nbre soit positif ");
            m = sc.nextInt();
            System.out.println();
        }while (m < 0);
        int tab1[] = new int [m];
        for (int i = 0; i < tab1.length; i++) {
            System.out.println("Saisir la valeur numéro "+(i+1)+" du tableau ");
            tab1[i] = sc.nextInt();
        }
        System.out.println("------------------------------------");

        Random rand = new Random();
        n = rand.nextInt(Max-Min+1)+Min;
        System.out.println("Une valeur aléatoire est "+n);
        //int tab2[] = new int [n];
        System.out.println("------------------------------------");
        
        parcourirTableau(tab1);
        System.out.println("------------------------------------");
        System.out.println("L'indice du minimum est "+IndiceMinimum(tab1));
        System.out.println("L'indice du maximum est "+IndiceMaximum(tab1));
        System.out.println("------------------------------------");
        System.out.println("La valeur maximale est "+Maximum(tab1));
        System.out.println("------------------------------------");
        Tri_tableau(tab1, m);
        System.out.println("Voici l'affichage du tableau trié");
        parcourirTableau(tab1);
        System.out.println("------------------------------------");
        System.out.println("La moyenne des valeur est "+Moyenne(tab1));
        System.out.println("------------------------------------");
        int[] tab3 = fusion(tab1,tab1);
        parcourirTableau(tab3);
        sc.close();
    }

    public static void parcourirTableau(int[] tab){
        for(int i = 0; i < tab.length; i++)
            System.out.println("la valeur numéro "+(i+1)+" est "+tab[i]+"\t");
    }

    public static int IndiceMinimum(int[] tab){
        int result = 0;
        int Min = tab[0];
        for(int i = 0; i < tab.length; i++){
            if (tab[i] < Min){
                Min = tab[i];
                result = i;
            }
        } 
        return result;   
    }

    public static int IndiceMaximum(int[] tab){
        int result = 0;
        int Max = tab[0];
        for(int i = 0; i < tab.length; i++){
            if (tab[i] > Max){
                Max = tab[i];
                result = i;
            }    
        }
        return result;    
    }

    public static void Tri_Selection(int[] tab, int n){
        
    }

    public static void Tri_tableau(int[] tab, int n){
       for (int i = 0; i < n; i++) {
           for (int j = i; j < n; j++) {
               if (tab[i] > tab[j]) {
                   int temp = tab[i];
                   tab[i] = tab[j];
                   tab[j] = temp;
               }
           }
       }  
    }

    public static int Maximum(int[] tab){
        int Max = tab[0];
        for(int i = 0; i < tab.length; i++){
            if (tab[i] > Max)
                Max = tab[i];
        }
        return Max;
    }

    public static int[] fusion(int[] tab1, int[] tab2){
        int taille = tab1.length + tab2.length, j = 0;
        int tab[] = new int [taille];
        for (int i = 0; i < taille; i++) {
            if (i < tab1.length){
                tab[i] = tab1[i];
            }     
            if (i >= tab1.length){
                tab[i] = tab2[j];
                j++;
            }
        }
        return tab;
    }
    
    public static float Moyenne(int[] tab){
        int somme = 0;
        for(int i = 0; i < tab.length; i++){
            somme+= tab[i];
        }
        return somme/tab.length;
    }

    public static void Recherche(int[] tab, int n){
        boolean existe = false;
        for(int i = 0; i < tab.length; i++){
            if (tab[i]  == n) {
                existe = true;
            }
        }
        if(existe == true)
        {
            System.out.println("l'élement recherché existe dans le tableau");
        }else 
            System.out.println("l'élement recherché n'existe pas dans le tableau");
    }
    
}