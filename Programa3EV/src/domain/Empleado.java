package domain;

import lombok.Data;

@Data
public class Empleado implements Comparable<Empleado>{
	private String nombre;
	private String dni;
	private String cargo;
	//Constructor
	public Empleado(String nombre, String dni, String cargo) {
		this.nombre = nombre;
		this.dni = dni;
		this.cargo = cargo;
	}

	public String toStringFicheroEmpleado() {
		return nombre+";"+dni+";"+cargo;
	}

	@Override
	public int compareTo(Empleado o) {
		return this.nombre.compareTo(o.nombre);
	}
}
