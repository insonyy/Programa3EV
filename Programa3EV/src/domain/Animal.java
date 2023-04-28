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

	public String getNombre() {
		return nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public String getTipo() {
		return tipo;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public int getEdad() {
		return edad;
	}

	public boolean isIngresado() {
		return ingresado;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setIngresado(boolean ingresado) {
		this.ingresado = ingresado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
}
