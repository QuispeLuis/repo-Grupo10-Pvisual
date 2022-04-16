package ar.edu.unju.fi.SumatoriaProductoria;

public class CalculoMatematico {
	private int numero;

	public CalculoMatematico(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int calcularSumatoria() {
		int sumatoria=0;
		for (int i = 1; i<= this.numero;i++) {
			sumatoria = sumatoria + (int)Math.pow((i*(i+1))/2,2);	
		}
		return sumatoria;
	}

	public long calcularProductoria() {
		long productoria = 1;
		for (int k = 1; k<=this.numero;k++) {
			productoria = productoria * (k*(k+1));	
		}
			return productoria;
	}

}
