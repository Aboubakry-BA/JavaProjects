enum Genre{ 
    M, F;
};
public class Eleve {
    //definition des attributs
    private String Prenom;
    private String Nom;
    private Genre Sexe;
    private float Notes[] = new float [3];

    //definition du constructeur sans paramètres
    public Eleve() {
        Prenom = "Aboubakry";
        Nom = "BA";
        Sexe = Genre.M;
        Notes[0] = 20;
        Notes[1] = 20;
        Notes[2] = 20;
    }

    //definition du constructeur avec paramètres
    public Eleve(String vPrenom, String vNom, Genre vSexe, float vNotes[]){
        Prenom = vPrenom;
        Nom = vNom;
        Sexe = vSexe;
        Notes = vNotes;
        
    }
    //definition des accesseurs et mutateurs
    public String getPrenom(){
        return Prenom;
    }
    public void setPrenom(String vPrenom) {
        Prenom = vPrenom;
    }

    public String getNom(){
        return Nom;
    }
    public void setNom(String vNom) {
        Nom = vNom;
    }

    public Genre getSexe(){
        return Sexe;
    }
    public void setSexe(Genre vSexe) {
        Sexe = vSexe;
    }

    public float[] getNotes(){
        return Notes;
    }
    public void setNotes(float vNotes[] ){
        Notes = vNotes;
    }
}