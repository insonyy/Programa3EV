package dao;

import java.util.List;
import domain.Animal;

public interface DaoAnimales {
	public List<Animal> getListaAnimales();
	public boolean nuevoAnimal(Animal animal);
	public boolean modificarAnimal(Animal animal);
	public boolean eliminarFichaAnimal(Animal animal);
	public List<Animal> getListaTratamientos();
	public boolean nuevoTratamiento(Animal tratamiento, Animal animal);
	public boolean modificarTratamiento(Animal tratamiento, Animal animal);
	public boolean suspenderTratamiento(Animal tratamiento, Animal animal);
	public boolean listarPacientesIngresados();
	public boolean listarPacientesEspecie();
}
