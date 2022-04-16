package ar.edu.unju.fi.Meses;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada;
		int numero;
		boolean band = true;
		System.out.println("DETERMINAR SI UN NUMERO INGRESADO PERTENECE A UN MES DEL AÑO.");
		while (band == true) {

			try {
				System.out.println("Ingrese numero: ");
				entrada = new Scanner(System.in);
				numero = entrada.nextInt();
				if (numero > 0 && numero <= 12) {
					System.out.println("El numero ingresado corresponde a un mes del año");
				} else {
					System.out.println("No existe ese mes");
					band = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("No existe ese mes");
				band = false;
			}

		}
		System.out.println("FIN DEL PROGRAMA.");

	}

}
