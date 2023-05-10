package dao;

import java.util.List;
import java.util.Set;

import domain.Animal;
import domain.Empleado;

public interface DaoAnimales {
	public Set<Animal> getListaAnimales();
	public Set<Animal> getListaAnimalesEspecie();
	public Set<Animal> getListaAnimalesEspecieTipo();
	public boolean nuevoAnimal();
	public boolean modificarAnimal();
	public boolean eliminarFichaAnimal();
	public Set<Animal> getListaTratamientos();
	public boolean nuevoTratamiento();
	public boolean modificarTratamiento();
	public boolean suspenderTratamiento();
	public Set<Animal> listarPacientesIngresados();

}
