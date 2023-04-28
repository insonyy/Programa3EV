package domain;

public class Animal {
	private String nombre;
	private String especie;
	private String tipo;//Raza
	private String tratamiento;
	private int edad;
	private boolean ingresado;
	private Empleado empleado;//Medico asignado
	
	//Constructor
	public Animal(String nombre, String especie, int edad) {
		this.nombre = nombre;
		this.especie = especie;
		this.edad = edad;
	}
}
