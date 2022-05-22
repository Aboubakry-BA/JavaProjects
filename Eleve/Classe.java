import java.util.Date;

public class Classe{
    //definition des attributs
    private String nomClasse;
    private int nbrEleve;
    private Date anneeSortie;
    private Eleve[] liste = new Eleve[nbrEleve];

    //definition du constructeur sans paramètres
    public Classe() {}

    //definition du constructeur avec paramètres
    public Classe(String vnomClasse, int vnbrEleve, Date vanneeSotie, Eleve[] vliste){
       nomClasse = vnomClasse;
       nbrEleve = vnbrEleve;
       anneeSortie = vanneeSotie;
       liste = vliste;
    }

    //definition des accesseurs(getters)
    public String getnomClasse(){
        return nomClasse;
    }
    public int getnbrEleve(){
        return nbrEleve;
    }
    public Date getanneeSortie(){
        return anneeSortie;
    }
    public Eleve[] getliste(){
        return liste;
    }

    //definition des mutateurs(setters)
    public void setnomClasse(String vnomClasse){
        nomClasse = vnomClasse;
    }
    public void setnbrEleve(int vnbrEleve){
        nbrEleve = vnbrEleve;
    }
    public void setanneeSortie(Date vanneeSortie){
        anneeSortie = vanneeSortie;
    }
    public void setliste(Eleve[] vliste){
        liste = vliste;
    }
}
