public class Factoriel {
    public static void main(String[] args) {
        int a = 5;
        if (a != 0) {
            for(int i = a-1; i > 0; i--){
                a = a*i;
            }
            System.out.println("Son factoriel est: "+a);
        }
        else System.out.println("Le factoriel de 0 est: 1");
    }
}