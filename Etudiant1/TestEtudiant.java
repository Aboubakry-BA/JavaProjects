class Etudiant {
    //definition des attributs
    private String Nom;
    //definition du constructeur avec paramètre
    public Etudiant(String vNom){
        Nom = vNom;
    }
    //definition des methodes
    public void travailler(){
        System.out.println(this.Nom+" se met au travail !");
    }
    public void seReposer(){
        System.out.println(this.Nom+" se repose");
    }
}
public class TestEtudiant{
    public static void main(String[] args){
        Etudiant E1 = new Etudiant("Moussa");
        E1.travailler();
        E1.seReposer();
    }
}