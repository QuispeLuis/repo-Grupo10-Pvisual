package ar.edu.unju.fi.SecuenciaDos;

public class Principal {

	public static void main(String[] args) {
		int numero = 4;

		do {
			if (numero % 4 == 0) {
				System.out.print(numero + " ");
			}
			
			numero++;
		} while (numero <= 100);
	}

}
