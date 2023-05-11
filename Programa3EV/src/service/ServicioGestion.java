package service;

import common.TipoException;
import dao.DaoAnimales;
import dao.DaoAnimalesImp;
import dao.DaoEmpleados;
import dao.DaoEmpleadosImp;
import domain.Animal;
import domain.Empleado;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    public boolean nuevoAnimal() throws TipoException {
        return daoAnimales.nuevoAnimal();
    }

    @Override
    public boolean modificarAnimal() throws TipoException {
        return	daoAnimales.modificarAnimal();
    }

    @Override
    public boolean eliminarFichaAnimal() throws TipoException {
        return daoAnimales.eliminarFichaAnimal();
    }

    @Override
    public List<Empleado> getListaEmpleados() throws TipoException {
        return daoEmpleados.getListaEmpleados();
    }

    @Override
    public boolean nuevoEmpleado() throws TipoException {
        return daoEmpleados.nuevoEmpleado();
    }

    @Override
    public boolean modificarEmpleado() throws TipoException {
        return daoEmpleados.modificarEmpleado();
    }

    @Override
    public boolean eliminarFichaEmpleado() throws TipoException {
        return daoEmpleados.eliminarFichaEmpleado();
    }

    
	@Override
    public void getListaTratamientos() throws TipoException {	
		daoAnimales.getListaAnimales().forEach(Animal::getTratamiento);
    }

    @Override
    public boolean nuevoTratamiento() throws TipoException {
        return daoAnimales.nuevoTratamiento();
    }

    @Override
    public boolean modificarTratamiento() throws TipoException {
        return daoAnimales.modificarTratamiento();
    }

    @Override
    public boolean suspenderTratamiento() throws TipoException {
        return daoAnimales.suspenderTratamiento();
    }

    @Override
    public Set<Animal> listarPacientesIngresados() throws TipoException {
        return daoAnimales.listarPacientesIngresados();
    }

    @Override
    public List<Empleado> listarEmpleadosCargo() throws TipoException {
    	return daoEmpleados.listarEmpleadosCargo();

    }


}
