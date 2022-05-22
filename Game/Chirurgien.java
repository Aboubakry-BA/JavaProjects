public class Chirurgien extends Personnage{
    public void soigner(){
        if(this.sacDeSoin.equals("gros sac"))
            System.out.println("Je fais des merveilles.");
        else
            System.out.println("Je fais des opérations.");
    }
}