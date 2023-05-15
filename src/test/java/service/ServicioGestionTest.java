package service;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class ServicioGestionTest {

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