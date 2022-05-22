public class Etudiant {
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