package dao;

import domain.Animal;
import domain.Empleado;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DaoAnimalesImp implements DaoAnimales{

protected final Animales lista;

    /*Constructores*/

    public DaoAnimalesImp() {
        this.lista = new Animales();
    }

    public DaoAnimalesImp(Animales lista) {
        this.lista = lista;
    }



    /*Métodos*/

    //sobrecarga para pillar la lista de los animales
    //por especie

    @Override
    public Set<Animal> getListaAnimales() {
        return null;
    }

    public Set<Animal> getListaAnimales(String especie) {
        Set<Animal> auxAnimales = new HashSet<>();
        for (int i =  0; i < lista.getAnimales().size(); i++){
            if (lista.getAnimales().equals(especie)){
                auxAnimales.add(lista.getAnimales());
            }
        }
        return auxAnimales;
    }

    //por tipo

    public Set<Animal> getListaAnimales(String tipo) {
        Set<Animal> auxAnimales = new HashSet<>();
        for (int i =  0; i < lista.getAnimales().size(); i++){
            if (lista.getAnimales().equals(tipo)){
                auxAnimales.add(lista.getAnimales());
            }
        }
        return auxAnimales;
    }

    //por empleado

    public Set<Animal> getListaAnimales(Empleado empleado) {
        Set<Animal> auxAnimales = new HashSet<>();
        for (int i =  0; i < lista.getAnimales().size(); i++){
            if (lista.getAnimales().equals(empleado)){
                auxAnimales.add(lista.getAnimales());
            }
        }
        return auxAnimales;
    }

    @Override
    public boolean nuevoAnimal(Animal animal) {
        return false;
    }

    @Override
    public boolean modificarAnimal(Animal animal) {
        return false;
    }

    @Override
    public boolean eliminarFichaAnimal(Animal animal) {
        return false;
    }

    @Override
    public Set<Animal> getListaTratamientos() {
        return null;
    }

    @Override
    public boolean nuevoTratamiento(Animal tratamiento, Animal animal) {
        return false;
    }

    @Override
    public boolean modificarTratamiento(Animal tratamiento, Animal animal) {
        return false;
    }

    @Override
    public boolean suspenderTratamiento(Animal tratamiento, Animal animal) {
        return false;
    }

    @Override
    public boolean listarPacientesIngresados() {
        return false;
    }

    @Override
    public boolean listarPacientesEspecie() {
        return false;
    }
}
