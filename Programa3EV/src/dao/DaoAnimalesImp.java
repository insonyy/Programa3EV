package dao;

import domain.Animal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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


    //por especie

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

    //por tratamiento

    public Set<Animal> getListaAnimales(String tratamiento) {
        Set<Animal> auxAnimales = new HashSet<>();
        for (int i =  0; i < lista.getAnimales().size(); i++){
            if (lista.getAnimales().equals(tratamiento)){
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
    public List<Animal> getListaTratamientos() {
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
