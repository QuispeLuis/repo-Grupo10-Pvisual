package ar.edu.unju.fi.Objeto;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado emp= new Empleado("jose",LocalDate.of(2022, 4, 15),1987,"jose@gmail.com",180);
		System.out.println(emp);
	}
}
