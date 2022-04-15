package ar.edu.unju.fi.Bisiesto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada;
		int año;
		System.out.println("DETERMINAR SI EL AÑO INGRESADO ES BISIESTO.");
		try {
			System.out.println("Ingrese año: ");
			entrada = new Scanner(System.in);
			año = entrada.nextInt();

			if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
				System.out.println("El año " + año + " es bisiesto");
			} else {
				System.out.println("El año " + año + " no es bisiesto");
			}
			entrada.close();
		} catch (InputMismatchException e) {
			System.out.println("Error! ");
		}

		System.out.println("FIN DEL PROGRAMA.");

	}

}
