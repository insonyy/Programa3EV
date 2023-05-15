package daoAnimales;

import domain.Animal;
import org.junit.jupiter.api.*;
import org.mockito.Mock;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

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
    static void inicioTest(){
        System.out.println(">>Comienzo del test");
    }

    @AfterEach
    static void finTest(){
        System.out.println("--Fin del test");
    }

    @Mock Animales animales;

    @Test
    void getListaAnimales() {

        //given

        Set<Animal> setAnimal = new HashSet<>();
        setAnimal.add(new Animal("Anchoa", "perro", "Collie", 3));
        setAnimal.add(new Animal("Will", "perro", "Golden", 5));

        //when

        //then
    }

    @Test
    void getListaAnimalesEspecie() {
    }

    @Test
    void testGetListaAnimales() {
    }

    @Test
    void nuevoAnimal() {
    }

    @Test
    void modificarAnimal() {
    }

    @Test
    void eliminarFichaAnimal() {
    }

    @Test
    void getListaTratamientos() {
    }

    @Test
    void nuevoTratamiento() {
    }

    @Test
    void modificarTratamiento() {
    }

    @Test
    void suspenderTratamiento() {
    }
}