package ui;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import common.Constantes;
import common.TipoException;
import domain.Animal;
import domain.Empleado;
import service.ServicioGestion;

public class MenuGestion {
	private static ServicioGestion sGestion;
	public void menuGestion() throws TipoException {
		Scanner sc = new Scanner(System.in);
		sGestion=new ServicioGestion();
		boolean salir=false;
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
			int opcion = sc.nextInt();
			switch(opcion){
			case 1:
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
				sGestion.nuevoEmpleado(empleado);
				break;
			case 2:
				System.out.println(Constantes.INTRODUCE_EL_NOMBRE_DEL_EMPLEADO);
				String nombre1 = sc.nextLine();
				System.out.println(Constantes.CUAL_ES_SU_NUEVO_CARGO);
				String cargo1 = sc.nextLine();
				sGestion.modificarEmpleado(nombre1,cargo1);
				break;
			case 3:
				System.out.println(Constantes.INTRODUCE_EL_NOMBRE_DEL_EMPLEADO);
				String nombre3 = sc.nextLine();
				sGestion.eliminarFichaEmpleado(nombre3);
				break;
			case 4:
				System.out.println(Constantes.INTRODUCE_EL_NOMBRE_DEL_NUEVO_PACIENTE);
				String nombre4 = sc.nextLine();
				System.out.println(Constantes.INTRODUCE_LA_ESPECIE_DEL_PACIENTE);
				String especie = sc.nextLine();
				System.out.println(Constantes.INTRODUCE_SU_EDAD);
				int edad = sc.nextInt();
				System.out.println(Constantes.INTRODUCE_SU_RAZA);
				String raza = sc.nextLine();
				Animal animal = new Animal(nombre4, especie, raza, edad); 
				sGestion.nuevoAnimal(animal);
				break;
			case 5:
				System.out.println(Constantes.NOMBRE_DEL_ANIMAL_CUYA_FICHA_DESEA_MODIFICAR);
				String nombre5 = sc.nextLine();
				System.out.println(Constantes.NUEVA_ESPECIE);
				String nuevaespecie = sc.nextLine();
				System.out.println(Constantes.NUEVA_RAZA);
				String nuevaraza = sc.nextLine();
				System.out.println(Constantes.NUEVA_EDAD);
				int nuevaedad = sc.nextInt();
				sGestion.modificarAnimal(nombre5, nuevaespecie, nuevaraza, nuevaedad);
				break;		
			case 6:
				System.out.println(Constantes.INTRODUCE_EL_NOMBRE_DEL_ANIMAL);
				String nombre6 = sc.nextLine();
				sGestion.eliminarFichaAnimal(nombre6);
				break;
			case 7:
				System.out.println(Constantes.INTRODUCE_EL_NOMBRE_DEL_ANIMAL);
				String nombre7 = sc.nextLine();
				System.out.println(Constantes.INTRODUCE_EL_NUEVO_TRATAMIENTO);
				String tratamiento=sc.nextLine();
				sGestion.nuevoTratamiento(nombre7,tratamiento);
				break;
			case 8:
				System.out.println(Constantes.INTRODUCE_EL_NOMBRE_DEL_ANIMAL);
				String nombre8 = sc.nextLine();
				System.out.println(Constantes.INTRODUCE_EL_NUEVO_TRATAMIENTO);
				String tratamiento1=sc.nextLine();
				sGestion.modificarTratamiento(nombre8,tratamiento1);
				break;
			case 9:
				System.out.println(Constantes.INTRODUCE_EL_NOMBRE_DEL_ANIMAL);
				String nombre9 = sc.nextLine();
				System.out.println(Constantes.INTRODUCE_EL_NUEVO_TRATAMIENTO);
				String tratamiento2=sc.nextLine();
				sGestion.suspenderTratamiento(nombre9,tratamiento2);
				break;
			case 10:
				salir=true;
			default:
				System.out.println(Constantes.SOLONUMS + "1 y 10");
			}

		} while (!salir);
		sc.close();
	}
}
