package service;

import java.util.List;
import java.util.Set;

import common.TipoException;
import domain.*;

public interface iServicioGestion {
	public Set<Animal> getListaAnimales()throws TipoException;
	public Set<Animal> getListaAnimalesEspecie()throws TipoException;
	public Set<Animal> getListaAnimalesEspecieTipo()throws TipoException;
	public boolean nuevoAnimal()throws TipoException;
	public boolean modificarAnimal()throws TipoException;
	public boolean eliminarFichaAnimal()throws TipoException;
	public List<Empleado> getListaEmpleados()throws TipoException;
	public boolean nuevoEmpleado()throws TipoException;
	public boolean modificarEmpleado()throws TipoException;
	public boolean eliminarFichaEmpleado()throws TipoException;
	public void getListaTratamientos()throws TipoException;
	public boolean nuevoTratamiento()throws TipoException;
	public boolean modificarTratamiento()throws TipoException;
	public boolean suspenderTratamiento()throws TipoException;
	public Set<Animal> listarPacientesIngresados()throws TipoException;
	public void listarPacientesEspecie()throws TipoException;
	public void listarEmpleadosCargo()throws TipoException;



}
