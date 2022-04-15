package ar.edu.unju.fi.Factorial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DETERMINAR EL FACTORIAL DE UN NUMERO INGRESADO.");
		System.out.println("Ingrese numero: ");
		Scanner entrada;
		int numero ;
		int aux = 1;
		try {
			entrada = new Scanner(System.in);
			numero = entrada.nextInt();
			if ((numero >= 0) && (numero <= 10)) {
				for (int i = 1; i <= numero; i++) {
					aux *= i;
				}

				System.out.println("El factorial de " + numero + " es " + aux);
			} else {
				System.out.println(" El numero ingresado esta fuera del rango permitido");
			}
			entrada.close();

		} catch (InputMismatchException e) {
			System.out.println("Error! Debe ingresar un valor numerico." );
		}
		System.out.println("FIN DEL PROGRAMA.");

	}

}
