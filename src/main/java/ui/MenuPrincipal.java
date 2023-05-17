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
	public void menuPrincipal() throws TipoException, IOException {
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
			System.out.println("6. "+ Constantes.MP13);
			System.out.println("7. "+ Constantes.MP7);
			System.out.println("8. "+ Constantes.MP8);
			System.out.println("9. "+ Constantes.MP9);
			System.out.println("10. "+ Constantes.MP10);
			System.out.println("11. "+ Constantes.MP11);
			System.out.println("12. "+ Constantes.MP12);
			System.out.println("13. " + Constantes.MP6);
			System.out.println("14. " + Constantes.OPSalir);
			System.out.println(Constantes.DIVIDER);
			opcion = sn.nextInt();
			switch(opcion){
			case 1:
				sGestion.getListaAnimales().forEach(System.out::println);
				System.out.println();
				break;
			case 2:
				sGestion.getListaEmpleados().forEach(System.out::println);
				System.out.println();
				break;
			case 3:
				sGestion.getListaIngresos().forEach(System.out::println);
				System.out.println();
				break;
			case 4:
				sGestion.getListaAnimalesEspecie().forEach(System.out::println);
				System.out.println();
				break;
			case 5:
				sGestion.listarEmpleadosCargo().forEach(System.out::println);
				System.out.println();
				break;		
			case 6:
				sGestion.getListaIngresosporFecha();
				System.out.println();

				break;
			case 7:
				sGestion.getListaTratamientos().forEach(System.out::println);
				System.out.println();
				break;
			case 8:
				System.out.println(Constantes.INTRODUCE_EL_NOMBRE_DEL_ANIMAL);
				String nombre = sn.next();
				System.out.println(nombre);
				sGestion.getListaIngresosPaciente(nombre);
				break;
			case 9:
				System.out.println(Constantes.INTRODUCE_EL_NIF_DEL_EMPLEADO);
				String dni = sn.next();
				sGestion.getListaIngresosEmpleado(dni);
				break;
			case 10:
				System.out.println(Constantes.INTRODUCE_LA_FECHA);
				String fecha = sn.next();
				System.out.println(fecha);
				sGestion.getListaIngresosFecha(fecha);
				break;
			case 11:
				sGestion.getListaIngresosporPaciente();
				System.out.println();
				break;
			case 12:
				sGestion.getListaIngresosporEmpleado();
				System.out.println();
				break;
			case 13:
				System.out.println(Constantes.OPPSSWD);
				int contra = sn.nextInt();
				MenuGestion mge=new MenuGestion();
				System.out.println(contra);
				if (contra == Integer.parseInt((String) properties.get("PASSWORD"))) {
					System.out.println();
					mge.menuGestion();
					salir=true;
				} else {
					System.out.println(Constantes.OPNOTPSSWD);
					System.out.println();
				}
				break;
			case 14:
				salir=true;
				break;
			default:
				System.out.println(Constantes.SOLONUMS + " 1 y 14");
			}

		}while(!salir);
		sn.close();
	}
}
