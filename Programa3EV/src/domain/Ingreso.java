package domain;

import java.time.LocalDate;
import java.util.HashMap;

public class Ingreso {
    private LocalDate fecha;
    private String nombreAnimal;
    private String nifEmpleado;
    private String tratamiento;

    public Ingreso(LocalDate fecha, String nombreAnimal, String nifEmpleado, String tratamiento) {
        this.fecha = fecha;
        this.nombreAnimal = nombreAnimal;
        this.nifEmpleado = nifEmpleado;
        this.tratamiento = tratamiento;
    }


}
