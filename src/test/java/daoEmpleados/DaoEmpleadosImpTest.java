package daoEmpleados;

import org.junit.jupiter.api.*;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class DaoEmpleadosImpTest {

    @BeforeAll
    static void inicio(){
        System.out.println("Inicio de las pruebas para clase DaoEmpleadosImp");
    }

    @AfterAll
    static void fin(){
        System.out.println("Final de las pruebas para la clase DaoEmpleadosImp");
    }

    @BeforeEach
    static void inicioTest(){
        System.out.println(">>Comienzo del test");
    }

    @AfterEach
    static void finTest(){
        System.out.println("--Fin del test");
    }


    @Mock Empleados empleados;

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
    void listarEmpleadosCargo() {
    }
}