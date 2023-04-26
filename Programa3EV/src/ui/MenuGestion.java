package ui;

import java.util.Scanner;

public class MenuGestion {
	static final int cont = 2223;
	public void menuGestion() {
		boolean salir=false;
		Scanner sn = new Scanner(System.in);
		do {
			System.out.println("Seleccione una de las siguientes opciones:");
			System.out.println("__________________________________________");
			System.out.println("1.Añadir empleados");
			System.out.println("2.Modificar información sobre empleados");
			System.out.println("3.Eliminar ficha empleados");
			System.out.println("4.Nuevo paciente");
			System.out.println("5.Modificar informacion de paciente");
			System.out.println("6.Eliminar ficha paciente");
			System.out.println("7.Añadir tratamiento a paciente");
			System.out.println("8.Modificar tratamiento de paciente");
			System.out.println("9.Suspender tratamiento de paciente");
			System.out.println("10.Salir");
			System.out.println("__________________________________________");
			System.out.println();
			int opcion = sn.nextInt();
			switch(opcion){
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;		
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				salir=true;
			default:
				System.out.println("Solo números entre 1 y 10");
			}

		} while (!salir);
		sn.close();
	}
}
