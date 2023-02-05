import java.util.HashMap;

/**
 * 
 * @author PazmanyC
 *
 */
public class Methode {

	/**
	 * Arrete le programme Le programme quand on ecrit STOP.
	 * @param stop ecrire stop
	 * @return Boolean true pour quitter le programme OU false pour continuer
	 */
	public static Boolean getOut(String stop) {
		String stopComparingString = "stop";
		String stopComparingNumber = "5";

		if (stopComparingString.equals(stop) || stopComparingNumber.equals(stop)) {

			System.out.println("Merci et au revoir !");

			return false;
		}

		return true;

	}

	/**
	 * Pour parcourir uniquement un tableau a 2 dimensions Veuillez mettre en
	 * deuxieme parametre "null"
	 * <br>
	 * Pour rechercher une chaine de caracteres dans le tableau a
	 * 2 dimensions, veuillez mettre en deuxieme parametre la valeur de la chaine de caracteres.
	 * 
	 * @param airBusPlane = Array
	 * @param search      = "null" OU String
	 */
	public static void airBusPlaneArray(HashMap<java.lang.Integer, String[]> airBusPlane, String search) {

		String[] takeValuesArray;
		String returnArrayValues = "";
		Object[] keys = airBusPlane.keySet().toArray();
		String str = "null";
		Boolean bool = false;
		int counte = 0;

		for (int i = 1; i < airBusPlane.size() + 1; i++) {

			takeValuesArray = airBusPlane.get(i);
			counte += 1;

			for (int j = 0; j < airBusPlane.get(i).length; j++) {
				/**
				 * Conditions si correspondance avec valeur = chaine de caracteres en vert.
				 */
				if (takeValuesArray[j].toUpperCase().contains(search.toUpperCase())) {
					returnArrayValues += Constant.GREEN + " " + takeValuesArray[j].toUpperCase() + Constant.BLACK;
					bool = true;

				} else {
					/**
					 * Ou laisse un espace.
					 */
					returnArrayValues += " " + takeValuesArray[j].toUpperCase();

				}

			}

			if (bool == false && counte == airBusPlane.get(i).length + 1 && search != str) {

				System.out.println(Constant.YELLOW + "Aucune correspondance avec : " + Constant.RED + search
						+ Constant.YELLOW + "\nJ'en suis vraiment navré!");
				System.out.println("COUNT = " + counte);

				break;

			} else if (returnArrayValues.contains(search.toUpperCase())) {

				System.out.println(Constant.YELLOW + "Correspondance =" + Constant.RED + " ID " + keys[i - 1]
						+ Constant.BLACK + " " + returnArrayValues);

			} else if (str.equalsIgnoreCase(search.toUpperCase())) {
				System.out.println(

						Constant.YELLOW + "ID = " + Constant.RED + keys[i - 1] + Constant.BLACK + " "
								+ returnArrayValues + Constant.BLACK);

			}

			returnArrayValues = "";

		}

	}

	/**
	 * NOT FUNCTIONAL
	 * @param airBusPlane prend un tableau
	 * @return string
	 */

	public static String airBusPlaneValue(HashMap<java.lang.Integer, String[]> airBusPlane) {

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
		return returnArrayValues;

	}

}
