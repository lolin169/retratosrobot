package retratos;

import java.util.*;

public class RetratosRobot {
     
	static Scanner teclado= new Scanner(System.in);
	
     public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  Programa para crear retratos robot con cadenas de caracteres. Una vez ejecutado el programa, el usuario puede crear
		  tantos retratos como desee antes de finalizar. Los retratos se crean eligiendo los rasgos de cada facción.
		  
		   PELO                    OJOS                    NARIZ
	  1. WWWWWWWWW           1. | O   O |             1. @   J   @    
	  2. \\\ /////           2. |-(. .)-|             2. {   "   }
	  3. |"""""""|           3. |-(o o)-|             3. [   j   ]
	  4. |||||||||           4. | \   / |             4. <   -   >
	  
	  	   BOCA                    BARBILLA
	  1. |  ===  |            1. \_______/
	  2. |   -   |            2. \,,,,,,,/
	  3. |  ___  |
	  4. |  ---  |
		 
		 **/
		String repetir;
		do {
			System.out.println("RETRATOS ROBOT" );
			String[][] rasgos= { {"PELO","WWWWWWWWW","\\\\\\ /////","|\"\"\"\"\"\"\"|","|||||||||"},
							  {"OJOS","| O   O |","|-(. .)-|","|-(o o)-|","| \\   / |"},
							  {"NARIZ","@   J   @","{   \"   }","[   j   ]","<   -   >"},
							  {"BOCA","|  ===  |","|   -   |","|  ___  |","|  ---  |"},
							  {"BARBILLA","\\_______/","\\,,,,,,,/"}};
			
			String[]retrato=new String[rasgos.length];
			for(int i=0;i<rasgos.length;i++) { 
				retrato[i]=creaRetrato(rasgos[i]);
			}
			muestraRetrato(retrato);
			System.out.println("Pulse R para REPETIR o S para SALIR");
			repetir=teclado.nextLine();
		}
		while(repetir.equalsIgnoreCase("r")||repetir.equalsIgnoreCase("repetir")); // REPETIR O SALIR
		System.out.println("Fin del programa.");
	}
	
	static String creaRetrato(String[]rasgos) {
        int numero=0;
        String rasgo="";
        System.out.println("Escoge una opción:");
		for(int i=1;i<rasgos.length;i++) {
			System.out.println(i+"."+rasgos[i]);
			}
		System.out.print(rasgos[0]+":");
		numero=teclado.nextInt();

		while(numero<1||numero>=rasgos.length) {
			System.out.println("Error, introduce un número dentro del rango..");
			numero=teclado.nextInt();		
		}
		teclado.nextLine();//para dejar limpio el búffer del último teclado.nextInt();
		rasgo=rasgos[numero]; 
		return rasgo;
	}
	
	static void muestraRetrato(String []retrato) {
	for(int i=0;i<retrato.length;i++)
		System.out.println(retrato[i]);
	}

}
