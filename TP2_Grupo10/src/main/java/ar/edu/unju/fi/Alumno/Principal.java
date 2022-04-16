package ar.edu.unju.fi.Alumno;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int ingreso;
		Scanner scanner = new Scanner(System.in);
		boolean bandera = true;
		
		while (bandera == true) {
			try {
				System.out.println("***** SISTEMA DE NOTAS *****");
				System.out.println("Ingresar nota: ");
				ingreso = scanner.nextInt();
				
				if (ingreso == 6) {
					System.out.println("Alumno regulariza");
				} else if (ingreso >= 7 && ingreso <= 10){
					System.out.println("El alumno promociona");
				} else if (ingreso >= 1 && ingreso <= 6) {
					System.out.println("El alumno desaprueba");
				}else if (ingreso == 0) {
					System.out.println("Valor no permitido");
					bandera = false;
				}
				
			} catch (InputMismatchException e) {
				System.out.println("ERROR! DEBE INGRESAR UN VALOR NUMERICO.");
				bandera = false;
			}
		}
		
		scanner.close();
		System.out.println("***** FIN DEL PROGRAMA *****");

	}

}
