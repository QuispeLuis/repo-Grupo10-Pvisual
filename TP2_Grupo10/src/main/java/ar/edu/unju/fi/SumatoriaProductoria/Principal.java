package ar.edu.unju.fi.SumatoriaProductoria;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculoMatematico unNumero; //= new CalculoNumerico(0);
		Scanner entrada = new Scanner(System.in);
		int n;
		
		System.out.print("Ingrese un número: ");
		n = entrada.nextInt();
		unNumero = new CalculoMatematico(n);
		
		System.out.println("La sumatoria es: "+unNumero.calcularSumatoria());
		System.out.println("La productoria es: "+unNumero.calcularProductoria());
	}

}
