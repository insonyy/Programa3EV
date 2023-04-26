package service;

import java.util.List;
import common.TipoException;
import domain.*;

public interface iServicioGestion {
	public List<Animales> getListaAnimales()throws TipoException;
	public boolean nuevoAnimal(Animales animal)throws TipoException;
	public boolean modificarAnimal(Animales animal)throws TipoException;
	public boolean eliminarFichaAnimal(Animales animal)throws TipoException;
	public List<Empleados> getListaEmpleados()throws TipoException;
	public boolean nuevoEmpleado(Empleados empleado)throws TipoException;
	public boolean modificarEmpleado(Empleados empleado)throws TipoException;
	public boolean eliminarFichaEmpleado(Empleados empleado)throws TipoException;
	public List<Tratamiento> getListaTratamientos()throws TipoException;
	public boolean nuevoTratamiento(Tratamiento tratamiento, Animales animal)throws TipoException;
	public boolean modificarTratamiento(Tratamiento tratamiento, Animales animal)throws TipoException;
	public boolean suspenderTratamiento(Tratamiento tratamiento, Animales animal)throws TipoException;
	//////
	public boolean listarPacientesIngresados()throws TipoException;
	public boolean listarPacientesEspecie()throws TipoException;
	public boolean listarEmpleadosCargo()throws TipoException;
	public boolean listarTratamientosActivos()throws TipoException;
}
