package daoIngresos;

import domain.Animal;
import domain.Empleado;
import domain.Ingreso;
import lombok.Data;

import java.util.*;

@Data

public class Ingresos {

/*    private int integer;
    private List<Empleado> empleados;
    private Set<Animal> animales;
    private Empleados emple;
    private Animales anim;

*/
	private List<Ingreso> ingresos;
	
//    public Ingresos(Integer integer, List<Empleado> empleados, Set<Animal> animales, Empleados emple, Animales anim) {
//        this.integer = integer;
//        this.empleados = empleados;
//        this.animales = animales;
//        this.emple = emple;
//        this.anim = anim;
//    }
//
//    public Ingresos() {
//        HashMap<Animal, Empleado> map = new HashMap<>();
//        for (int i = 0; i < emple.getEmpleados().size(); i++) {
//            Iterator<Animal> it = dai.lista.getAnimales().iterator();
//            map.put(it.hasNext(), emple.getEmpleados().get(i));
//            System.out.println(map.get(i).toString());
//        }
//    }
}
