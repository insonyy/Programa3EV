package ui;

import java.util.Scanner;

public class MenuGestionAnimales {
	public void menuAnimales(){

		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion;

		do{
			System.out.println("Seleccione una de las opciones:");
			System.out.println("1. Listar pacientes");
			System.out.println("2. Modificar información de pacientes");
			System.out.println("3. Gestionar ingresos/altas");
			System.out.println("4. Salir");


			opcion = sn.nextInt();

			switch(opcion){
			case 1:
				System.out.println("Has seleccionado listar pacientes");
				break;
			case 2:
				System.out.println("Has seleccionado modificar informacion de pacientes");
				break;
			case 3:
				System.out.println("Has seleccionado gestionar ingresos/altas");
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
