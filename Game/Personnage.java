public abstract class Personnage {
    protected String armes = "", chaussure = "", sacDeSoin = "";
    public void seDeplacer(){
        System.out.println("Je me déplace à pied.");
    }
    public void combattre(){
        System.out.println("Je ne combats PAS !");
    }
    public void soigner(){
        System.out.println("Je ne soigne pas.");
    }
    protected void setArmes(String armes) {
        this.armes = armes;
    }
    protected void setChaussure(String chaussure) {
        this.chaussure = chaussure;
    }
    protected void setSacDeSoin(String sacDeSoin) {
        this.sacDeSoin = sacDeSoin;
    }
}