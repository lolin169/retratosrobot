package retratos;

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
		System.out.println("Escoge una opción:");
		for (int i = 0; i < rasgos.length; i++) {
			for (int z = 1; z < rasgos[i].length; z++) {
				System.out.println(rasgos[i][z]);
			}
			System.out.println(rasgos[i][0] + " :");
			numero = teclado.nextInt();
			while (numero < 1 || numero > rasgos[i].length) {
				System.out.println("Error de rango, elige de nuevo:");
				numero = teclado.nextInt();
			}
			teclado.nextLine();
			retrato += rasgos[i][numero] + "\n";
		}
	}

	public String toString() {
		return retrato;
	}
}
