package service;

import common.TipoException;
import daoAnimales.DaoAnimalesImp;
import daoEmpleados.DaoEmpleadosImp;
import daoIngresos.DaoIngresosImp;
import domain.Animal;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.*;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@Log4j2
@ExtendWith(MockitoExtension.class)

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
    void inicioTest(){
        System.out.println(">>Comienzo del test");
    }

    @AfterEach
    void finTest(){
        System.out.println("--Fin del test");
    }

    @Test
    void getListaAnimales() throws TipoException {
        /*given*/
        Set<Animal> setAnimales = new HashSet<>();
        int num = ((int) (Math.random()*1 + 5));
        setAnimales.add(new Animal("Pablo","perro","Pitbull", num));
        setAnimales.add(new Animal("Luna","perro","Labrador", num));
        setAnimales.add(new Animal("Luke","perro","Boxer", num));
        setAnimales.add(new Animal("Leia","perro","Boxer", num));

        /*when*/
        when(daoAnimalesImp.getListaAnimales()).thenReturn(setAnimales);
        Set<Animal> respuesta = servicioGestion.getListaAnimales();

        /*then*/
        assertThat(respuesta).isEqualTo(setAnimales);
        log.info("Ejecutando test getListaAnimales...");
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