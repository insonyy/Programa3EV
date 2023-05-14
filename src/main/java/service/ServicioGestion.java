package service;

import common.TipoException;
import daoAnimales.*;
import daoEmpleados.DaoEmpleados;
import daoEmpleados.DaoEmpleadosFicheros;
import daoEmpleados.DaoEmpleadosImp;
import domain.Animal;
import domain.Empleado;
import java.util.List;
import java.util.Set;

public class ServicioGestion implements iServicioGestion {

    private final DaoAnimales daoAnimales;
    private final DaoEmpleados daoEmpleados;
    
    public ServicioGestion(DaoAnimales daoAnimales,DaoEmpleados daoEmpleados) {
        this.daoAnimales = daoAnimales;
        this.daoEmpleados = daoEmpleados;
    }

    public ServicioGestion(){
        this.daoAnimales = new DaoAnimalesImp();
        this.daoEmpleados = new DaoEmpleadosImp();
    }

    //sobrecarga vacía
    @Override

    //por empleado

    public Set<Animal> getListaAnimales() throws TipoException {
        return daoAnimales.getListaAnimales();
    }
    public Set<Animal> getListaAnimalesEspecie() throws TipoException {
        return daoAnimales.getListaAnimalesEspecie();
    }
    @Override
    public boolean nuevoAnimal(Animal animal) throws TipoException {
        return daoAnimales.nuevoAnimal(animal);
    }

    @Override
    public boolean modificarAnimal(String nombre, String especie, String tipo, int edad) throws TipoException {
        return	daoAnimales.modificarAnimal(nombre, especie, tipo, edad);
    }

    @Override
    public boolean eliminarFichaAnimal(String nombre) throws TipoException {
        return daoAnimales.eliminarFichaAnimal(nombre);
    }

    @Override
    public List<Empleado> getListaEmpleados() throws TipoException {
        return daoEmpleados.getListaEmpleados();
    }

    @Override
    public boolean nuevoEmpleado(Empleado empleado) throws TipoException {
        return daoEmpleados.nuevoEmpleado(empleado);
    }

    @Override
    public boolean modificarEmpleado(String nombre, String cargo) throws TipoException {
        return daoEmpleados.modificarEmpleado(nombre,cargo);
    }

    @Override
    public boolean eliminarFichaEmpleado(String nombre) throws TipoException {
        return daoEmpleados.eliminarFichaEmpleado(nombre);
    }

    
	@Override
    public Set<Animal> getListaTratamientos() throws TipoException {	
		return 	daoAnimales.getListaTratamientos();
    }

    @Override
    public boolean nuevoTratamiento(String nombre, String tratamiento) throws TipoException {
        return daoAnimales.nuevoTratamiento(nombre, tratamiento);
    }

    @Override
    public boolean modificarTratamiento(String nombre, String tratamiento) throws TipoException {
        return daoAnimales.modificarTratamiento(nombre, tratamiento);
    }

    @Override
    public boolean suspenderTratamiento(String nombre, String tratamiento) throws TipoException {
        return daoAnimales.suspenderTratamiento(nombre, tratamiento);
    }

    @Override
    public List<Empleado> listarEmpleadosCargo() throws TipoException {
    	return daoEmpleados.listarEmpleadosCargo();

    }

    public boolean escribirFicheroEmpleado(List<Empleado> lista){
        return DaoEmpleadosFicheros.escribirFicherosEmpleados(lista);
    }

    public boolean escribirFicheroAnimales(Set<Animal> set){
        return DaoAnimalesFicheros.escribirFicheros(set);
    }


}
