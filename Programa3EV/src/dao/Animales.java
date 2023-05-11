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
        /*animales = new HashSet<>();
        //Perros
        animales.add(new Animal("Pepe", "perro", 1, "Border Collie"));
        animales.add(new Animal("Zen", "perro", 4, "Pastor Aleman"));
        animales.add(new Animal("Lionell", "perro", 1, "Border Collie"));
        animales.add(new Animal("Wario", "perro", 2, "Pitbull"));
        animales.add(new Animal("Clifford", "perro", 5, "Akita Inu"));
        animales.add(new Animal("Chief", "perro", 4, "Perro de aguas"));
        animales.add(new Animal("Ducan", "perro", 1, "Gran Danes"));
        animales.add(new Animal("RJ45", "perro", 2, "Caniche"));
        animales.add(new Animal("Roomba", "perro", 1, "Golden Retriever"));
        animales.add(new Animal("Slinky", "perro", 1, "Dachshund"));
        animales.add(new Animal("Stinly", "perro", 1, "Dachshund"));
        animales.add(new Animal("Snitchnine", "perro", 2, "San Bernardo"));

        //Gatos

        animales.add(new Animal("Francisco", "gato", 1, "Maine Coon"));
        animales.add(new Animal("Hermenegildo", "gato", 4, "Bosque de Noruega"));
        animales.add(new Animal("Khidir Karawita", "gato", 1, "Comun"));
        animales.add(new Animal("Pedro pspspscal", "gato", 2, "Tabby"));
        animales.add(new Animal("Miawrano Rajoy ", "gato", 2, "Chinchilla Persian"));
        animales.add(new Animal("Minino Bravo ", "gato", 5, "Comun"));
        animales.add(new Animal("Olivia", "gato", 2, "Scottish fold"));
        animales.add(new Animal("Benjamin Button", "gato", 4, "Ragdoll"));
        animales.add(new Animal("Meredith", "gato", 1, "Scottish fold"));
        animales.add(new Animal("Paseoquito", "gato", 5, "Calico"));
        animales.add(new Animal("Roosevelt", "gato", 1, "Tabby"));

        //Roedor

        animales.add(new Animal("Vergil", "roedor", 1, "Conejo"));
        animales.add(new Animal("Dante", "roedor", 2, "Hamster"));
        animales.add(new Animal("Nero", "roedor", 1, "Chinchilla"));
        animales.add(new Animal("Fajar Ayub", "roedor", 1, "Jerbo"));
        animales.add(new Animal("Enrique Pastor", "roedor", 1, "Conejo de Indias"));
        animales.add(new Animal("Antonio Recio", "roedor", 1, "Conejo de Indias"));
        animales.add(new Animal("Moohammad Ali", "roedor", 1, "Liebre"));
        animales.add(new Animal("Eustaquio", "roedor", 1, "Conejo"));
        animales.add(new Animal("Izzy", "roedor", 1, "Conejos"));
        animales.add(new Animal("Dizzy", "roedor", 1, "Conejo"));
        animales.add(new Animal("Santiago Segura", "roedor", 4, "Rata"));
        animales.add(new Animal("Paco Sanz", "roedor", 1, "Rata"));

        //pájaros

        animales.add(new Animal("Boris Izaguirre", "pajaro", 1, "Guacamayo"));
        animales.add(new Animal("Jose Mota", "pajaro", 3, "Cacatua"));
        animales.add(new Animal("Angel Llacer", "pajaro", 1, "Agaporni"));
        animales.add(new Animal("Piolin", "pajaro", 3, "Canario"));
        animales.add(new Animal("Charles Leclerc", "pajaro", 2, "Diamante de goud"));
        animales.add(new Animal("Pablo", "pajaro", 1, "Guacamayo"));
        animales.add(new Animal("Arnie", "pajaro", 2, "Cuervo"));
        animales.add(new Animal("Magnus", "pajaro", 2, "Ninfa"));
        animales.add(new Animal("Magnus", "pajaro", 2, "Ninfa"));*/

        animales = DaoAnimalesFicheros.readArrayList();
    }
}
