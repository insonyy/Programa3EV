package daoEmpleados;

import daoAnimales.DaoAnimalesImp;
import domain.Empleado;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
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
   void inicioTest(){
        System.out.println(">>Comienzo del test");
    }
    @AfterEach
   void finTest(){
        System.out.println("--Fin del test");
    }

    @InjectMocks DaoEmpleadosImp daoEmpleadosImp;
    @Mock Empleados lista;
    @Mock DatabaseEmpleados db;

    @Test
    void getListaEmpleados() {

        /*given*/
        List<Empleado> listEmpleado = new ArrayList<>();
        listEmpleado.add(new Empleado("Eneldo", "Papalopoulos","86867509M", "Recepcionista"));
        listEmpleado.add(new Empleado("Anabel", "Pérez","20370318T", "Doctor"));

        /*when*/
        when(lista.getEmpleados()).thenReturn(listEmpleado);
        List<Empleado> resultado = daoEmpleadosImp.getListaEmpleados();

        /*then*/
        assertAll(
                ()-> assertThat(resultado).isEqualTo(listEmpleado),
                ()-> assertThat(resultado).isNotNull()
        );

    }

    @Test
    void nuevoEmpleadoLleno() {
        /*given*/
        Empleado empleado = new Empleado("Manolito", "Gafotas", "31586467S", "Auxiliar");


        /*when*/
        when(lista.getEmpleados()).thenReturn(new ArrayList<>());
        boolean res = daoEmpleadosImp.nuevoEmpleado(empleado);

        /*then*/
        assertThat(res).isEqualTo(true);

    }

    @Test
    void nuevoEmpleadoNull() {
        /*given*/
        Empleado empleado = null;


        /*when*/
        when(lista.getEmpleados()).thenReturn(new ArrayList<>());
        boolean res = daoEmpleadosImp.nuevoEmpleado(empleado);

        /*then*/
        assertThat(res).isEqualTo(true);


    }

    @Test
    void listarEmpleadosCargo() {

        /*given*/
        List<Empleado> listEmpleadoCargo = new ArrayList<>();
        listEmpleadoCargo.add(new Empleado("Manolito", "Gafotas", "31586467S", "Auxiliar"));
        listEmpleadoCargo.add(new Empleado("Greg", "Gafotas", "09629774L", "Auxiliar"));
        listEmpleadoCargo.stream().sorted((p1, p2)->p1.getCargo().compareTo(p2.getCargo())).forEach(System.out::println);
        /*when*/
        when(lista.getEmpleados()).thenReturn(listEmpleadoCargo);
        List<Empleado> resultado = daoEmpleadosImp.listarEmpleadosCargo();

        /*then*/
        assertAll(
                () -> assertThat(resultado).isEqualTo(listEmpleadoCargo),
                () -> assertThat(resultado).isNotNull()
        );

    }
}