package dao;

import java.util.List;
import domain.Animales;

public interface DaoAnimales {
	public List<Animales> getListaAnimales();
	public boolean nuevoAnimal(Animales animal);
	public boolean modificarAnimal(Animales animal);
	public boolean eliminarFichaAnimal(Animales animal);
	public List<Animales> getListaTratamientos();
	public boolean nuevoTratamiento(Animales tratamiento, Animales animal);
	public boolean modificarTratamiento(Animales tratamiento, Animales animal);
	public boolean suspenderTratamiento(Animales tratamiento, Animales animal);
	public boolean listarPacientesIngresados();
	public boolean listarPacientesEspecie();
}
