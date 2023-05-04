package dao;

import domain.Animal;
import domain.Empleado;

import java.util.*;
import java.util.stream.Collectors;

public class DaoAnimalesImp implements DaoAnimales{

protected final Animales lista;

    /*Constructores*/

    public DaoAnimalesImp() {
        this.lista = new Animales();
    }

    public DaoAnimalesImp(Animales lista) {
        this.lista = lista;
    }


    /*Métodos*/

    //sobrecarga para pillar la lista de los animales
    //por especie

    @Override
    public Set<Animal> getListaAnimales() {
<<<<<<< Updated upstream
    	Set<Animal> auxAnimales = lista.getAnimales();
        return auxAnimales;
=======
        Set<Animal> auxAnimal = lista.getAnimales();
        return auxAnimal;
>>>>>>> Stashed changes
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
    	boolean nuevo=true;
    	lista.getAnimales().add(animal);
        return nuevo;
    }

    @Override
    public boolean modificarAnimal(Animal animal) {
    	Scanner scanner = new Scanner(System.in);
    	boolean nuevo=true;
    	Animal animalico= new Animal();
    	System.out.println("Nombre del animal cuya ficha desea modificar:");
    	String nombre = scanner.nextLine();
    	animalico=(Animal) lista.getAnimales().stream().filter(a->a.getNombre().equalsIgnoreCase(nombre));
    	System.out.println("¿Desea modificar el tratamiento? s/n");
    	
        return nuevo;
    }

    @Override
    public boolean eliminarFichaAnimal(Animal animal) {
        return false;
    }

    @Override
    public Set<Animal> getListaTratamientos() {
        return null;
    }

    @Override
    public boolean nuevoTratamiento(Animal tratamiento, Animal animal) {
        return false;
    }

    @Override
    public boolean modificarTratamiento(Animal tratamiento, Animal animal) {
        return false;
    }

    @Override
    public boolean suspenderTratamiento(Animal tratamiento, Animal animal) {
        return false;
    }

    @Override
    public boolean listarPacientesIngresados() {
        return false;
    }
}
