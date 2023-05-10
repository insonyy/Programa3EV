package dao;

import java.util.List;
import domain.Empleado;

public interface DaoEmpleados {
	public List<Empleado> getListaEmpleados();
	public boolean nuevoEmpleado();
	public boolean modificarEmpleado();
	public boolean eliminarFichaEmpleado();
	public boolean listarEmpleadosCargo();

}
