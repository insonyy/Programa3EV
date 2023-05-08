package dao;

import domain.Animal;
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

	public Set<Animal> getListaAnimales(String especie) {
		Set<Animal> auxAnimales = lista.getAnimales().stream().filter(a->a.getEspecie().equals(especie)).collect(Collectors.toSet());
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
			if (auxAnimalesTodo.get(i).getTipo().equals(empleado)){
				auxAnimalesSub.add(auxAnimalesTodo.get(i));
			}
		}
		return new HashSet(auxAnimalesSub);
	}

	@Override
	public boolean nuevoAnimal(Animal animal) {
		Scanner sc = new Scanner(System.in);
		boolean nuevo=true;
        System.out.println("Introduce el nombre del nuevo paciente");
        String nombre = sc.nextLine();
        System.out.println("Introduce la especie del paciente");
        String especie = sc.nextLine();
        System.out.println("Introduce su edad");
        int edad = sc.nextInt();
        System.out.println("Introduce su raza");
        String raza = sc.nextLine();
        animal = new Animal(nombre, especie, edad, raza);  
		lista.getAnimales().add(animal);
		return nuevo;
	}
	@Override
	public boolean modificarAnimal() {
		Scanner scanner = new Scanner(System.in);
		boolean nuevo=true;
		System.out.println("Nombre del animal cuya ficha desea modificar:");
		String nombre = scanner.nextLine();
		Animal animalico=(Animal) lista.getAnimales().stream().filter(a->a.getNombre().equalsIgnoreCase(nombre));
		System.out.println("¿Desea modificar el tratamiento? s/n");
		try {
			char t=(char) System.in.read();
			if (t=='s'||t=='S') {
				System.out.println("Introduzca nuevo tratamiento:");
				String tratamiento=scanner.nextLine();
				animalico.setTratamiento(tratamiento);
			}else if (t=='n'||t=='N') {
				System.out.println("¿Desea modificar el empleado a cargo? s/n");
				char e=(char) System.in.read();
				if (e=='s'||e=='S') {
					System.out.println("Introduzca nuevo empleado a cargo:");
					String empleadoAC=scanner.nextLine();
					animalico.setEmpleado((Empleado) imp.getListaEmpleados().stream().filter(a->a.getNombre().equals(empleadoAC)));
				}else if (e=='n'||e=='N') {
					System.out.println("¿Desea modificar el estado de ingreso? s/n");
					char i=(char) System.in.read();
					if (i=='s'||i=='S') {
						System.out.println("Para ingresar pulse 's' para dar de alta pulse 'n'");
						char ii=(char) System.in.read();
						if (ii=='s'||ii=='S') {
							animalico.setIngresado(true);
						}else if (ii=='n'||ii=='N') {
							animalico.setIngresado(false);
						}
					}else if (i=='n'||i=='N') {
						System.out.println("Modificaciones realizadas");
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
	public boolean eliminarFichaAnimal(Animal animal) {
		boolean borrar=true;
		lista.getAnimales().remove(animal);
		return borrar;
	}

	@Override
	public Set<Animal> getListaTratamientos(String tratamiento, Animal animal) {
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
	public boolean nuevoTratamiento(String tratamiento, Animal animal) {
		boolean nuevo=true;
		animal.setTratamiento(tratamiento);
		return nuevo;
	}

	@Override
	public boolean modificarTratamiento(String tratamiento, Animal animal) {
		Scanner scanner = new Scanner(System.in);
		boolean nuevo=true;
		System.out.println("Tratamiento actual" + animal.getTratamiento());
		tratamiento=scanner.nextLine();
		animal.setTratamiento(tratamiento);
		System.out.println("Nuevo tratamiento" + animal.getTratamiento());
		return nuevo;
	}

	@Override
	public boolean suspenderTratamiento(Animal animal) {
		boolean nuevo=true;
		animal.setTratamiento("");
		return nuevo;
	}

	@Override
	public Set<Animal> listarPacientesIngresados(boolean ingresado) {
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
