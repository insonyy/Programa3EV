package service;

import common.TipoException;
import dao.DaoAnimales;
import dao.DaoAnimalesImp;
import domain.Animal;
import domain.Empleado;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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



    //sobrecarga vacía
    @Override
    public Set<Animal> getListaAnimales() throws TipoException {
        return daoAnimales.getListaAnimales();
    }


    //por especie, tipo
    public Set<Animal> getListaAnimales(String especie, String tipo) throws TipoException {
        return daoAnimales.getListaAnimales(tipo, especie);
    }

    //por empleado

    public Set<Animal> getListaAnimales(Empleado empleado) throws TipoException {
        return daoAnimales.getListaAnimales(empleado);
    }

    @Override
    public boolean nuevoAnimal() throws TipoException {
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
    public boolean nuevoEmpleado() throws TipoException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del nuevo empleado");
        String nombre = sc.nextLine();
        System.out.println("Introduce el apellido del nuevo empleado");
        String apellido = sc.nextLine();
        Pattern comprobar = Pattern.compile("[0-9]{8}[A-Z]");
        System.out.println("Introduce el DNI del nuevo empleado");
        String dni = sc.nextLine();
        Matcher matcher = comprobar.matcher(dni);
        System.out.println("Introduce el cargo del nuevo empleado");
        String cargo = sc.nextLine();

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
    public boolean nuevoTratamiento(Animal animal) throws TipoException {
        return false;
    }

    @Override
    public boolean modificarTratamiento(Animal animal) throws TipoException {
        return false;
    }

    @Override
    public boolean suspenderTratamiento(Animal animal) throws TipoException {
        return false;
    }

    @Override
    public Set<Animal> listarPacientesIngresados(Boolean ingresado) throws TipoException {
        return daoAnimales.listarPacientesIngresados(ingresado);
    }

    @Override
    public Set<Animal> listarPacientesEspecie() throws TipoException {
        return null;
    }

    @Override
    public Set<Animal> listarEmpleadosCargo() throws TipoException {
        return null;
    }

    @Override
    public Set<Animal> listarTratamientosActivos() throws TipoException {
        return null;
    }
}
