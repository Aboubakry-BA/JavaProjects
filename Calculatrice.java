public class Calculatrice {
    public static void main(String [] args) {
        if(args.length == 3){
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[2]);
            switch (args[1])
            {
                case "+" : System.out.println(a+b);
                break;
                case "-" : System.out.println(a-b);
                break;
                case "x" : System.out.println(a*b);
                break;
                case "/" : 
                    if(b!= 0){
                        System.out.println(a/b);
                    }else{
                        System.out.println("Impossible de diviser par 0");
                    } 
                break;
                default:
                        System.out.println("Opérateur inconnu");
            }
        }else
        {
            System.out.println("Erreur! Veuillez saisir trois arguments");
        }
    }
}
