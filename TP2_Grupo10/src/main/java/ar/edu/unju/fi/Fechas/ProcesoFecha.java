package ar.edu.unju.fi.Fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ProcesoFecha {
	// DECLARACION DE ATRIBUTOS DE LA CLASE
		LocalDate fecha1, fecha2;
		LocalTime time1, time2;
		LocalDateTime dateTime1, dateTime2;

		// DECLARACION DE CONSTRUCCTORES
		public ProcesoFecha() {
			// TODO Auto-generated constructor stub
		}

		public ProcesoFecha(LocalDate fecha1, LocalDate fecha2) {
			super();
			this.fecha1 = fecha1;
			this.fecha2 = fecha2;
		}

		public ProcesoFecha(LocalTime time1, LocalTime time2) {
			super();
			this.time1 = time1;
			this.time2 = time2;
		}

		public ProcesoFecha(LocalDateTime dateTime1, LocalDateTime dateTime2) {
			super();
			this.dateTime1 = dateTime1;
			this.dateTime2 = dateTime2;
		}

		// DECLARACION DE LOS METODOS GET/SET
		public LocalDate getFecha1() {
			return fecha1;
		}

		public void setFecha1(LocalDate fecha1) {
			this.fecha1 = fecha1;
		}

		public LocalDate getFecha2() {
			return fecha2;
		}

		public void setFecha2(LocalDate fecha2) {
			this.fecha2 = fecha2;
		}

		public LocalTime getTime1() {
			return time1;
		}

		public void setTime1(LocalTime time1) {
			this.time1 = time1;
		}

		public LocalTime getTime2() {
			return time2;
		}

		public void setTime2(LocalTime time2) {
			this.time2 = time2;
		}

		public LocalDateTime getDateTime1() {
			return dateTime1;
		}

		public void setDateTime1(LocalDateTime dateTime1) {
			this.dateTime1 = dateTime1;
		}

		public LocalDateTime getDateTime2() {
			return dateTime2;
		}

		public void setDateTime2(LocalDateTime dateTime2) {
			this.dateTime2 = dateTime2;
		}

		// DECLARACION DE METODOS
		public Period contarTiempoTranscurrido() {
			// Muestra la cantidad de años, meses y días que han transcurrido entre fecha1 y
			// fecha2.
			Period periodo = Period.between(this.fecha1, this.fecha2);
			return periodo;
		}

		public String formatearFecha(LocalDate fecha) {
			// Devuelve una cadena de texto con el valor de alguna fecha de tipo LocalDAte
			// formateado con el siguiente formato dd/MM/yyyy.
			DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			String devolverFecha = formateador.format(fecha);
			return devolverFecha;
		}

		public String compararFechas() {
			// comparar fecha1 y fecha2. Si fecha1 es mayor que
			// fecha2, mostrar el mensaje “La fecha fecha1 es posterior a la fecha fecha2”.
			// Si fecha1 no es mayor que fechas2 entonces mostrar “La fecha1 es anterior
			// a fecha2”, si no se cumple alguno de los casos, son iguales
			String resultado;
			if (this.fecha1.isAfter(fecha2)) {
				resultado = "La fecha fecha1 es posterior a la fecha fecha2";
			} else if (this.fecha1.isBefore(fecha2)) {
				resultado = "La fecha1 es anterior a fecha2";
			} else {
				resultado = "Son fechas iguales";
			}
			return resultado;
		}

}
