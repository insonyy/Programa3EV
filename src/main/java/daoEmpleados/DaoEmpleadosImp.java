package daoEmpleados;

import java.util.List;
import domain.Empleado;

public class DaoEmpleadosImp implements DaoEmpleados{
	protected final Empleados lista;
	  private final DatabaseEmpleados db;
	  
	public DaoEmpleadosImp() {
		this.lista = new Empleados();
		 this.db = new DatabaseEmpleados();
	}

	public DaoEmpleadosImp(Empleados lista, DatabaseEmpleados db) {
		this.lista = lista;
		this.db = db;
	}

	@Override
	public List<Empleado> getListaEmpleados() {
		return lista.getEmpleados();
	}
	@Override
	public boolean nuevoEmpleado(Empleado empleado) {

		lista.getEmpleados().add(empleado);
		db.saveEmpleados(lista.getEmpleados());
		return true;
	}
	@Override
	public boolean modificarEmpleado(String nombre, String cargo) {
			List<Empleado> emple = lista.getEmpleados();
			((Empleado) emple.stream().filter(a->a.getNombre().equalsIgnoreCase(nombre))).setCargo(cargo);
			db.saveEmpleados(lista.getEmpleados());
			return true;
	}
	@Override
	public boolean eliminarFichaEmpleado(String nombre) {
		lista.getEmpleados().remove((Empleado)lista.getEmpleados().stream().filter(a->a.getNombre().equalsIgnoreCase(nombre)));
		db.saveEmpleados(lista.getEmpleados());
		return true;
	}
	@Override
	public List<Empleado> listarEmpleadosCargo() {
		List<Empleado> emple = lista.getEmpleados();
		emple.stream().sorted((p1, p2)->p1.getCargo().compareTo(p2.getCargo())).forEach(System.out::println);
		return emple;
	}
	}


