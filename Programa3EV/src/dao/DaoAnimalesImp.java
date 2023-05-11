package dao;

import domain.Animal;
import common.Constantes;
import domain.Empleado;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DaoAnimalesImp implements DaoAnimales{
	
	protected final Animales lista;
	protected final DaoEmpleadosImp imp;

	/*Constructores*/

	public DaoAnimalesImp() {
		this.lista = new Animales();
		this.imp=new DaoEmpleadosImp();
	}

	public DaoAnimalesImp(Animales lista) {
		this.lista = lista;
		this.imp = new DaoEmpleadosImp();
	}

	/*Métodos*/

	//sobrecarga para pillar la lista de los animales
	//por especie
	@Override
	public Set<Animal> getListaAnimales() {
		Set<Animal> auxAnimales = lista.getAnimales();
		return auxAnimales;
	}

	@Override
	public Set<Animal> getListaAnimalesEspecie() {
		Set<Animal> auxAnimales = lista.getAnimales();
		auxAnimales.stream().sorted((p1, p2)->p1.getEspecie().compareTo(p2.getEspecie())).forEach(System.out::println);;
		return auxAnimales;
	}
	//por tipo

	public Set<Animal> getListaAnimales(String tipo, String especie) {
		Set<Animal> auxAnimales = new HashSet<>();
		Iterator<Animal> it = lista.getAnimales().iterator();
		while(it.hasNext()) {
			Animal aux = it.next();
			if (aux.getTipo().equalsIgnoreCase("tipo"))
				auxAnimales.add(aux);
		}

		return auxAnimales;
	}

	//por empleado

	public Set<Animal> getListaAnimales(Empleado empleado) {
		List<Animal> auxAnimalesTodo = new ArrayList<>(lista.getAnimales()); //prefiero manejar Set como un List
		List<Animal> auxAnimalesSub = new ArrayList<>();
		for (int i =  0; i < auxAnimalesTodo.size(); i++){
			if (auxAnimalesTodo.get(i).getEmpleado().getNombre().equals(empleado)){
				auxAnimalesSub.add(auxAnimalesTodo.get(i));
			}
		}
		return new HashSet(auxAnimalesSub);
	}

	@Override
	public boolean nuevoAnimal() {
		Scanner sc = new Scanner(System.in);
		boolean nuevo=true;
		System.out.println(Constantes.INTRODUCE_EL_NOMBRE_DEL_NUEVO_PACIENTE);
		String nombre = sc.nextLine();
		System.out.println(Constantes.INTRODUCE_LA_ESPECIE_DEL_PACIENTE);
		String especie = sc.nextLine();
		System.out.println(Constantes.INTRODUCE_SU_EDAD);
		int edad = sc.nextInt();
		System.out.println(Constantes.INTRODUCE_SU_RAZA);
		String raza = sc.nextLine();
		Animal animal = new Animal(nombre, especie, raza, edad);  
		lista.getAnimales().add(animal);
		return nuevo;
	}
	@Override
	public boolean modificarAnimal() {
		Scanner scanner = new Scanner(System.in);
		boolean nuevo=true;
		System.out.println(Constantes.NOMBRE_DEL_ANIMAL_CUYA_FICHA_DESEA_MODIFICAR);
		String nombre = scanner.nextLine();
		Animal animalico=(Animal) lista.getAnimales().stream().filter(a->a.getNombre().equalsIgnoreCase(nombre));
		System.out.println(Constantes.DESEA_MODIFICAR_EL_TRATAMIENTO_S_N);
		try {
			char t=(char) System.in.read();
			if (t=='s'||t=='S') {
				System.out.println(Constantes.INTRODUZCA_NUEVO_TRATAMIENTO);
				String tratamiento=scanner.nextLine();
				animalico.setTratamiento(tratamiento);
			}else if (t=='n'||t=='N') {
				System.out.println(Constantes.DESEA_MODIFICAR_EL_EMPLEADO_A_CARGO_S_N);
				char e=(char) System.in.read();
				if (e=='s'||e=='S') {
					System.out.println(Constantes.INTRODUZCA_NUEVO_EMPLEADO_A_CARGO);
					String empleadoAC=scanner.nextLine();
					animalico.setEmpleado((Empleado) imp.getListaEmpleados().stream().filter(a->a.getNombre().equals(empleadoAC)));
				}else if (e=='n'||e=='N') {
					System.out.println(Constantes.DESEA_MODIFICAR_EL_ESTADO_DE_INGRESO_S_N);
					char i=(char) System.in.read();
					if (i=='s'||i=='S') {
						System.out.println(Constantes.PARA_INGRESAR_PULSE_S_PARA_DAR_DE_ALTA_PULSE_N);
						char ii=(char) System.in.read();
						if (ii=='s'||ii=='S') {
							animalico.setIngresado(true);
						}else if (ii=='n'||ii=='N') {
							animalico.setIngresado(false);
						}
					}else if (i=='n'||i=='N') {
						System.out.println(Constantes.MODIFICACIONES_REALIZADAS);
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scanner.close();
		return nuevo;
	}

	@Override
	public boolean eliminarFichaAnimal() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(Constantes.INTRODUCE_EL_NOMBRE_DEL_ANIMAL);
		String nombre = scanner.nextLine();
		Animal animal=(Animal) getListaAnimales().stream().filter(a->a.getNombre().contentEquals(nombre));
		boolean borrar=true;
		lista.getAnimales().remove(animal);
		return borrar;
	}

	@Override
	public Set<Animal> getListaTratamientos() {
		Set<Animal> auxAnimales = new HashSet<>();
		Iterator<Animal> it = lista.getAnimales().iterator();
		while(it.hasNext()) {
			Animal aux = it.next();
			if (aux.getTratamiento().equalsIgnoreCase("tratamiento"))
				auxAnimales.add(aux);
		}

		return auxAnimales;
	}

	@Override
	public boolean nuevoTratamiento() {
		Scanner scanner = new Scanner(System.in);
		boolean nuevo=true;
		System.out.println(Constantes.INTRODUCE_EL_NOMBRE_DEL_ANIMAL);
		String nombre = scanner.nextLine();
		Animal animal=(Animal) getListaAnimales().stream().filter(a->a.getNombre().contentEquals(nombre));
		System.out.println(Constantes.INTRODUCE_EL_NUEVO_TRATAMIENTO);
		String tratamiento=scanner.nextLine();
		animal.setTratamiento(tratamiento);
		return nuevo;
	}

	@Override
	public boolean modificarTratamiento() {
		Scanner scanner = new Scanner(System.in);
		boolean nuevo=true;
		System.out.println(Constantes.INTRODUCE_EL_NOMBRE_DEL_ANIMAL);
		String nombre = scanner.nextLine();
		Animal animal=(Animal) getListaAnimales().stream().filter(a->a.getNombre().contentEquals(nombre));
		System.out.println(Constantes.TRATAMIENTO_ACTUAL + animal.getTratamiento());
		System.out.println(Constantes.INTRODUCE_EL_NUEVO_TRATAMIENTO);
		String tratamiento=scanner.nextLine();
		animal.setTratamiento(tratamiento);
		System.out.println(Constantes.NUEVO_TRATAMIENTO + animal.getTratamiento());
		return nuevo;
	}

	@Override
	public boolean suspenderTratamiento() {
		boolean nuevo=true;
		Scanner scanner = new Scanner(System.in);
		System.out.println(Constantes.INTRODUCE_EL_NOMBRE_DEL_ANIMAL);
		String nombre = scanner.nextLine();
		Animal animal=(Animal) getListaAnimales().stream().filter(a->a.getNombre().contentEquals(nombre));
		System.out.println(Constantes.INTRODUCE_EL_NUEVO_TRATAMIENTO);
		String tratamiento=scanner.nextLine();
		animal.setTratamiento(tratamiento);
		return nuevo;
	}

	@Override
	public Set<Animal> listarPacientesIngresados() {
		Set<Animal> auxAnimales = new HashSet<>();
		Iterator<Animal> it = lista.getAnimales().iterator();
		while(it.hasNext()) {
			Animal aux = it.next();
			if (aux.isIngresado()==true)
				auxAnimales.add(aux);
		}

		return auxAnimales;
	}

}
