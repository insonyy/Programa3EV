package dao;

import domain.Animal;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;
@Data
public class Animales {

    private final Set<Animal> animales;
    private static int id;

    public Animales(){
  
       animales = new HashSet<>();
        //Perros
        animales.add(new Animal("Pepe", "perro", "Border Collie", 1));
        animales.add(new Animal("Zen", "perro", "Pastor Aleman", 4));
        animales.add(new Animal("Lionell", "perro", "Border Collie", 1));
        animales.add(new Animal("Wario", "perro", "Pitbull", 2));
        animales.add(new Animal("Clifford", "perro", "Akita Inu", 5));
        animales.add(new Animal("Chief", "perro", "Perro de aguas", 4));
        animales.add(new Animal("Ducan", "perro", "Gran Danes", 1));
        animales.add(new Animal("RJ45", "perro", "Caniche", 2));
        animales.add(new Animal("Roomba", "perro", "Golden Retriever", 1));
        animales.add(new Animal("Slinky", "perro", "Dachshund", 1));
        animales.add(new Animal("Stinly", "perro", "Dachshund", 1));
        animales.add(new Animal("Snitchnine", "perro", "San Bernardo", 2));

        //Gatos

        animales.add(new Animal("Francisco", "gato", "Maine Coon", 1));
        animales.add(new Animal("Hermenegildo", "gato", "Bosque de Noruega", 4));
        animales.add(new Animal("Khidir Karawita", "gato", "Comun", 1));
        animales.add(new Animal("Pedro pspspscal", "gato", "Tabby", 2));
        animales.add(new Animal("Miawrano Rajoy ", "gato", "Chinchilla Persian", 2));
        animales.add(new Animal("Minino Bravo ", "gato", "Comun", 5));
        animales.add(new Animal("Olivia", "gato", "Scottish fold", 2));
        animales.add(new Animal("Benjamin Button", "gato", "Ragdoll", 4));
        animales.add(new Animal("Meredith", "gato", "Scottish fold", 1));
        animales.add(new Animal("Paseoquito", "gato", "Calico", 5));
        animales.add(new Animal("Roosevelt", "gato", "Tabby", 1));

        //Roedor

        animales.add(new Animal("Vergil", "roedor", "Conejo", 1));
        animales.add(new Animal("Dante", "roedor", "Hamster", 2));
        animales.add(new Animal("Nero", "roedor", "Chinchilla", 1));
        animales.add(new Animal("Fajar Ayub", "roedor", "Jerbo", 1));
        animales.add(new Animal("Enrique Pastor", "roedor", "Conejo de Indias", 1));
        animales.add(new Animal("Antonio Recio", "roedor", "Conejo de Indias", 1));
        animales.add(new Animal("Moohammad Ali", "roedor", "Liebre", 1));
        animales.add(new Animal("Eustaquio", "roedor", "Conejo", 1));
        animales.add(new Animal("Izzy", "roedor", "Conejos", 1));
        animales.add(new Animal("Dizzy", "roedor", "Conejo", 1));
        animales.add(new Animal("Santiago Segura", "roedor", "Rata", 4));
        animales.add(new Animal("Paco Sanz", "roedor", "Rata", 1));

        //pájaros

        animales.add(new Animal("Boris Izaguirre", "pajaro", "Guacamayo", 1));
        animales.add(new Animal("Jose Mota", "pajaro", "Cacatua", 3));
        animales.add(new Animal("Angel Llacer", "pajaro", "Agaporni", 1));
        animales.add(new Animal("Piolin", "pajaro", "Canario", 3));
        animales.add(new Animal("Charles Leclerc", "pajaro", "Diamante de goud", 2));
        animales.add(new Animal("Pablo", "pajaro", "Guacamayo", 1));
        animales.add(new Animal("Arnie", "pajaro", "Cuervo", 2));
        animales.add(new Animal("Magnus", "pajaro", "Ninfa", 2));
        animales.add(new Animal("Magnus", "pajaro", "Ninfa", 2));

        //animales = DaoAnimalesFicheros.readArrayList();
    }
}
