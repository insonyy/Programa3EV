package dao;

import java.util.List;
import domain.Empleados;

public interface DaoPersonas {
	public List<Empleados> getListaEmpleados();
	public boolean nuevoEmpleado(Empleados empleado);
	public boolean modificarEmpleado(Empleados empleado);
	public boolean eliminarFichaEmpleado(Empleados empleado);
	public boolean listarEmpleadosCargo();
	public boolean listarTratamientosActivos();
}
