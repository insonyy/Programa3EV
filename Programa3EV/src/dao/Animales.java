package dao;

import domain.Animal;

import java.util.HashSet;
import java.util.Set;

public class Animales {

    private final Set<Animal> animales;
    private static int id;

    public Animales(){
        animales = new HashSet<>();
        //Perros
        animales.add(new Animal("Pepe", "perro", 1));
        animales.add(new Animal("Zen", "perro", 4));
        animales.add(new Animal("Lionell", "perro", 1));
        animales.add(new Animal("Wario", "perro", 2));
        animales.add(new Animal("Clifford", "perro", 5));
        animales.add(new Animal("Chief", "perro", 4));
        animales.add(new Animal("Ducan", "perro", 1));
        animales.add(new Animal("RJ45", "perro", 2));
        animales.add(new Animal("Roomba", "perro", 1));
        animales.add(new Animal("Slinky", "perro", 1));
        animales.add(new Animal("Stinly", "perro", 1));
        animales.add(new Animal("Snitchnine", "perro", 2));

        //Gatos

        animales.add(new Animal("Francisco", "gato", 1));
        animales.add(new Animal("Hermenegildo", "gato", 4));
        animales.add(new Animal("Khidir Karawita", "gato", 1));
        animales.add(new Animal("Pedro pspspscal", "gato", 2));
        animales.add(new Animal("Miawrano Rajoy ", "gato", 2));
        animales.add(new Animal("Minino Bravo ", "gato", 5));
        animales.add(new Animal("Olivia", "gato", 2));
        animales.add(new Animal("Benjamin Button", "gato", 4));
        animales.add(new Animal("Meredith", "gato", 1));
        animales.add(new Animal("Paseoquito", "gato", 5));
        animales.add(new Animal("Roosevelt", "gato", 1));

        //Roedor

        animales.add(new Animal("Vergil", "roedor", 1));
        animales.add(new Animal("Dante", "roedor", 2));
        animales.add(new Animal("Nero", "roedor", 1));
        animales.add(new Animal("Fajar Ayub", "roedor", 1));
        animales.add(new Animal("Enrique Pastor", "roedor", 1));
        animales.add(new Animal("Antonio Recio", "roedor", 1));
        animales.add(new Animal("Moohammad Ali", "roedor", 1));
        animales.add(new Animal("Eustaquio", "roedor", 1));
        animales.add(new Animal("Izzy", "roedor", 1));
        animales.add(new Animal("Dizzy", "roedor", 1));
        animales.add(new Animal("Santiago Segura", "roedor", 4));
        animales.add(new Animal("Paco Sanz", "roedor", 1));

        //pájaros

        animales.add(new Animal("Boris Izaguirre", "pajaro", 1));
        animales.add(new Animal("Jose Mota", "pajaro", 1));
        animales.add(new Animal("Angel Llacer", "pajaro", 1));
        animales.add(new Animal("Piolin", "pajaro", 1));
        animales.add(new Animal("Charles Leclerc", "pajaro", 1));
        animales.add(new Animal("Boris Izaguirre", "pajaro", 1));
    }

    public Animales(Set<Animal> animales) {
        this.animales = animales;
    }

}
