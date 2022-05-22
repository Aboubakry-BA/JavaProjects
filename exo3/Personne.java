import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.*;

public class Personne{
	private String nom;
	private String prenom;
	private EnumSexe sexe;
	private Date ddn;
	private int salaire;
	private int revenu;
	private Double charges;
	private EnumMatri situmatri;

	public Personne(){};
	public Personne( String vnom,String vprenom,EnumSexe vsexe,Date vddn,int vsalaire,int vrevenu,Double vcharges,EnumMatri vsitumatri){
		this.nom=vnom;
		this.prenom=vprenom;
		this.sexe=vsexe;
		this.ddn=vddn;
		this.salaire=vsalaire;
		this.revenu=vrevenu;
		this.charges=vcharges;
		this.situmatri=vsitumatri;
	}

	public String GetNom(){return this.nom;}
	public String GetPrenom(){return this.prenom;}
	public EnumSexe GetSexe(){return this.sexe;}
	public Date Getddn(){return this.ddn;}
	public int GetSalaire(){return this.salaire;}
	public int GetRevenu(){return this.revenu;}
	public Double GetCharges(){
		this.charges=(this.salaire*0.2)+(0.15*this.revenu);
		return this.charges-(this.charges*situmatri.getReduction());
	}
	public EnumMatri GetSitumatri(){return this.situmatri;}


	public void SetNom(String vnom){this.nom=vnom;}
	public void SetPrenom(String vprenom){this.prenom=vprenom;}
	public void SetSexe(EnumSexe vsexe){this.sexe=vsexe;}
	public void Setddn(Date vddn){this.ddn=vddn;}
	public void SetSalaire(int vsalaire){this.salaire=vsalaire;}
	public void SetRetenu(int vrevenu){this.revenu=vrevenu;}
	public void SetCharges(Double vcharges){this.charges=vcharges;}
	public void SetSitumatri(EnumMatri vsitumatri){this.situmatri=vsitumatri;}

	public static void initialiserPersonne(Personne P) throws ParseException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir nom: ");
		String vnom = sc.nextLine();
		System.out.println("Saisir prenom: ");
		String vprenom = sc.nextLine();
		String vvsexe;
		do{
			System.out.println("Saisir sexe: ");
			vvsexe = sc.nextLine().toUpperCase();
		}while(!vvsexe.equals("M") && !vvsexe.equals("F"));
		EnumSexe vsexe = EnumSexe.valueOf(vvsexe);
		System.out.println("Saisir ddn: ");
		String vvddn = sc.next();
		SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
		Date vddn = f.parse(vvddn);
		System.out.println("Saisir salaire: ");
		sc.nextLine();
		int vsalaire = sc.nextInt();
		System.out.println("Saisir autres revenus: ");
		int vrevenu = sc.nextInt();
		System.out.println("Saisir sitution matrimoniale: ");
		String vvmatri;
		do{
  	  		System.out.println("Entrer votre situation matrimoniale: ");
  	  		vvmatri = sc.nextLine().toUpperCase();

  	  	} 
  	  	while(!(vvmatri.equals("CELIBATAIRE")) && !(vvmatri.equals("MARIESANSENF"))  && !(vvmatri.equals("MARIEAVECENF")));
  	  	EnumMatri vmatri = EnumMatri.valueOf(vvmatri);

		P.SetNom(vnom);
		P.SetPrenom(vprenom);
		P.SetSexe(vsexe);
		P.Setddn(vddn);
		P.SetSalaire(vsalaire);
		P.SetRetenu(vrevenu);
		P.SetSitumatri(vmatri);

		sc.close();

	}

}