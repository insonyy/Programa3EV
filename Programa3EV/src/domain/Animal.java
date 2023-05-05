package domain;

import java.time.*;
import lombok.Data;

@Data
public class Animal {
	private String nombre;
	private String especie;
	private String tipo;//Raza
	private String tratamiento;
	private int edad;
	private boolean ingresado;
	private LocalDate fecha;
	private Empleado empleado;//Medico asignado
	
	//Constructor
	public Animal(String nombre, String especie, int edad, String tipo) {
		this.nombre = nombre;
		this.especie = especie;
		this.edad = edad;
		this.tipo = tipo;
	}
	public Animal() {}
	public void fechaingreso() {
		int random= ((int) (Math.random()*4+1));
		if (ingresado) {
			setFecha(LocalDate.now().minusDays(random));
		}
	}
	
	public String toStringFichero(){
		return nombre + ";" + especie + ";" + tipo + ";" + edad + ";" + ingresado + ";" + fecha + ";" + empleado;
	}
	@Override
	public String toString() {
		return  nombre + " , " + especie + " , " + tipo + " , "+ edad + ".";
	}
}
