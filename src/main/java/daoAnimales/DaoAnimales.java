package daoAnimales;

import java.util.Set;
import domain.Animal;


public interface DaoAnimales {
	public Set<Animal> getListaAnimales();
	public Set<Animal> getListaAnimalesEspecie();
	public boolean nuevoAnimal(Animal animal);
	public boolean modificarAnimal(String nombre, String especie, String tipo, int edad);
	public boolean eliminarFichaAnimal(String nombre);
	public Set<Animal> getListaTratamientos();
	public boolean nuevoTratamiento(String nombre, String tratamiento);
	public boolean modificarTratamiento(String nombre, String tratamiento);
	public boolean suspenderTratamiento(String nombre, String tratamiento);

}
