public class Eleve{
	private String nom;
	private String prenom;
	private EnumSexe sexe;
	private float[] note;
	public Eleve(){}
	public Eleve(String vnom, String vprenom,EnumSexe vsexe,float [] vnote)
	{
		nom=vnom;
		prenom=vprenom;
		sexe=vsexe;
		note=vnote;
	}    
	public String getNom(){ return nom;}
	public void setNom(String vnom){nom=vnom;}
	public String getPrenom(){return nom;}
	public void setPrenom(String vprenom){prenom=vprenom;}
	public EnumSexe getSexe(){return sexe;}
	public void setSexe(EnumSexe vsexe){sexe=vsexe;}
	public float [] getNote(){return note;}
	public void setNote(float [] vnote){note=vnote;}
}   	
