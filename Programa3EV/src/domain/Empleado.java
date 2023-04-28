package domain;

import lombok.Data;

@Data
public class Empleado {
	private String nombre;
	private String dni;
	private String cargo;
	//Constructor
	public Empleado(String nombre, String dni, String cargo) {
		this.nombre = nombre;
		this.dni = dni;
		this.cargo = cargo;
	}
	
}
