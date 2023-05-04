package ui;

import java.util.Scanner;
import common.Constantes;

public class MenuGestion {
	public void menuGestion() {
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
				System.out.println(Constantes.SOLONUMS + "1 y 10");
			}

		} while (!salir);
		sn.close();
	}
}
