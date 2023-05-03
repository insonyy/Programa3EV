package dao;

import java.util.List;
import java.util.Set;

import domain.Animal;

public interface DaoAnimales {
	public Set<Animal> getListaAnimales();
	public boolean nuevoAnimal(Animal animal);
	public boolean modificarAnimal(Animal animal);
	public boolean eliminarFichaAnimal(Animal animal);
	public Set<Animal> getListaTratamientos();
	public boolean nuevoTratamiento(Animal tratamiento, Animal animal);
	public boolean modificarTratamiento(Animal tratamiento, Animal animal);
	public boolean suspenderTratamiento(Animal tratamiento, Animal animal);
	public boolean listarPacientesIngresados();
	public boolean listarPacientesEspecie();
}
