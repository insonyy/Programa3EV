package daoAnimales;

import daoIngresos.Ingresos;
import domain.Animal;
import java.util.*;

public class DaoAnimalesImp implements DaoAnimales{
	
	protected final Animales lista;
	protected final Ingresos ingresos;

	/*Constructores*/

	public DaoAnimalesImp() {
		this.ingresos =new Ingresos();
		this.lista = new Animales();
	}

	public DaoAnimalesImp(Animales lista, Ingresos ingresos) {
		this.lista = lista;
		this.ingresos = ingresos;
	}

	/*Métodos*/
	@Override
	public Set<Animal> getListaAnimales() {
		Set<Animal> auxAnimales = lista.getAnimales();
		return auxAnimales;
	}

	@Override
	public Set<Animal> getListaAnimalesEspecie() {
		Set<Animal> auxAnimales = lista.getAnimales();
		auxAnimales.stream().sorted((p1, p2)->p1.getEspecie().compareTo(p2.getEspecie())).forEach(System.out::println);
		return auxAnimales;
	}

	public Object getListaAnimalesEspecie(String tipo) {
		Set<Animal> auxAnimales = lista.getAnimales();
		auxAnimales.stream().sorted((p1, p2)->p1.getEspecie().compareTo(p2.getEspecie())).forEach(System.out::println);

		return true;

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

	@Override
	public boolean nuevoAnimal(Animal animal) {
 
		lista.getAnimales().add(animal);
		DaoAnimalesFicheros.escribirFicheros(lista.getAnimales());
		return true;
	}
	@Override
	public boolean modificarAnimal(String nombre, String especie, String tipo, int edad) {
		Animal animal=(Animal) lista.getAnimales().stream().filter(a->a.getNombre().equalsIgnoreCase(nombre));
		animal.setEspecie(especie);
		animal.setTipo(tipo);
		animal.setEdad(edad);
		return true;
	}
	

	@Override
	public boolean eliminarFichaAnimal(String nombre) {
		Animal animal=(Animal) getListaAnimales().stream().filter(a->a.getNombre().contentEquals(nombre));
		lista.getAnimales().remove(animal);
		return true;
	}

	@Override
	public Set<Animal> getListaTratamientos() {
		Set<Animal> auxAnimales = new HashSet<>();
		lista.getAnimales().forEach(animal -> {
			ingresos.getIngresos().forEach(ingreso -> {
				if (animal.getNombre().equalsIgnoreCase(ingreso.getNombreAnimal())) {
					animal.setTratamiento(ingreso.getTratamiento());
					auxAnimales.add(animal);
				}
			});
		});

		return auxAnimales;
	}

	@Override
	public boolean nuevoTratamiento(String nombre, String tratamiento) {
		Animal animal = getListaAnimales()
				.stream()
				.filter(a -> a.getNombre().equals(nombre))
				.findFirst()
				.orElse(null);

		if (animal != null) {
			animal.setTratamiento(tratamiento);
		}
		return true;
	}

	@Override
	public boolean modificarTratamiento(String nombre, String tratamiento) {
		Animal animal=(Animal) getListaAnimales().stream().filter(a->a.getNombre().contentEquals(nombre));		
		animal.setTratamiento(tratamiento);
		return true;
	}

	@Override
	public boolean suspenderTratamiento(String nombre, String tratamiento) {
		Animal animal=(Animal) getListaAnimales().stream().filter(a->a.getNombre().contentEquals(nombre));
		animal.setTratamiento(tratamiento);
		return true;
	}



}
