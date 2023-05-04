package dao;

import domain.Empleado;

import java.util.List;
import java.util.Scanner;

public class DaoEmpleadosImp implements DaoEmpleados{

protected final Empleados lista;

    public DaoEmpleadosImp() {
        this.lista = new Empleados();
    }
    public DaoEmpleadosImp(Empleados lista) {
        this.lista = lista;
    }

    @Override
    public List<Empleado> getListaEmpleados() {
        return null;
    }

    @Override
    public boolean nuevoEmpleado(Empleado empleado) {
        boolean nuevo = true;
        lista.addEmpleados(empleado);
        return nuevo;
    }

    @Override
    public boolean modificarEmpleado() {
        Scanner sc = new Scanner(System.in);
        boolean nuevo = true;
        System.out.println("Introduce el nombre del empleado:");
        String nombre = sc.nextLine();
        Empleado empleado = (Empleado) lista.getEmpleados().stream().filter(empleado1 -> empleado1.getCargo().equalsIgnoreCase(nombre));
        System.out.println("¿Cual es su nuevo cargo?");
        String cargo = sc.nextLine();
        empleado.setCargo(cargo);
        return false;
    }

    @Override
    public boolean eliminarFichaEmpleado(Empleado empleado) {
        return false;
    }

    @Override
    public boolean listarEmpleadosCargo() {
        return false;
    }

    @Override
    public boolean listarTratamientosActivos() {
        return false;
    }
}
