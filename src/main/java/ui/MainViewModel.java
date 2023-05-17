package ui;

import common.TipoException;
import domain.Empleado;
import javafx.collections.ObservableList;
import service.ServicioGestion;
import javafx.collections.FXCollections;

public class MainViewModel {
	
	    private final ServicioGestion serviciog;
	    private final ObservableList<Empleado> empleados;

	    public MainViewModel() throws TipoException {
	    	serviciog = new ServicioGestion();
	        empleados = FXCollections.observableArrayList(serviciog.getListaEmpleados());
	    }

	    public MainViewModel(ServicioGestion servicioEmpleados) throws TipoException {
	        this.serviciog = servicioEmpleados;
	        empleados = FXCollections.observableArrayList(serviciog.getListaEmpleados());

	    }
	    public ObservableList<Empleado> getEmpleados() {
	        return empleados;
	    }

	    public ServicioGestion getServicioGestion() { return serviciog; }
	}
	
