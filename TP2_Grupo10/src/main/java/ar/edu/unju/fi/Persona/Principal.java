package ar.edu.unju.fi.Persona;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {
		Persona obj = new Persona();

		boolean bandera = true;
		while (bandera == true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.print("INGRESE SU Nombre: ");
				String nom = scanner.next();
				obj.setNombre(nom);
				System.out.print("FECHA EN EL FORMATO: dd/MM/yyyy\nIngreso: ");
				String entrada = scanner.next();
				DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate fecha = LocalDate.parse(entrada, formateador);
				obj.setFechaN(fecha);
				bandera = false;
			} catch (DateTimeParseException e) {
				System.out.println("FORMATO INGRESADO INCORRECTO.");
			}
		}

		System.out.println("Edad: " + obj.calcularEdad() + " años.");

		System.out.println("Signo del zodiaco " + obj.calcularSigno());
		System.out.println("Estacion " + obj.calcularEstacion());

	}

}
