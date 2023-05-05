package ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import common.Constantes;
import common.TipoException;
import service.ServicioGestion;

public class MenuPrincipal {
	private static ServicioGestion sGestion;
	public void menuPrincipal() {
		sGestion=new ServicioGestion();
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(new File("password.properties")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion;

		do{
			System.out.println(Constantes.SELECCION);
			System.out.println(Constantes.DIVIDER);
			System.out.println("1. " + Constantes.MP1);
			System.out.println("2. " + Constantes.MP2);
			System.out.println("3. " + Constantes.MP3);
			System.out.println("4. " + Constantes.MP4);
			System.out.println("5. " + Constantes.MP5);
			System.out.println("6. " + Constantes.MP6);
			System.out.println("7. " + Constantes.MP7);
			System.out.println("8. " + Constantes.OPSalir);
			System.out.println(Constantes.DIVIDER);
			opcion = sn.nextInt();
			switch(opcion){
			case 1:
				try {
					System.out.println(sGestion.getListaAnimales().toString());
				} catch (TipoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
				System.out.println(Constantes.OPPSSWD);
				int contra = sn.nextInt();
				System.out.println(contra);
				if (contra == Integer.parseInt((String) properties.get("PASSWORD"))) {
					System.out.println();
					//mge.menuEmpleados();
				} else {
					System.out.println(Constantes.OPNOTPSSWD);
					System.out.println();
				}
				break;
			case 8:
				salir=true;
				break;
			default:
				System.out.println(Constantes.SOLONUMS + " 1 y 8");
			}

		}while(!salir);
		sn.close();
	}
}
