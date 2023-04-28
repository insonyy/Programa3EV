package dao;

import domain.Animal;

import java.util.List;

public class DaoAnimalesImp implements DaoAnimales{


    @Override
    public List<Animal> getListaAnimales() {
        return null;
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
