package dao;

import java.util.List;
import java.util.Scanner;

import domain.Empleado;

public class DaoEmpleadosImp implements DaoEmpleados{

	protected final Empleados lista;

	@Override
	public List<Empleado> getListaEmpleados() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean nuevoEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean modificarEmpleado() {
			Scanner sc = new Scanner(System.in);
			boolean nuevo = true;
			System.out.println("Introduce el nombre del empleado:");
			String nombre = sc.nextLine();
			Empleado empleado = (Empleado) lista.getEmpleados().stream().filter(empleado1 -> empleado1.getCargo().equalsIgnoreCase(nombre));
			System.out.println("¿Cual es su nuevo cargo?");
			String cargo = sc.nextLine();
			empleado.setCargo(cargo);
			return false;

	}

	@Override
	public boolean eliminarFichaEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean listarEmpleadosCargo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean listarTratamientosActivos() {
		// TODO Auto-generated method stub
		return false;
	}
}
