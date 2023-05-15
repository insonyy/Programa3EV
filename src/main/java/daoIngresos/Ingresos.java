package daoIngresos;


import domain.Ingreso;
import lombok.Data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Data

public class Ingresos {

	private List<Ingreso> ingresos;
	public Ingresos() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		ingresos=new ArrayList<>();
		ingresos.add(new Ingreso("Pepe", "Castración", "42598136R", LocalDate.parse("10/05/2023", formato)));
		ingresos.add(new Ingreso("Francisco", "Radiografía", "42598136R", LocalDate.parse("09/05/2023", formato)));
		ingresos.add(new Ingreso("Olivia", "Cesárea", "87165583C", LocalDate.parse("10/04/2023", formato)));
		ingresos.add(new Ingreso("Fajar Ayub", "Limado dental", "82311612S", LocalDate.parse("02/05/2023", formato)));
		ingresos.add(new Ingreso("Charles Leclerc", "Pipa atragantada", "33333333C", LocalDate.parse("10/05/2023", formato)));
		ingresos.add(new Ingreso("Izzy", "Operación por rotura del glande", "23431186T", LocalDate.parse("14/05/2023", formato)));
		ingresos.add(new Ingreso("Dizzy", "Prolapso uterino, recomienda no volver a juntar con Izzy", "23431186T", LocalDate.parse("14/05/2023", formato)));
		ingresos.add(new Ingreso("Zen", "Es demasiado bonito, deberia ser un crimen", "47163084P", LocalDate.parse("15/05/2023", formato)));
		ingresos.add(new Ingreso("Lionell", "Adorablemente pequeño, se recomienda seguimiento", "47163084P", LocalDate.parse("15/05/2023", formato)));
		ingresos.add(new Ingreso("Wario", "Waaaaa", "32769836B", LocalDate.parse("08/05/2023", formato)));
	
		/*ingresos = DaoAnimalesFicheros.readArrayList();*/
		
	}
	
	
	
}
