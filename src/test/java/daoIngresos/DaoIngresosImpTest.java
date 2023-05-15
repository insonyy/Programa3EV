package daoIngresos;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class DaoIngresosImpTest {

    @BeforeAll
    static void inicio(){
        System.out.println("Inicio de las pruebas para clase DaoIngresosImp");
    }

    @AfterAll
    static void fin(){
        System.out.println("Final de las pruebas para la clase DaoIngresosImp");
    }

    @BeforeEach
    static void inicioTest(){
        System.out.println(">>Comienzo del test");
    }

    @AfterEach
    static void finTest(){
        System.out.println("--Fin del test");
    }

    @Mock Ingresos ingresos;

}