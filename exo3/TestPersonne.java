import java.text.*;

public class TestPersonne{
	public static void main(String[] args) throws ParseException{
		Personne P1 = new Personne();
		Personne.initialiserPersonne(P1);
		System.out.println(P1.GetPrenom());
	}
}