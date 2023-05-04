package dao;

import java.util.List;
import domain.Empleado;

public interface DaoEmpleados {
	public List<Empleado> getListaEmpleados();
	public boolean nuevoEmpleado(Empleado empleado);
	public boolean modificarEmpleado();
	public boolean eliminarFichaEmpleado(Empleado empleado);
	public boolean listarEmpleadosCargo();
	public boolean listarTratamientosActivos();
}
