package daoAnimales;

import domain.Animal;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DaoAnimalesImpTest {

    @BeforeAll
    static void inicio(){
        System.out.println("Inicio de las pruebas para clase DaoAnimaleaImp");
    }

    @AfterAll
    static void fin(){
        System.out.println("Final de las pruebas para la clase DaoAnimaleaImp");
    }

    @BeforeEach
    void inicioTest(){
        System.out.println(">>Comienzo del test");
    }

    @AfterEach
    void finTest(){
        System.out.println("--Fin del test");
    }

    @InjectMocks DaoAnimalesImp daoAnimalesImp;
    @Mock Animales lista;

    @Test
    void getListaAnimales() {

        /*given*/
        Set<Animal> setAnimal = new HashSet<>();
        setAnimal.add(new Animal("Anchoa", "perro", "Collie", 3));
        setAnimal.add(new Animal("Will", "perro", "Golden", 5));

        /*when*/

        when(lista.getAnimales()).thenReturn(setAnimal);
        Set<Animal> resultado = daoAnimalesImp.getListaAnimales();

        /*then*/
        assertAll(
                ()-> assertThat(resultado).isEqualTo(setAnimal),
                ()-> assertThat(resultado).isNotNull()
        );

    }

    @Test
    void getListaAnimalesEspecie() {

        /*given*/
        Set<Animal> setAnimalEspecie = new HashSet<>();
        setAnimalEspecie.add(new Animal("Anchoa", "perro", "Collie", 3));
        setAnimalEspecie.add(new Animal("Will", "perro", "Golden", 5));
        setAnimalEspecie.stream().sorted((p1, p2) -> p1.getEspecie().compareTo(p2.getEspecie())).forEach(System.out::println);

        /*when*/
        when(lista.getAnimales()).thenReturn(setAnimalEspecie);
        Set<Animal> resultado = daoAnimalesImp.getListaAnimalesEspecie();

        /*then*/
        assertAll(
                () -> assertThat(resultado).isEqualTo(setAnimalEspecie),
                () -> assertThat(resultado).isNotNull()
        );

    }

    @Test
    void nuevoAnimalLleno() {
        /*given*/
        Animal animal = new Animal("Paquito", "roedor", "hamster", 1);

        /*when*/
        when(lista.getAnimales()).thenReturn(new HashSet<>());
        boolean res = daoAnimalesImp.nuevoAnimal(animal);
        /*then*/
        assertThat(res).isEqualTo(true);

    }

    @Test
    void nuevoAnimalVacio() {
        /*given*/
        Animal animal = null;

        /*when*/
        when(lista.getAnimales()).thenReturn(new HashSet<>());
        boolean res = daoAnimalesImp.nuevoAnimal(animal);
        /*then*/
        assertThat(res).isEqualTo(true);
    }

    @Test
    void eliminarFichaAnimal() {
        /*given*/
        Set<Animal> setAnimal = new HashSet<>();
        Animal animal1 = new Animal("Paquito", "roedor", "hamster", 1);
        Animal animal2 = new Animal("Anchoa", "perro", "Collie", 3);
        setAnimal.add(animal1);
        setAnimal.add(animal2);

        /*when*/
        when(lista.getAnimales()).thenReturn(setAnimal);
        setAnimal.remove(animal1);

        /*then*/
        
    }

    @Test
    void getListaTratamientos() {
        /*given*/



        /*when*/

        /*then*/
    }

    @Test
    void nuevoTratamiento() {
        /*given*/



        /*when*/

        /*then*/
    }

    @Test
    void modificarTratamiento() {
        /*given*/



        /*when*/

        /*then*/
    }

    @Test
    void suspenderTratamiento() {
        /*given*/



        /*when*/

        /*then*/
    }
}