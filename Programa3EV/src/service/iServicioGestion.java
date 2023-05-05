package service;

import java.util.List;
import java.util.Set;

import common.TipoException;
import domain.*;

public interface iServicioGestion {
	public Set<Animal> getListaAnimales()throws TipoException;
	public boolean nuevoAnimal(Animal animal)throws TipoException;
	public boolean modificarAnimal(Animal animal)throws TipoException;
	public boolean eliminarFichaAnimal(Animal animal)throws TipoException;
	public List<Empleado> getListaEmpleados()throws TipoException;
	public boolean nuevoEmpleado(Empleado empleado)throws TipoException;
	public boolean modificarEmpleado(Empleado empleado)throws TipoException;
	public boolean eliminarFichaEmpleado(Empleado empleado)throws TipoException;
	public Set<Animal> getListaTratamientos()throws TipoException;
	public boolean nuevoTratamiento(Animal tratamiento, Animal animal)throws TipoException;
	public boolean modificarTratamiento(Animal tratamiento, Animal animal)throws TipoException;
	public boolean suspenderTratamiento(Animal tratamiento, Animal animal)throws TipoException;
	public Set<Animal> listarPacientesIngresados(Boolean ingresado)throws TipoException;
	public Set<Animal> listarPacientesEspecie()throws TipoException;
	public Set<Animal> listarEmpleadosCargo()throws TipoException;
	public Set<Animal> listarTratamientosActivos()throws TipoException;
}
