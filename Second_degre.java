import java.util.Scanner;
public class Second_degre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0, b = 1, c = 1, X0 = 0, X1 = 0, X2 = 0;
        do {
            System.out.println("Veuillez saisir la valeur de a");
            System.out.println("Veillez à ce que sa valeur soit non nulle");
            a = sc.nextDouble();
        } while (a == 0);
        System.out.println("Veuillez saisir la valeur de b");
        b = sc.nextDouble();
        System.out.println("Veuillez saisir la valeur de c");
        c = sc.nextDouble();
        double delta = (b*b-4*a*c);
        if (delta == 0){
            X0 = (-b/(2*a));
            System.out.println("La solution de cette équation est X0 = "+X0);
        }
        else if(delta > 0){
            X1 = (-b-Math.sqrt(delta))/(2*a);
            X2 = (-b+Math.sqrt(delta))/(2*a);
            System.out.println("Les solutions de cette équation sont X1 = "+X1+" et X2 = "+X2);
        }
        else{
            X0 = (-b/(2*a));
            X1 = (Math.sqrt(-delta))/(2*a);
            System.out.println("Les solutions de cette équation sont X1 = "+X0+"+i"+X1+" et X2 = "+X0+"-i"+X1);
        }
        sc.close();
    }
}
