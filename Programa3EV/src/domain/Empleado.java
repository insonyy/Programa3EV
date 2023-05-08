package domain;

import lombok.Data;

@Data
public class Empleado implements Comparable<Empleado>{
	private String nombre;
	private String apellido;
	private String dni;
	private String cargo;

	//Constructor
	public Empleado(String nombre,String apellido, String dni, String cargo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.cargo = cargo;

	}

	public String toStringFicheroEmpleado() {
		return nombre+";"+apellido+";"+dni+";"+cargo;
	}

	@Override
	public int compareTo(Empleado o) {
		return this.nombre.compareTo(o.nombre);
	}
}
