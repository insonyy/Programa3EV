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

    @Test
    void getListaEmpleados() {

        /*given*/
        List<Empleado> listEmpleado = new ArrayList<>();
        listEmpleado.add(new Empleado("Eneldo", "Papalopoulos","86867509M", "recepcionista"));
        listEmpleado.add(new Empleado("Anabel", "Pérez","20370318T", "doctor"));

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