public class Classe{
	private String nom;
	private int nombre;
	private int promotion;
	private Eleve[] liste;
	public Classe(){}
	public Classe(String vnom, int vnombre, int vpromotion,Eleve[] vliste)
	{
		nom=vnom;
		nombre=vnombre;
		promotion=vpromotion;
		liste=vliste;
	}
	public String getNom(){return nom;}
	public void setNom(String vnom){nom=vnom;}
	public int getNombre(){return nombre;}
	public void setNombre(int vnombre){nombre=vnombre;}
	public int getPromotion(){return promotion;}
	public void setPromotion(int vpromotion){promotion=vpromotion;}
	public Eleve[] getListe(){return liste;}
	public void setListe(Eleve[] vliste){liste=vliste;}
}
