package ui;

import java.util.List;

import common.TipoException;
import daoAnimales.DaoAnimales;
import daoEmpleados.DaoEmpleados;
import domain.Animal;
import domain.Empleado;
import javafx.collections.ObservableList;
import service.ServicioGestion;
import javafx.collections.FXCollections;

public class MainViewModel {
	
	    private final ServicioGestion serviciog;
	    private final ObservableList<Animal> animals;

	    public MainViewModel() throws TipoException {
	    	serviciog = new ServicioGestion();
	        animals = FXCollections.observableArrayList(serviciog.getListaAnimales());
	    }

	    public MainViewModel(ServicioGestion servicioAnimales) throws TipoException {
	        this.serviciog = servicioAnimales;
	        animals = FXCollections.observableArrayList(serviciog.getListaAnimales());

	    }
	    public ObservableList<Animal> getAnimales() {
	        return animals;
	    }

	    public ServicioGestion getServicioGestion() { return serviciog; }
	}
	
