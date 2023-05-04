package dao;

import java.util.List;
import java.util.Set;

import domain.Animal;
import domain.Empleado;

public interface DaoAnimales {
	public Set<Animal> getListaAnimales();
	public Set<Animal> getListaAnimales(String especie);
	public Set<Animal> getListaAnimales(Empleado empleado);
	public Set<Animal> getListaAnimales(String tipo, String especie);
	public boolean nuevoAnimal(Animal animal);
	public boolean modificarAnimal();
	public boolean eliminarFichaAnimal(Animal animal);
	public Set<Animal> getListaTratamientos(String tratamiento, Animal animal);
	public boolean nuevoTratamiento(String tratamiento, Animal animal);
	public boolean modificarTratamiento(String tratamiento, Animal animal);
	public boolean suspenderTratamiento(String tratamiento, Animal animal);
	public Set<Animal> listarPacientesIngresados(boolean ingresado);
}
