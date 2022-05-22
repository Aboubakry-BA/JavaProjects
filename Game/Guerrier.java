public class Guerrier extends Personnage {
    public void combattre() {
        if(this.armes.equals("pistolet"))
            System.out.println("Attaque au pistolet !");
        else if(this.armes.equals("fusil de sniper"))
            System.out.println("Attaque au fusil de sniper !");
        else
            System.out.println("Attaque au couteau !");
    }
}