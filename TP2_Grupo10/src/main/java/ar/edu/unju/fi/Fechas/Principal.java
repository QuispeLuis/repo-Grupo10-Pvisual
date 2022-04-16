package ar.edu.unju.fi.Fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// B1
				LocalDate f1 = LocalDate.of(2022, 04, 20);
				LocalDate f2 = LocalDate.of(2022, 04, 16);
				ProcesoFecha pf1 = new ProcesoFecha(f1, f2);
				System.out.println("VALOR DEL ATRIBUTO FECHA1: " + pf1.getFecha1());
				System.out.println("VALOR DEL ATRIBUTO FECHA2: " + pf1.getFecha2());
				// B2
				LocalTime t1 = LocalTime.of(5, 0);
				LocalTime t2 = LocalTime.of(4, 40);
				ProcesoFecha pf2 = new ProcesoFecha(t1, t2);
				System.out.println("VALOR DEL ATRIBUTO TIME1: " + pf2.getTime1());
				System.out.println("VALOR DEL ATRIBUTO TIME2: " + pf2.getTime2());
				// B3
				System.out.println(pf1.compararFechas());
				// B4
				LocalDateTime dt1 = LocalDateTime.of(f1, t1);
				LocalDateTime dt2 = LocalDateTime.of(f2, t2);
				ProcesoFecha pf3 = new ProcesoFecha(dt1, dt2);
				System.out.println("VALOR DEL ATRIBUTO dateTime1: " + pf3.getDateTime1());
				System.out.println("VALOR DEL ATRIBUTO dateTime2: " + pf3.getDateTime2());
				// B5
				LocalDate fe1 = LocalDate.of(1997, 02, 16);
				LocalDate fe2 = LocalDate.now();
				ProcesoFecha pf4 = new ProcesoFecha(fe1, fe2);
				System.out.println("Han transcurrido " + pf4.contarTiempoTranscurrido().getYears() + ", "
						+ pf4.contarTiempoTranscurrido().getMonths() + " meses y " + pf4.contarTiempoTranscurrido().getDays()
						+ " días desde la fecha " + pf4.getFecha1() + " hasta la fecha " + pf4.getFecha2());
				// B6
				boolean bandera = true;
				while (bandera == true) {
					try {
						Scanner scanner = new Scanner(System.in);
						System.out.print("\nFECHA EN EL FORMATO: dd/MM/yyyy\nIngreso: ");
						String entrada = scanner.next();
						DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
						LocalDate fechaform1 = LocalDate.parse(entrada, formateador);
						System.out.println("FECHA 1: " + fechaform1);
						ProcesoFecha pf5 = new ProcesoFecha();
						pf5.setFecha1(fechaform1);
						LocalDate fechaform2 = LocalDate.of(pf5.getFecha1().getYear() + 1, pf5.getFecha1().getMonthValue(),
								pf5.getFecha1().getDayOfMonth());
						System.out.println("FECHA 2: " + fechaform2);
						bandera = false;
					} catch (DateTimeParseException e) {
						System.out.println("FORMATO INGRESADO INCORRECTO.");
					}
				}

				bandera = true;
				while (bandera == true) {
					try {
						Scanner scanner = new Scanner(System.in);
						System.out.print("\nFECHA EN EL FORMATO: dd/MM/yyyy\nIngreso: ");
						String entrada = scanner.next();
						DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
						LocalDate fechaform1 = LocalDate.parse(entrada, formateador);
						System.out.println("FECHA 1: " + fechaform1);
						ProcesoFecha pf5 = new ProcesoFecha();
						pf5.setFecha2(fechaform1);
						LocalDate fechaform2 = LocalDate.of(pf5.getFecha2().getYear(), pf5.getFecha2().getMonthValue() + 6,
								pf5.getFecha2().getDayOfMonth());
						System.out.println("FECHA 2: " + fechaform2);
						bandera = false;
					} catch (DateTimeParseException e) {
						System.out.println("FORMATO INGRESADO INCORRECTO.");
					}
				}

	}

}
