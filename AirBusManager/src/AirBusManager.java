import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * @author PazmanyC
 * @since V1 date 03/02/2023
 *
 */
public class AirBusManager {

	public static void main(String[] args) {

		HashMap<Integer, String[]> AirBusPlane = new HashMap<Integer, String[]>();

		String[] A320 = { "A320", "PLM_AIRBUS_IN_SERVICE", "Passenger" };
		AirBusPlane.put(1, A320);

		String[] A400M = { "A400M", "PLM_AIRBUS_DEFINITION", "Cargo" };
		AirBusPlane.put(2, A400M);

		String[] A350 = { "A350", "PLM_AIRBUS_FEASABILITY", "Passenger" };
		AirBusPlane.put(3, A350);

		String[] A380 = { "A380", "PLM_AIRBUS_STOPPED", "Passenger" };
		AirBusPlane.put(4, A380);

		Scanner menuChoiceScanner = new Scanner(System.in);

		System.out.println(Constant.GREEN
				+ "Bienvenue dans l'application de gestion du cycle de vie d'avions AIRBUS \nFaite votre choix dans le menu, saisissez le chiffre correspondant\n"
				+ Constant.BLACK);

		Boolean start = true;
		String ViewAllAircraft = "1";
		String aircraftKey = "2";

		while (start) {

			System.out.println(Constant.BLACK
					+ "1 : Afficher tous les avions \n2 : Afficher tous les avions contenant un mot clé dans le programme \n3 : Ajouter ou supprimer une pièce pour un avion donné \n4 : Afficher un avion avec les infos détaillées de chaque pièces \n5: Quitter l'application "
					+ Constant.YELLOW + "OU Saisissez stop, puis entrez.\n");

			Boolean strgScanner = menuChoiceScanner.hasNextInt();

			String menuChoice = menuChoiceScanner.next();
			System.out.println();

			start = Methode.getOut(menuChoice);

			if (ViewAllAircraft.equals(menuChoice)) {
				Methode.airBusPlaneArray(AirBusPlane, "null");
				System.out.println();

			} else if (aircraftKey.equals(menuChoice)) {
				System.out.println("Veuillez saisir un mot clé !");

				String aircraftKeyScanner = menuChoiceScanner.next();

				System.out.println();

				Methode.airBusPlaneArray(AirBusPlane, aircraftKeyScanner.toUpperCase());

				System.out.println();

			} else if (!strgScanner) {
				System.out.println(start ? "Veuillez saisir un chiffre, s'il vous plaît ! \n" : "");

			} else if (Integer.parseInt(menuChoice) > 5) {
				System.out.println("Veuillez saisir un nombre entre 1 et 5 ! \n");
			}

		}
		menuChoiceScanner.close();
	}

}