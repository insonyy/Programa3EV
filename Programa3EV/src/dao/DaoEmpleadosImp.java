package dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import common.Constantes;
import domain.Animal;
import domain.Empleado;
import lombok.Data;

public class DaoEmpleadosImp implements DaoEmpleados{
	protected final Empleados lista;
	  private final DatabaseEmpleados db;
	  
	public DaoEmpleadosImp() {
		this.lista = new Empleados();
		 this.db = new DatabaseEmpleados();
	}

	@Override
	public List<Empleado> getListaEmpleados() {
		List<Empleado> listaEmpleados=lista.getEmpleados();
		db.loadEmpleados();
		return listaEmpleados;
	}
	@Override
	public boolean nuevoEmpleado() {
		boolean nuevo = true;
		Scanner sc = new Scanner(System.in);
        System.out.println(Constantes.INTRODUCE_EL_NOMBRE_DEL_NUEVO_EMPLEADO);
        String nombre = sc.nextLine();
        System.out.println(Constantes.INTRODUCE_EL_APELLIDO_DEL_NUEVO_EMPLEADO);
        String apellido = sc.nextLine();
        Pattern comprobar = Pattern.compile("[0-9]{8}[A-Z]");
        System.out.println(Constantes.INTRODUCE_EL_DNI_DEL_NUEVO_EMPLEADO);
        String dni = sc.nextLine();
        Matcher matcher = comprobar.matcher(dni);
        System.out.println(Constantes.INTRODUCE_EL_CARGO_DEL_NUEVO_EMPLEADO);
        String cargo = sc.nextLine();
        Empleado empleado = new Empleado(nombre,apellido,dni,cargo);
		lista.getEmpleados().add(empleado);
		db.saveEmpleados(lista.getEmpleados());
		return nuevo;
	}
	@Override
	public boolean modificarEmpleado() {
			Scanner sc = new Scanner(System.in);
			boolean nuevo = true;
			System.out.println(Constantes.INTRODUCE_EL_NOMBRE_DEL_EMPLEADO);
			String nombre = sc.nextLine();
			System.out.println(Constantes.CUAL_ES_SU_NUEVO_CARGO);
			String cargo = sc.nextLine();
			List<Empleado> emple = lista.getEmpleados();
			((Empleado) emple.stream().filter(a->a.getNombre().equalsIgnoreCase(nombre))).setCargo(cargo);
			db.saveEmpleados(lista.getEmpleados());
			return nuevo;

	}
	@Override
	public boolean eliminarFichaEmpleado() {
		Scanner sc = new Scanner(System.in);
		boolean listar = true;
		System.out.println(Constantes.INTRODUCE_EL_NOMBRE_DEL_EMPLEADO);
		String nombre = sc.nextLine();
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


