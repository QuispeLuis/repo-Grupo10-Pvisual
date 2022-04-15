package ar.edu.unju.fi.Par;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada;
		int numero;
		int cnt=1;
		System.out.println("DETERMINAR SI UN NUMERO INGRESADO ES PAR O IMPAR.");
		while ( cnt <= 5 ) {
			System.out.println("Ingresar el "+cnt+" valor: ");
			try {
				entrada = new Scanner(System.in);
				numero = entrada.nextInt();
				if (numero % 2 == 0) {
					System.out.println("El numero " + numero + " es par");
				} else {
					System.out.println("El numero " + numero + " no es par");
				}
				cnt++;
			} catch (InputMismatchException e) {
				System.out.println("Error! Debe ingresar un valor numerico");
			}
			
		}
		System.out.println("Fin del programa.");

	}

}
