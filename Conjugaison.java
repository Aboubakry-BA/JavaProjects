import java.util.Scanner;

/**
 *
 * @author Aboubakry
 */
public class Conjugaison {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir un verbe du premier groupe");
		String verbe = scanner.nextLine();
		if (verbe.equals("numeric")) {
			System.out.println("Veuillez saisir un verbe du premier groupe");
		} else {
			int T = verbe.length() - 2;
			String radical = verbe.substring(0, T);
			String pronom[] = { "j'", "tu", "il/elle", "nous", "vous", "ils/elles" };
			String terms1[] = { "e", "es", "e", "ons", "ez", "ent" };
			String terms2[] = { "ai", "as", "a", "ons", "ez", "ont" };
			String debut = verbe.substring(0, 1);
			String voyelles[] = { "i", "u", "o", "a", "e", "é", "ê", "è" };
			if ("er".equals(verbe.substring(T))) {
				if (verbe.equals("aller")) {
					System.out.println("Le verbe aller n'est pas du premier groupe");
				} else {
					System.out.println("Present de l'indicatif");
					if (in_array(debut, voyelles)) {
						for (int i = 0; i < 6; i++) {
							System.out.println(pronom[i] + " " + radical + "" + terms1[i]);
						}
					} else {
						System.out.println("je " + radical + "e");
						for (int i = 1; i < 6; i++) {
							System.out.println(pronom[i] + " " + radical + "" + terms1[i]);
						}
					}
					System.out.println("Futur simple de l'indicatif");
					if (in_array(debut, voyelles)) {
						for (int i = 0; i < 6; i++) {
							System.out.println(pronom[i] + " " + verbe + "" + terms2[i]);
						}
					} else {
						System.out.println("je " + verbe + "ai");
						for (int i = 1; i < 6; i++) {
							System.out.println(pronom[i] + " " + verbe + "" + terms2[i]);
						}
					}
				}
			} else {
				System.out.println("Veuillez saisir un verbe du premier groupe");
			}
		}
		scanner.close();
	}

	public static boolean in_array(String x, String[] tab) {
		boolean seTrouve = false;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i].equals(x))
				seTrouve = true;
		}
		return seTrouve;
	}
}
