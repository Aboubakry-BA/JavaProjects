public class Civil extends Personnage{
    public void combattre(){
        if(this.armes.equals("couteau"))
            System.out.println("Attaque au couteau !");
        else
            System.out.println("Je ne combats PAS !");
    }
}