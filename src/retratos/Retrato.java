package retratos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Retrato {
	Scanner teclado = new Scanner(System.in);
	private String[][] rasgos = { { "PELO", "WWWWWWWWW", "\\\\\\ /////", "|\"\"\"\"\"\"\"|", "|||||||||" },
			{ "OJOS", "| O   O |", "|-(. .)-|", "|-(o o)-|", "| \\   / |" },
			{ "NARIZ", "@   J   @", "{   \"   }", "[   j   ]", "<   -   >" },
			{ "BOCA", "|  ===  |", "|   -   |", "|  ___  |", "|  ---  |" },
			{ "BARBILLA", "\\_______/", "\\,,,,,,,/" } };

	private String retrato = "";

	public Retrato() {
		int numero;
		System.out.println("Escoge una opción o AÑADE un Rasgo:");
		for (int i = 0; i < rasgos.length; i++) {
			for (int z = 1; z < rasgos[i].length; z++) {
				System.out.println(rasgos[i][z]);
			}

			System.out.print(rasgos[i][0] + " :");
			String comando = "";
			try {
				comando = teclado.nextLine();
				numero = Integer.parseInt(comando);
				while (numero < 1 || numero > rasgos[i].length) {
					System.out.println("Error de rango, elige de nuevo:");
					numero = teclado.nextInt();
				}
				retrato += rasgos[i][numero] + "\n";
			} catch (NumberFormatException e) {
				retrato += comando + "\n";
			} catch (InputMismatchException e) {
				System.out.println("Dato de entrada erróneo, elige de nuevo:");
				i--;
			}
		}
	}

	public String toString() {
		return retrato;
	}
}
