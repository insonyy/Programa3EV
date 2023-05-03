package service;

import common.TipoException;
import dao.DaoAnimales;
import dao.DaoAnimalesImp;
import domain.Animal;
import domain.Empleado;

import java.util.List;
import java.util.Set;

public class ServicioGestion implements iServicioGestion {

    private final DaoAnimales daoAnimales;
    //Miguel mete el final para los empleados aquí y luego tmb en los cosntructores
    // ~Inés

    public ServicioGestion(DaoAnimales daoAnimales) {
        this.daoAnimales = daoAnimales;
    }

    public ServicioGestion(){
        this.daoAnimales = new DaoAnimalesImp();
    }

    @Override
    public Set<Animal> getListaAnimales() throws TipoException {
        return daoAnimales.getListaAnimales();
    }

    @Override
    public boolean nuevoAnimal(Animal animal) throws TipoException {
        return false;
    }

    @Override
    public boolean modificarAnimal(Animal animal) throws TipoException {
        return false;
    }

    @Override
    public boolean eliminarFichaAnimal(Animal animal) throws TipoException {
        return false;
    }

    @Override
    public List<Empleado> getListaEmpleados() throws TipoException {
        return null;
    }

    @Override
    public boolean nuevoEmpleado(Empleado empleado) throws TipoException {
        return false;
    }

    @Override
    public boolean modificarEmpleado(Empleado empleado) throws TipoException {
        return false;
    }

    @Override
    public boolean eliminarFichaEmpleado(Empleado empleado) throws TipoException {
        return false;
    }

    @Override
    public Set<Animal> getListaTratamientos() throws TipoException {
        return null;
    }

    @Override
    public boolean nuevoTratamiento(Animal tratamiento, Animal animal) throws TipoException {
        return false;
    }

    @Override
    public boolean modificarTratamiento(Animal tratamiento, Animal animal) throws TipoException {
        return false;
    }

    @Override
    public boolean suspenderTratamiento(Animal tratamiento, Animal animal) throws TipoException {
        return false;
    }

    @Override
    public boolean listarPacientesIngresados() throws TipoException {
        return false;
    }

    @Override
    public boolean listarPacientesEspecie() throws TipoException {
        return false;
    }

    @Override
    public boolean listarEmpleadosCargo() throws TipoException {
        return false;
    }

    @Override
    public boolean listarTratamientosActivos() throws TipoException {
        return false;
    }
}
