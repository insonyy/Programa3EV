package ui;

import java.util.Scanner;

public class MenuGestionEmpleados {

	static final int cont = 2223;
	public void menuEmpleados() {

		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion;

		do{
			System.out.println("Seleccione la accion que desea realizar:");
			System.out.println("1. Listar empleados");
			System.out.println("2. Listar pacientes de un empleado");
			System.out.println("3. Asignar tareas a un empleado");
			System.out.println("4. Salir");
			opcion = sn.nextInt();

			switch(opcion){
			case 1:
				System.out.println("Has seleccionado listar empleados");
				break;
			case 2:
				System.out.println("Has seleccionado listar pacientes de un empleado");
				break;
			case 3:
				System.out.println("Has seleccionado asignar tareas a un empleado");
				break;
			case 4:
				salir=true;
				break;
			default:
				System.out.println("Solo números entre 1 y 4");
			}

		}while(!salir);
		sn.close();
	}
}
