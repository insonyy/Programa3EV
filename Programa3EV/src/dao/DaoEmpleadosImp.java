package dao;

import java.util.List;
import java.util.Scanner;

import domain.Empleado;

public class DaoEmpleadosImp implements DaoEmpleados{

	protected final Empleados lista;

	public DaoEmpleadosImp() {
		this.lista = new Empleados();

	}


	@Override
	public List<Empleado> getListaEmpleados() {
		List<Empleado> listaEmpleados= lista.getEmpleados();
		return listaEmpleados;
	}
	@Override
	public boolean nuevoEmpleado(Empleado empleado) {
		boolean nuevo = true;
		lista.getEmpleados().add(empleado);
		return nuevo;
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
			return nuevo;

	}
	@Override
	public void eliminarFichaEmpleado(Empleado empleado) {
		lista.getEmpleados().remove(empleado);
	}
	@Override
	public boolean listarEmpleadosCargo() {
		Scanner sc = new Scanner(System.in);
		boolean nuevo = true;
		System.out.println("Introduce el nombre del empleado:");
		String nombre = sc.nextLine();
		Empleado empleado = (Empleado) lista.getEmpleados().stream().filter(empleado1 -> empleado1.getCargo().equalsIgnoreCase(nombre));
		System.out.println(empleado);
		return false;
	}
	@Override
	public boolean listarTratamientosActivos() {
		// TODO Auto-generated method stub
		return false;
	}
}
