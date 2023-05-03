package ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;
import java.util.Scanner;

public class MenuPrincipal {
	public void menuPrincipal(MenuGestion mg) {
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
			System.out.println("Seleccione que desea hacer:");
			System.out.println("1. Listar pacientes");
			System.out.println("2. Listar empleados");
			System.out.println("3. Listar ingresos actuales");
			System.out.println("4. Listar paciente por especie");
			System.out.println("5. Listar empleados por cargo");
			System.out.println("6. Listar tratamientos en curso");
			System.out.println("7. Acceder a gestion de datos");
			System.out.println("8. Salir");
			System.out.println();
			opcion = sn.nextInt();
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
				System.out.println("Por favor introduzca contraseña para acceder a la gestion de datos");
				int contra = sn.nextInt();
				System.out.println(contra);
				if (contra == Integer.parseInt((String) properties.get("PASSWORD"))) {
					System.out.println();
					//mge.menuEmpleados();
				} else {
					System.out.println("Contraseña incorrecta");
					System.out.println();
				}
				break;
			case 8:
				salir=true;
				break;
			default:
				System.out.println("Solo números entre 1 y 8");
			}

		}while(!salir);
		sn.close();
	}
}
