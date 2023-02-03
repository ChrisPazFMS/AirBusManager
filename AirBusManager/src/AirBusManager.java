import java.util.HashMap;
import java.util.Scanner;
/**
 * 
 * @author PazmanyC
 * @since V1 date 03/02/2023
 * @
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

		System.out.println(
				"Bienvenue dans l'application de gestion du cycle de vie d'avions AIRBUS \nFaite votre choix dans le menu, saisissez le chiffre correspondant : \n \n");
		System.out.println(
				"1 : Afficher tous les avions \n2 : Afficher tous les avions contenant un mot clé dans le programme \n3 : Ajouter ou supprimer une pièce pour un avion donné \n4 : Afficher un avion avec les infos détaillées de chaque pièces \n5 : Quitter l'application");
		//Boolean start = true;

		Scanner menuChoiceScanner = new Scanner(System.in);
		
		//while(start) {
			
			//Boolean strgScanner = menuChoiceScanner.hasNextInt();
			
			int menuChoice = menuChoiceScanner.nextInt();
			
		

		if (menuChoice == 1) {
			airBusPlaneArray(AirBusPlane);
			//System.out.println("Boolean = " + strgScanner);
			

		} else if (menuChoice != 1) {
			System.out.print("fals = ");
			
		}

		menuChoiceScanner.close();
		}
	//}

	/**
	 * La methode liste les tableaux a 2 dimensions. The method lists 2 dimensional
	 * tables.
	 * 
	 * @param airBusPlane
	 */

	public static void airBusPlaneArray(HashMap<java.lang.Integer, String[]> airBusPlane) {

		String[] takeValuesArray;
		String returnArrayValues = "";
		Object[] keys = airBusPlane.keySet().toArray();

		for (int i = 1; i < airBusPlane.size() + 1; i++) {

			takeValuesArray = airBusPlane.get(i);

			for (int j = 0; j < airBusPlane.get(i).length; j++) {

				returnArrayValues += " " + takeValuesArray[j];

			}

			System.out.println("ID " + keys[i - 1] + " = " + returnArrayValues + " ");

			returnArrayValues = "";

		}

	}

	/**
	 * 
	 * @param airBusPlane
	 * @return
	 */
	public static String airBusPlaneModels(HashMap<java.lang.Integer, String[]> airBusPlane) {

		String[] value = null;

		for (int i = 1; i < airBusPlane.size(); i++) {

			value = airBusPlane.get(i);

		}

		return value[0];
	}

	/**
	 * 
	 * @param airBusPlane
	 */

	public static void airBusPlaneStatus(HashMap<java.lang.Integer, String[]> airBusPlane) {

		String[] value = null;

		for (int i = 1; i < airBusPlane.size(); i++) {

			value = airBusPlane.get(i);

			System.out.println("value = " + value[1]);
		}
	}

	/**
	 * 
	 * @param airBusPlane
	 */
	public static void airBusPlaneType(HashMap<java.lang.Integer, String[]> airBusPlane) {

		String[] value = null;

		for (int i = 1; i < airBusPlane.size(); i++) {

			value = airBusPlane.get(i);

			System.out.println("value = " + value[2]);
		}

	}

}