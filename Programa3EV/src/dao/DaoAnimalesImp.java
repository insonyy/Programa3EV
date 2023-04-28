package dao;

import domain.Animales;
import java.util.List;

public class DaoAnimalesImp implements DaoAnimales{



    @Override
    public List<Animales> getListaAnimales() {
        return null;
    }

    @Override
    public boolean nuevoAnimal(Animales animal) {
        return false;
    }

    @Override
    public boolean modificarAnimal(Animales animal) {
        return false;
    }

    @Override
    public boolean eliminarFichaAnimal(Animales animal) {
        return false;
    }

    @Override
    public List<Animales> getListaTratamientos() {
        return null;
    }

    @Override
    public boolean nuevoTratamiento(Animales tratamiento, Animales animal) {
        return false;
    }

    @Override
    public boolean modificarTratamiento(Animales tratamiento, Animales animal) {
        return false;
    }

    @Override
    public boolean suspenderTratamiento(Animales tratamiento, Animales animal) {
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
