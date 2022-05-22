import java.util.Scanner;
public class Affichage_matrice {
    public static void main(String[] args) {
        int mat[][];
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner le nombre de vecteurs");
        int n = sc.nextInt();
        mat = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.println("Donner le nombre d'éléments du vecteur numéro "+i+" ");
            int m = sc.nextInt();
            mat[i] = new int [m];
            for (int j = 0; j < m; j++) {
                System.out.println("Donner la valeur de l'élément "+ i+ ", "+j+" ");
                int val = sc.nextInt();
                mat[i][j] = val;
            }
        }
        sc.close();
        System.out.println("Affichage horizontale de le matrice");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++)
            System.out.print(mat[i][j]+ "\t");
            System.out.println();
        }
        System.out.println("Affichage verticale de le matrice");
        int jmax = max (mat);
        for (int j = 0; j < jmax; j++) {
            for (int i = 0; i < mat.length; i++)
                if (j < mat[i].length)
                System.out.print(mat[i][j]+ "\t");
                else
                System.out.print("\t");
                System.out.println();
        }
    }
        public static int max (int [][] matt){
            int vmax = matt[0].length;
            for (int i = 0; i < matt.length; i++)
            if (matt[i].length > vmax) 
            vmax = matt[i].length;
            return vmax;
        }
}