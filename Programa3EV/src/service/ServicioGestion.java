package service;

import common.TipoException;
import dao.DaoAnimales;
import dao.DaoAnimalesImp;
import dao.DaoEmpleados;
import dao.DaoEmpleadosImp;
import domain.Animal;
import domain.Empleado;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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
    public Set<Animal> getListaAnimales() throws TipoException {
        return daoAnimales.getListaAnimales();
    }


    //por especie, tipo
    public Set<Animal> getListaAnimales(String tipo,String especie) throws TipoException {
        return daoAnimales.getListaAnimales(tipo, especie);
    }

    //por empleado

    public Set<Animal> getListaAnimales(String especie) throws TipoException {
        return daoAnimales.getListaAnimales(especie);
    }

    @Override
    public boolean nuevoAnimal() throws TipoException {
        return daoAnimales.nuevoAnimal(new Animal());
    }

    @Override
    public boolean modificarAnimal() throws TipoException {
        return	daoAnimales.modificarAnimal();
    }

    @Override
    public boolean eliminarFichaAnimal(Animal animal) throws TipoException {
        return daoAnimales.eliminarFichaAnimal(animal);
    }

    @Override
    public List<Empleado> getListaEmpleados() throws TipoException {
        return daoEmpleados.getListaEmpleados();
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
        Empleado empleado = new Empleado(nombre,apellido,dni,cargo);
        return daoEmpleados.nuevoEmpleado(empleado);
    }

    @Override
    public boolean modificarEmpleado(Empleado empleado) throws TipoException {
        return daoEmpleados.modificarEmpleado(empleado);
    }

    @Override
    public boolean eliminarFichaEmpleado(Empleado empleado) throws TipoException {
        return daoEmpleados.eliminarFichaEmpleado(empleado);
    }

    
	@Override
    public Set<Animal> getListaTratamientos() throws TipoException {
		///////////(Set<Animal>) daoAnimales.getListaAnimales().stream().filter(a->a.getTratamiento());
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
