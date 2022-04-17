package ar.edu.unju.fi.Persona;

import java.time.LocalDate;

public class Persona {


	private String nombre;
	private LocalDate fechaN;

	public Persona() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaN() {
		return fechaN;
	}

	public void setFechaN(LocalDate fechaN) {
		this.fechaN = fechaN;
	}

	public int calcularEdad() {

		LocalDate hoy = LocalDate.now();
		int edad = hoy.getYear() - this.fechaN.getYear();
		return edad;
	}

	public String calcularSigno() {

		int mes = this.fechaN.getMonthValue();
		
		int diaMes = this.fechaN.getDayOfMonth();
		String signo = " ";
		switch (mes) {
		case 1:
			if (diaMes >= 1 && diaMes <= 20) {
				signo = "Capricornio";
			} else if (diaMes >= 21 && diaMes <= 31) {
				signo = "Acuario";
			}

			break;
		case 2:
			if (diaMes >= 1 && diaMes <= 19) {
				signo = "Acuario";
			} else if (diaMes >= 20 && diaMes <= 28) {
				signo = "Piscis";
			}

			break;
		case 3:
			if (diaMes >= 1 && diaMes <= 20) {
				signo = "Piscis";
			} else if (diaMes >= 21 && diaMes <= 31) {
				signo = "Aries";
			}

			break;
		case 4:
			if (diaMes >= 1 && diaMes <= 20) {
				signo = "Aries";
			} else if (diaMes >= 21 && diaMes <= 30) {
				signo = "Tauro";
			}

			break;
		case 5:
			if (diaMes >= 1 && diaMes <= 20) {
				signo = "Tauro";
			} else if (diaMes >= 21 && diaMes <= 31) {
				signo = "Geminis";
			}

			break;
		case 6:
			if (diaMes >= 1 && diaMes <= 21) {
				signo = "Geminis";
			} else if (diaMes >= 22 && diaMes <= 30) {
				signo = "Cancer";
			}

			break;
		case 7:
			if (diaMes >= 1 && diaMes <= 22) {
				signo = "Cancer";
			} else if (diaMes >= 23 && diaMes <= 31) {
				signo = "Leo";
			}

			break;
		case 8:
			if (diaMes >= 1 && diaMes <= 23) {
				signo = "Leo";
			} else if (diaMes >= 24 && diaMes <= 31) {
				signo = "Virgo";
			}

			break;
		case 9:
			if (diaMes >= 1 && diaMes <= 23) {
				signo = "Virgo";
			} else if (diaMes >= 24 && diaMes <= 30) {
				signo = "Libra";
			}

			break;
		case 10:
			if (diaMes >= 1 && diaMes <= 23) {
				signo = "Libra";
			} else if (diaMes >= 24 && diaMes <= 31) {
				signo = "Escorpio";
			}

			break;
		case 11:
			if (diaMes >= 1 && diaMes <= 22) {
				signo = "Escorpio";
			} else if (diaMes >= 23 && diaMes <= 30) {
				signo = "Sagitario";
			}

			break;
		case 12:
			if (diaMes >= 1 && diaMes <= 21) {
				signo = "Sagitario";
			} else if (diaMes >= 22 && diaMes <= 31) {
				signo = "Capricornio";
			}

			break;

		default:
			break;
		}
		return signo;
	}

	public String calcularEstacion() {

		int mes = this.fechaN.getMonthValue();
		String estacion = " ";

		int diaMes = this.fechaN.getDayOfMonth();

		switch (mes) {
		case 1:
			estacion = "Verano";
			break;
		case 2:
			estacion = "Verano";
			break;
		case 3:

			if (diaMes >= 1 && diaMes <= 20) {
				estacion = "Verano";
			} else if (diaMes >= 21 && diaMes <= 31) {
				estacion = "Otoño";
			}

			break;
		case 4:

			estacion = "Otoño";

			break;
		case 5:
			estacion = "Otoño";
			break;
		case 6:
			if (diaMes >= 1 && diaMes <= 21) {
				estacion = "Otoño";
			} else if (diaMes >= 22 && diaMes <= 30) {
				estacion = "Invierno";
			}

			break;
		case 7:
			estacion = "Invierno";
			break;
		case 8:
			estacion = "Invierno";
			break;
		case 9:
			if (diaMes >= 1 && diaMes <= 23) {
				estacion = "Invierno";
			} else if (diaMes >= 24 && diaMes <= 30) {
				estacion = "Primavera";
			}

			break;
		case 10:
			estacion = "Primavera";
			break;
		case 11:
			estacion = "Primavera";
			break;
		case 12:
			if (diaMes >= 1 && diaMes <= 20) {
				estacion = "Primavera";
			} else if (diaMes >= 21 && diaMes <= 31) {
				estacion = "Verano";
			}

			break;

		default:
			break;
		}
		return estacion;
	}

}
