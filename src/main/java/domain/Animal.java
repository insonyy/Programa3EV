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
	
	//Constructor
	public Animal(String nombre, String especie, String tipo,int edad) {
		this.nombre = nombre;
		this.especie = especie;
		this.tipo = tipo;
		this.edad = edad;

	}
	public String toStringFichero(){
		return nombre + "," + especie + "," + tipo + "," + edad;
	}
	@Override
	public String toString() {
		String tostrin = "";
		if (tratamiento==null){
			tostrin = nombre + ","+ especie + "," + tipo + ","+ edad;
		}else {
			tostrin=nombre + "," + especie + "," + tipo + ","+ edad +","+ tratamiento;
		}
		return tostrin  ;
	}
}
