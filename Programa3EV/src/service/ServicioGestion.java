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
    public void getListaTratamientos() throws TipoException {	
		daoAnimales.getListaAnimales().forEach(Animal::getTratamiento);
    }

    @Override
    public boolean nuevoTratamiento(String tratamiento, Animal animal) throws TipoException {
        return daoAnimales.nuevoTratamiento(tratamiento,animal);
    }

    @Override
    public boolean modificarTratamiento() throws TipoException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del animal");
        String nombre = sc.nextLine();
        System.out.println("Introduce el nuevo tratamiento");
        String tratamiento = sc.nextLine();
        return daoAnimales.modificarTratamiento(tratamiento, (Animal) getListaAnimales().stream().filter(a->a.getNombre().contentEquals(nombre)));
    }

    @Override
    public boolean suspenderTratamiento() throws TipoException {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del animal");
        String nombre = sc.nextLine();
        return daoAnimales.suspenderTratamiento((Animal) getListaAnimales().stream().filter(a->a.getNombre().contentEquals(nombre)));
    }

    @Override
    public Set<Animal> listarPacientesIngresados(Boolean ingresado) throws TipoException {
        return daoAnimales.listarPacientesIngresados(ingresado);
    }

    @Override
    public void listarPacientesEspecie() throws TipoException {
    	Set<Animal> list = daoAnimales.getListaAnimales();
    	Collections.sort((List<Animal>) list, (o1, o2) -> o1.getEspecie().compareTo(o2.getEspecie()));
    }

    @Override
    public void listarEmpleadosCargo() throws TipoException {
    	List emple = daoEmpleados.getListaEmpleados();
    	Collections.sort((List<Empleado>) emple, (o1, o2) -> o1.getCargo().compareTo(o2.getCargo()));
    }

}
