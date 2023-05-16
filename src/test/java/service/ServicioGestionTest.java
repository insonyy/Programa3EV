package service;

import daoAnimales.DaoAnimalesImp;
import daoEmpleados.DaoEmpleadosImp;
import daoIngresos.DaoIngresosImp;
import domain.Animal;
import org.junit.jupiter.api.*;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


class ServicioGestionTest {

    @InjectMocks ServicioGestion servicioGestion;

    @Mock DaoAnimalesImp daoAnimalesImp;
    @Mock DaoEmpleadosImp daoEmpleadosImp;
    @Mock DaoIngresosImp daoIngresosImp;


    @BeforeAll
    static void inicio(){
        System.out.println("Inicio de las pruebas para clase ServicioGestion");
    }

    @AfterAll
    static void fin(){
        System.out.println("Final de las pruebas para la clase ServicioGestion");
    }

    @BeforeEach
    static void inicioTest(){
        System.out.println(">>Comienzo del test");
    }

    @AfterEach
    static void finTest(){
        System.out.println("--Fin del test");
    }

    @Test
    void getListaAnimales() {
        /*given*/
        Set<Animal> setAnimal = new HashSet<>();
        setAnimal.add(new Animal("Anchoa", "perro", "Collie", 3));
        setAnimal.add(new Animal("Will", "perro", "Golden", 5));
        Random r = new Random();
        for (Animal animal : setAnimal){
            setAnimal.

        }
        setAnimal.stream().forEach(System.out::println);


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
    void getListaEmpleados() {
    }

    @Test
    void nuevoEmpleado() {
    }

    @Test
    void modificarEmpleado() {
    }

    @Test
    void eliminarFichaEmpleado() {
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

    @Test
    void listarEmpleadosCargo() {
    }

    @Test
    void escribirFicheroEmpleado() {
    }

    @Test
    void escribirFicheroAnimales() {
    }
}