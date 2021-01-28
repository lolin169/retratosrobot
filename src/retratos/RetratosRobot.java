package retratos;

import java.util.*;

public class RetratosRobot {
	static Scanner teclado = new Scanner(System.in);
	/**
	 * Programa para crear retratos robot con cadenas de caracteres. Una vez
	 * ejecutado el programa, el usuario puede crear tantos retratos como desee
	 * antes de finalizar. Los retratos se crean eligiendo los rasgos de cada
	 * facción.
	 *       PELO          OJOS       NARIZ        BOCA       BARBILLA
	 *  1. WWWWWWWWW 1. |  O O  | 1. @  J  @  1. |  ===  | 1. \_______/
	 *  2. \\\ ///// 2. |-(. .)-| 2. {  "  }  2. |   -   | 2. \,,,,,,,/ 
	 *  3. |"""""""| 3. |-(o o)-| 3. [  j  ]  3. |  ___  |
	 *  4. ||||||||| 4. |  \ /  | 4. <  -  >  4. |  ---  |
	 */
	public static void main(String[] args) {
		String repetir;
		ArrayList<Retrato> coleccion = new ArrayList<Retrato>();
		do {
			System.out.println("RETRATOS ROBOT");
			coleccion.add(new Retrato());
			System.out.println(RetratosRobot.muestraRetrato(coleccion));
			System.out.println("Pulse cualquier tecla para REPETIR o S para SALIR");
			repetir = teclado.nextLine();
		} while (!(repetir.equalsIgnoreCase("s") || repetir.equalsIgnoreCase("salir"))); // REPETIR O SALIR
		System.out.println("Fin del programa.");
	}

	public static String muestraRetrato(ArrayList<Retrato> coleccion) {
		int contador = 0;
		String colection = "Sus Retratos son:\n";
		for (Retrato retrato : coleccion) {
			colection += "Retrato " + (++contador) + ":\n----------\n" + retrato + "\n";
		}
		return colection;
	}
}