package ui;

import java.util.Scanner;
import common.Constantes;
import common.TipoException;
import domain.Animal;
import domain.Empleado;
import service.ServicioGestion;

public class MenuGestion {
	private static ServicioGestion sGestion;
	public void menuGestion() throws TipoException {
		sGestion=new ServicioGestion();
		boolean salir=false;
		Scanner sn = new Scanner(System.in);
		do {
			System.out.println(Constantes.SELECCION);
			System.out.println(Constantes.DIVIDER);
			System.out.println("1."+Constantes.MG1);
			System.out.println("2."+Constantes.MG2);
			System.out.println("3."+Constantes.MG3);
			System.out.println("4."+Constantes.MG4);
			System.out.println("5."+Constantes.MG5);
			System.out.println("6."+Constantes.MG6);
			System.out.println("7."+Constantes.MG7);
			System.out.println("8."+Constantes.MG8);
			System.out.println("9."+Constantes.MG9);
			System.out.println("10."+Constantes.OPSalir);
			System.out.println(Constantes.DIVIDER);
			System.out.println();
			int opcion = sn.nextInt();
			switch(opcion){
			case 1:
				sGestion.nuevoEmpleado();
				break;
			case 2:
				sGestion.modificarEmpleado();
				break;
			case 3:
				sGestion.eliminarFichaEmpleado();
				break;
			case 4:
				sGestion.nuevoAnimal();
				break;
			case 5:
				sGestion.modificarAnimal();
				break;		
			case 6:
				sGestion.eliminarFichaAnimal();
				break;
			case 7:
				sGestion.nuevoTratamiento();
				break;
			case 8:
				sGestion.modificarTratamiento();
				break;
			case 9:
				sGestion.suspenderTratamiento();
				break;
			case 10:
				salir=true;
			default:
				System.out.println(Constantes.SOLONUMS + "1 y 10");
			}

		} while (!salir);
		sn.close();
	}
}
