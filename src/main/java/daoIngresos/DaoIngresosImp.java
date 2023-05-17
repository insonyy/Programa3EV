package daoIngresos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import domain.Animal;
import domain.Ingreso;

public class DaoIngresosImp implements DaoIngresos {

	final Ingresos ingresos;
	private final Map<String, String> map;

	public DaoIngresosImp(Ingresos ingresos, Map<String, String> map) {
		this.ingresos = ingresos;
		this.map = map;
	}

	public DaoIngresosImp() {
		this.ingresos = new Ingresos();
		map=new HashMap<>();
		for (int j = 0; j < ingresos.getIngresos().size(); j++) {
			map.put("nombre", ingresos.getIngresos().get(j).getNombreAnimal());
			map.put("dniemple", ingresos.getIngresos().get(j).getNifEmpleado());
			map.put("tratamiento", ingresos.getIngresos().get(j).getTratamiento());
			map.put("fechaingreso", ingresos.getIngresos().get(j).getFecha().toString());
		}
		
	}

	@Override
	public List<Ingreso> getListaIngresos() {
		List<Ingreso> listaIngresos=ingresos.getIngresos();
		return listaIngresos;
	}

	@Override
	public List<Ingreso> getListaIngresosPaciente(String nombre) {
		List<Ingreso> listaIngresos= ingresos.getIngresos();
		return (List<Ingreso>) listaIngresos.stream().filter(a->a.getNombreAnimal().equalsIgnoreCase(nombre));
	}

	@Override
	public List<Ingreso> getListaIngresosEmpleado(String dni) {
		List<Ingreso> listaIngresos= ingresos.getIngresos();
		return (List<Ingreso>) listaIngresos.stream().filter(a->a.getNifEmpleado().equalsIgnoreCase(dni));
	}

	@Override
	public List<Ingreso> getListaIngresosFecha(String fecha) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		List<Ingreso> listaIngresos= ingresos.getIngresos();
		return (List<Ingreso>) listaIngresos.stream().filter(a->a.getFecha()==LocalDate.parse(fecha, formato));
	}

	@Override
	public void getListaIngresosporPaciente() {
		List<Ingreso> listaIngresos= ingresos.getIngresos();	
		listaIngresos.stream().map(ingresos->ingresos.getNombreAnimal()).sorted().forEach(System.out::println);
	}

	@Override
	public void getListaIngresosporEmpleado() {
		List<Ingreso> listaIngresos= ingresos.getIngresos();	
		listaIngresos.stream().map(ingresos->ingresos.getNifEmpleado()).sorted().forEach(System.out::println);
	}

	@Override
	public void getListaIngresosporFecha() {
		List<Ingreso> listaIngresos= ingresos.getIngresos();	
		listaIngresos.stream().map(ingresos->ingresos.getFecha()).sorted().forEach(System.out::println);
	}

	@Override
	public boolean nuevoIngreso(Ingreso ingreso) {
		ingresos.getIngresos().add(ingreso);
		return false;
	}

	@Override
	public boolean eliminarIngreso(Ingreso ingreso) {
		ingresos.getIngresos().remove(ingreso);
		return false;
	}

	@Override
	public boolean modificarIngreso(Ingreso ingreso) {	
		ingresos.getIngresos().stream().filter(a->a.getNombreAnimal().equalsIgnoreCase(ingreso.getNombreAnimal()));
		return false;
	}
}
