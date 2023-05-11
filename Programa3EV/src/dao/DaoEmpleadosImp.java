package dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import domain.Empleado;

public class DaoEmpleadosImp implements DaoEmpleados{

	protected final Empleados lista;

	public DaoEmpleadosImp() {
		this.lista = new Empleados();

	}


	@Override
	public List<Empleado> getListaEmpleados() {
		List<Empleado> listaEmpleados=new ArrayList<>();
		listaEmpleados= lista.getEmpleados();
		return listaEmpleados;
	}
	@Override
	public boolean nuevoEmpleado() {
		boolean nuevo = true;
		Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del nuevo empleado");
        String nombre = sc.nextLine();
        System.out.println("Introduce el apellido del nuevo empleado");
        String apellido = sc.nextLine();
        Pattern comprobar = Pattern.compile("[0-9]{8}[A-Z]");
        System.out.println("Introduce el DNI del nuevo empleado");
        String dni = sc.nextLine();
        Matcher matcher = comprobar.matcher(dni);
        System.out.println("Introduce el cargo del nuevo empleado");
        String cargo = sc.nextLine();
        Empleado empleado = new Empleado(nombre,apellido,dni,cargo);
		lista.getEmpleados().add(empleado);
		return nuevo;
	}
	@Override
	public boolean modificarEmpleado() {
			Scanner sc = new Scanner(System.in);
			boolean nuevo = true;
			System.out.println("¿Cual es su nuevo cargo?");
			String cargo = sc.nextLine();
		//	empleado.setCargo(cargo);
			return nuevo;

	}
	@Override
	public boolean eliminarFichaEmpleado() {
		Scanner sc = new Scanner(System.in);
		boolean listar = true;
		System.out.println("Introduce el nombre del empleado:");
		String nombre = sc.nextLine();
		lista.getEmpleados().remove((Empleado)lista.getEmpleados().stream().filter(a->a.getNombre().equalsIgnoreCase(nombre)));
		return true;
	}
	@Override
	public boolean listarEmpleadosCargo() {
		Scanner sc = new Scanner(System.in);
		boolean listar = true;
		System.out.println("Introduce el nombre del empleado:");
		String nombre = sc.nextLine();
		Empleado empleado = (Empleado) lista.getEmpleados().stream().filter(empleado1 -> empleado1.getCargo().equalsIgnoreCase(nombre));
		System.out.println(empleado);
    	Collections.sort((List<Empleado>) getListaEmpleados(), (o1, o2) -> o1.getCargo().compareTo(o2.getCargo()));
		return listar;
	}

	public void map() {
		HashMap<Integer, Empleado> map = new HashMap<>();
		for (int i = 0;i < getListaEmpleados().size();i++){
			map.put(i, getListaEmpleados().get(i));
			System.out.println(map.get(i).toString());

		}


	}

}
