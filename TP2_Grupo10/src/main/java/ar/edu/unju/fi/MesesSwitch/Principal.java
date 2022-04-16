package ar.edu.unju.fi.MesesSwitch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		boolean band = true;
		Scanner entrada;
		int numero;
		System.out.println("DETERMINAR SI UN NUMERO INGRESADO PERTENECE A UN MES DEL AÑO.");
		while (band) {
			try {
				System.out.println("Ingrese numero: ");
				entrada = new Scanner(System.in);
				numero = entrada.nextInt();
				switch (numero) {
				case 1:
					System.out.println("El numero ingresado corresponde a un mes del año");
					break;
				case 2:
					System.out.println("El numero ingresado corresponde a un mes del año");
					break;
				case 3:
					System.out.println("El numero ingresado corresponde a un mes del año");
					break;
				case 4:
					System.out.println("El numero ingresado corresponde a un mes del año");
					break;
				case 5:
					System.out.println("El numero ingresado corresponde a un mes del año");
					break;
				case 6:
					System.out.println("El numero ingresado corresponde a un mes del año");
					break;
				case 7:
					System.out.println("El numero ingresado corresponde a un mes del año");
					break;
				case 8:
					System.out.println("El numero ingresado corresponde a un mes del año");
					break;
				case 9:
					System.out.println("El numero ingresado corresponde a un mes del año");
					break;
				case 10:
					System.out.println("El numero ingresado corresponde a un mes del año");
					break;
				case 11:
					System.out.println("El numero ingresado corresponde a un mes del año");
					break;
				case 12:
					System.out.println("El numero ingresado corresponde a un mes del año");
					break;
				default:
					System.out.println("No existe ese mes");
					band = false;
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("No existe ese mes");
				band = false;
			}

		}
		System.out.println("FIN DEL PROGRAMA.");



	}

}
