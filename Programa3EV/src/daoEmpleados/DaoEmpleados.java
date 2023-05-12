package daoEmpleados;

import java.util.List;
import domain.Empleado;

public interface DaoEmpleados {
	public List<Empleado> getListaEmpleados();
	public boolean nuevoEmpleado(Empleado empleado);
	public boolean modificarEmpleado(String nombre, String cargo);
	public boolean eliminarFichaEmpleado(String nombre);
	public List<Empleado> listarEmpleadosCargo();

}
