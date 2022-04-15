package ar.edu.unju.fi.Objeto;

import java.time.LocalDate;

public class Empleado {
	private String nombre;
	private LocalDate fingreso;
	private int legajo;
	private String mail;
	private int sueldo;
	private int horastrabajadas;
	
	public Empleado(String nombre, LocalDate fingreso, int legajo, String mail, int horastrabajadas) {
		super();
		this.nombre = nombre;
		this.fingreso = fingreso;
		this.legajo = legajo;
		this.mail = mail;
		this.horastrabajadas = horastrabajadas;
		obtenerSueldo();
	}

	public int obtenerSueldo() {
		if (horastrabajadas<=160) {
			this.sueldo=horastrabajadas*600;
		}
		else {
			this.sueldo=(160*600)+(horastrabajadas-160)*650;
		}
		return this.sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", fingreso=" + fingreso + ", legajo=" + legajo + ", mail=" + mail
				+ ", sueldo=" + sueldo + ", horastrabajadas=" + horastrabajadas + "]";
	}
}
