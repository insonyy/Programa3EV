package ui;

import java.util.Scanner;

public class MenuPrincipal {
	public void menuPrincipal(MenuGestionAnimales mga, MenuGestionEmpleados mge) {

		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion;

		do{
			System.out.println("Seleccione que desea hacer:");
			System.out.println("1. Gestion Animales");
			System.out.println("2. Gestion Empleados");
			System.out.println("3. Salir");
			System.out.println();
			opcion = sn.nextInt();
			switch(opcion){
			case 1:
				mga.menuAnimales();
				break;
			case 2:
				System.out.println("Por favor introduzca contraseña para acceder a la gestion de empleados");
				int contra = sn.nextInt();
				System.out.println(contra);
				if (contra == MenuGestionEmpleados.cont) {
					System.out.println();
					mge.menuEmpleados();
				} else {
					System.out.println("Contraseña incorrecta");
					System.out.println();
				}
				break;
			case 3:
				salir=true;
				break;
			default:
				System.out.println("Solo números entre 1 y 3");
			}

		}while(!salir);
		sn.close();
	}
}
