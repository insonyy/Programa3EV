package domain;

import java.time.LocalDate;
import lombok.Data;

@Data
public class Ingreso {
    private LocalDate fecha;
    private String nombreAnimal;
    private String nifEmpleado;
    private String tratamiento;

    public Ingreso(String nombreAnimal,String tratamiento, String nifEmpleado, LocalDate fecha) {
        this.fecha = fecha;
        this.nombreAnimal = nombreAnimal;
        this.nifEmpleado = nifEmpleado;
        this.tratamiento = tratamiento;
    }
    
	public String toString() {
		return  nombreAnimal + ";" + tratamiento + ";" + nifEmpleado + ";" + fecha;
	}
}
