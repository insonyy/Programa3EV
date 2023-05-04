package dao;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import domain.Empleado;
@Data
public class Empleados {
	private List<Empleado> empleados;
	
	public void Empleados() {
		empleados=new ArrayList();
		
		empleados.add(new Empleado("Francisco Gutierrez","23431186T","Doctor"));
		empleados.add(new Empleado("Daniel Gutierrez","58771426K","Recepcionista"));
		empleados.add(new Empleado("Manuel Fernandez","47163084P","Doctor"));
		empleados.add(new Empleado("Susana de la Rosa","82311612S","Auxiliar"));
		empleados.add(new Empleado("Pedro de Miguel","87165583C","Doctor"));
		empleados.add(new Empleado("Jose Carlos Sanchez","42598136R","Doctor"));
		empleados.add(new Empleado("Ismael Marchena","32769836B","Auxiliar"));
		empleados.add(new Empleado("Fernando Alonso","33333333C","Recepcionista"));
		empleados.add(new Empleado("Cade Cunningham","74851629C","Auxiliar"));
		empleados.add(new Empleado("Sergio Garcia","88416571M","Doctor"));
		empleados.add(new Empleado("Carlos Bruñas","92292814C","Recepcionista"));

	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void addEmpleados(Empleado empleado){
		empleados.add(empleado);
	}

}
