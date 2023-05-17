package daoIngresos;

import java.util.List;
import domain.Ingreso;

public interface DaoIngresos {

	public List<Ingreso> getListaIngresos();
	public void getListaIngresosPaciente(String nombre);
	public void getListaIngresosEmpleado(String dni);
	public void getListaIngresosFecha(String fecha);
	public void getListaIngresosporPaciente();
	public void getListaIngresosporEmpleado();
	public void getListaIngresosporFecha();
	public boolean nuevoIngreso(Ingreso ingreso);
	public boolean eliminarIngreso(Ingreso ingreso);
	public boolean modificarIngreso(Ingreso ingreso);
}
