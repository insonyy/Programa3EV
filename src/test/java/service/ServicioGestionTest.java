package service;

import common.TipoException;
import daoAnimales.DaoAnimalesImp;
import daoEmpleados.DaoEmpleadosImp;
import daoIngresos.DaoIngresosImp;
import domain.Animal;
import domain.Empleado;
import domain.Ingreso;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.*;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

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

    @Nested
    @DisplayName("Probando las excepciones")
    public class lanzaExcepciones {
        @Test
        void getListaAnimales() {
            /*given*/

            Set<Animal> setAnimales = new HashSet<>();
            int num = ((int) (Math.random()*1 + 5));
            Animal a = new Animal("Pablo","perro","Pitbull", num);

            /*when*/
            when(daoAnimalesImp.nuevoAnimal(a)).thenReturn(true);
            boolean resp;
            try {
                resp = servicioGestion.nuevoAnimal(a);
            } catch (TipoException e) {
                log.error("comunicar errores, utilizado en excepciones");
                throw new RuntimeException(e);
            }

            /*then*/
            assertThat(resp).isTrue();
        }

        @Test
        void getListaEmpleados() {
            /*given*/
            List<Empleado> listEmpleados = new ArrayList<>();
            Empleado emp = new Empleado("Anabel", "Pérez","20370318T", "Doctor");

            /*when*/
            when(daoEmpleadosImp.nuevoEmpleado(emp)).thenReturn(true);
            boolean resp;
            try {
                resp = servicioGestion.nuevoEmpleado(emp);
            } catch (TipoException e) {
                log.error("comunicar errores, utilizado en excepciones");
                throw new RuntimeException(e);
            }

            /*then*/
            assertThat(resp).isTrue();
        }

        @Test
        void getListaIngresos() {
            /*given*/
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            List<Ingreso> listaIngresos = new ArrayList<>();
            Ingreso in = new Ingreso("Pepe", "corte de pelo", "87165583C", LocalDate.parse("02/05/2023", formato));

            /*when*/
            when(daoIngresosImp.nuevoIngreso(in)).thenReturn(true);
            boolean resp;
            try {
                resp = servicioGestion.nuevoIngreso(in);
            } catch (TipoException e) {
                log.error("comunicar errores, utilizado en excepciones");
                throw new RuntimeException(e);
            }

            /*then*/
            assertThat(resp).isTrue();
            log.info("Ejecutando test getListaIngresos...");


        }

    }

    @Test
    void nuevoAnimal() throws TipoException {

        /*when*/
        Set<Animal> setAnimal= new HashSet<>();
        Animal animal = new Animal("Pablo","perro","Pitbull", 5);
        /*given*/
        when(daoAnimalesImp.nuevoAnimal(animal)).thenReturn(true);
        boolean respuesta;
        respuesta = servicioGestion.nuevoAnimal(animal);
        /*then*/
        assertThat(respuesta).isTrue();
    }


    @Test
    void eliminarFichaAnimal() throws TipoException {
        /*given*/
        Animal animal = new Animal("Pablo","perro","Pitbull", 1);
        /*when*/
        servicioGestion.eliminarFichaAnimal("Pablo");
        /*then*/
        verify(daoAnimalesImp, times(1)).eliminarFichaAnimal("Pablo");

    }

    @Test
    void getListaEmpleados() throws TipoException {
        /*given*/
        List<Empleado> listEmpleados = new ArrayList<>();
        listEmpleados.add(new Empleado("Manolito", "Gafotas", "31586467S", "Auxiliar"));
        listEmpleados.add(new Empleado("Greg", "Gafotas", "09629774L", "Auxiliar"));
        listEmpleados.add(new Empleado("Eneldo", "Papalopoulos","86867509M", "Recepcionista"));
        listEmpleados.add(new Empleado("Anabel", "Pérez","20370318T", "Doctor"));


        /*when*/
        when(daoEmpleadosImp.getListaEmpleados()).thenReturn(listEmpleados);
        List<Empleado> respuesta = servicioGestion.getListaEmpleados();

        /*then*/
        assertThat(respuesta).isEqualTo(listEmpleados);
        log.info("Ejecutando test getListaEmpleados...");

    }

    @Test
    void nuevoEmpleado() throws TipoException {
        /*when*/
        List<Empleado> listEmpleado= new ArrayList<>();
        Empleado empleado = new Empleado("Manolito", "Gafotas", "31586467S", "Auxiliar");
        /*given*/
        when(daoEmpleadosImp.nuevoEmpleado(empleado)).thenReturn(true);
        boolean respuesta;
        respuesta = servicioGestion.nuevoEmpleado(empleado);
        /*then*/
        assertThat(respuesta).isTrue();

    }

    @Test
    void eliminarFichaEmpleado() throws TipoException {
    /*given*/
        Empleado empleado = new Empleado("Eneldo", "Papalopoulos","86867509M", "Recepcionista");

    /*when*/
        servicioGestion.eliminarFichaEmpleado("Eneldo");

    /*then*/
        verify(daoEmpleadosImp, times(1)).eliminarFichaEmpleado("Eneldo");

    }

    @Test
    void getListaIngresos() throws TipoException {
        /*given*/
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Ingreso> listaIngresos = new ArrayList<>();
        listaIngresos.add(new Ingreso("Pepe", "corte de pelo", "87165583C", LocalDate.parse("02/05/2023", formato)));
        listaIngresos.add(new Ingreso("Zen", "corte de pelo", "87165583C", LocalDate.parse("02/05/2023", formato)));
        listaIngresos.add(new Ingreso("Pepe", "corte de pelo", "87165583C", LocalDate.parse("02/05/2023", formato)));


        /*when*/
        when(daoIngresosImp.getListaIngresos()).thenReturn(listaIngresos);
        List<Ingreso> respuesta = servicioGestion.getListaIngresos();

        /*then*/
        assertThat(respuesta).isEqualTo(listaIngresos);
        log.info("Ejecutando test getListaIngresos...");


    }

    @Test
    void eliminarIngreso() throws TipoException {
        /*given*/
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Ingreso ingreso = new Ingreso("Pepe", "corte de pelo", "87165583C", LocalDate.parse("02/05/2023", formato));

        /*when*/
        servicioGestion.eliminarIngreso(ingreso);

        /*then*/
        verify(daoIngresosImp, times(1)).eliminarIngreso(ingreso);

    }

    @Test
    void nuevoIngreso() throws TipoException {
        /*when*/
        List<Ingreso> listIngreso= new ArrayList<>();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Ingreso ingreso = new Ingreso("Pepe", "corte de pelo", "87165583C", LocalDate.parse("02/05/2023", formato));
        /*given*/
        when(daoIngresosImp.nuevoIngreso(ingreso)).thenReturn(true);
        boolean respuesta;
        respuesta = daoIngresosImp.nuevoIngreso(ingreso);
        /*then*/
        assertThat(respuesta).isTrue();

    }


    @DisplayName("Test parametrizado")
    @ParameterizedTest
    @ValueSource(strings = {"Fajar Ayub","Izzy", "Zen", "Lionell"})
    void getListaIngresosPaciente(String nombre) {
        /*when*/
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Ingreso> listaIngresosPacientes = new ArrayList<>();
        listaIngresosPacientes.add(new Ingreso("Fajar Ayub", "Limado dental", "82311612S", LocalDate.parse("02/05/2023", formato)));
        listaIngresosPacientes.add(new Ingreso("Izzy", "Operación por rotura del glande", "23431186T", LocalDate.parse("14/05/2023", formato)));
        listaIngresosPacientes.add(new Ingreso("Zen", "Es demasiado bonito, debería ser un crimen", "47163084P", LocalDate.parse("15/05/2023", formato)));
        listaIngresosPacientes.add(new Ingreso("Lionell", "Adorablemente pequeño, se recomienda seguimiento", "47163084P", LocalDate.parse("15/05/2023", formato)));
        /*given*/

        List<Ingreso> resultado = new ArrayList<>();
        for (Ingreso ingreso1 : listaIngresosPacientes) {
            if (ingreso1.getNombreAnimal().equals(nombre)) {
                resultado.add(ingreso1);
            }
            /*then*/
            assertThat(resultado)
                    .isNotNull()
                    .allMatch(ingreso -> ingreso.getNombreAnimal().equals(nombre));


        }
    }
    @Test
    void getListaIngresosEmpleado(String dni){
        /*when*/
        /*given*/
        /*then*/

    }

    @Test
    void escribirFicheroEmpleado() {

    }

    @Test
    void escribirFicheroAnimales() {
        /*when*/



        /*given*/

        /*then*/


    }
}