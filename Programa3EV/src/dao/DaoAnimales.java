package dao;

import java.util.List;
import domain.Animales;
import domain.Tratamiento;

public interface DaoAnimales {
	public List<Animales> getListaAnimales();
	public boolean nuevoAnimal(Animales animal);
	public boolean modificarAnimal(Animales animal);
	public boolean eliminarFichaAnimal(Animales animal);
	public List<Tratamiento> getListaTratamientos();
	public boolean nuevoTratamiento(Tratamiento tratamiento, Animales animal);
	public boolean modificarTratamiento(Tratamiento tratamiento, Animales animal);
	public boolean suspenderTratamiento(Tratamiento tratamiento, Animales animal);
	public boolean listarPacientesIngresados();
	public boolean listarPacientesEspecie();
}
