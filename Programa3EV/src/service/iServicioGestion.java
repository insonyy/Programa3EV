package service;

import java.util.List;
import java.util.Set;

import common.TipoException;
import domain.*;

public interface iServicioGestion {
	public Set<Animal> getListaAnimales()throws TipoException;
	public Set<Animal> getListaAnimalesEspecie()throws TipoException;
	public boolean nuevoAnimal(Animal animal)throws TipoException;
	public boolean modificarAnimal(String nombre, String especie, String tipo, int edad)throws TipoException;
	public boolean eliminarFichaAnimal(String nombre)throws TipoException;
	public Set<Animal> getListaTratamientos()throws TipoException;
	public boolean nuevoTratamiento(String nombre, String tratamiento)throws TipoException;
	public boolean modificarTratamiento(String nombre, String tratamiento)throws TipoException;
	public boolean suspenderTratamiento(String nombre, String tratamiento)throws TipoException;
	public List<Empleado> getListaEmpleados()throws TipoException;
	public List<Empleado> listarEmpleadosCargo()throws TipoException;
	public boolean nuevoEmpleado(Empleado empleado)throws TipoException;;
	public boolean modificarEmpleado(String nombre, String cargo)throws TipoException;;
	public boolean eliminarFichaEmpleado(String nombre)throws TipoException;;


}
