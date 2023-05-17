package daoIngresos;

import org.assertj.core.api.Assertions;
import domain.Ingreso;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class DaoIngresosImpTest {
    @InjectMocks
    DaoIngresosImp daoIngresosImp;
    @Mock
    Ingresos lista;
    @BeforeAll
    static void inicio(){
        System.out.println("Inicio de las pruebas para clase DaoIngresosImp");
    }

    @AfterAll
    static void fin(){
        System.out.println("Final de las pruebas para la clase DaoIngresosImp");
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
    void getListaIngresos() {
        /*given*/
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Ingreso> listaIngresos = new ArrayList<>();
        listaIngresos.add(new Ingreso("Zen", "cortar uñas", "333333333C", LocalDate.parse("10/03/2023",formato)));
        listaIngresos.add(new Ingreso("Olivia", "lavar", "42598136R", LocalDate.parse("25/02/2023",formato)));

        /*when*/
        when(lista.getIngresos()).thenReturn(listaIngresos);
        List<Ingreso> resultado = daoIngresosImp.getListaIngresos();

        /*then*/
        assertAll(
                ()-> assertThat(resultado).isEqualTo(listaIngresos),
                ()-> assertThat(resultado).isNotNull()
        );
    }

//    @ParameterizedTest
//    @ValueSource(strings = {"Olivia", "Zen"})
//    void getListaIngresosPaciente(String nombre) {
//        /*given*/
//        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        List<Ingreso> listaIngresosPaciente = new ArrayList<>();
//        listaIngresosPaciente.add(new Ingreso("Zen", "cortar uñas", "333333333C", LocalDate.parse("10/03/2023",formato)));
//        listaIngresosPaciente.add(new Ingreso("Olivia", "lavar", "42598136R", LocalDate.parse("25/02/2023",formato)));
//        listaIngresosPaciente.stream().filter(a->a.getNombreAnimal().equalsIgnoreCase(nombre));
//
//        /*when*/
//        when(lista.getIngresos()).thenReturn(listaIngresosPaciente);
//        List<Ingreso> resultado = daoIngresosImp.getListaIngresosPaciente(nombre);
//
//        /*then*/
//        assertAll(
//                () -> assertThat(resultado).isEqualTo(listaIngresosPaciente),
//                () -> assertThat(resultado).isNotNull()
//        );
//
//    }

    @Test
    void getListaIngresosEmpleado() {
    }

    @Test
    void getListaIngresosFecha() {
    }

    @Test
    void getListaIngresosporPaciente() {
    }

    @Test
    void getListaIngresosporEmpleado() {
    }

    @Test
    void getListaIngresosporFecha() {
    }

    @Test
    void nuevoIngresoLleno() {
        /*given*/
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Ingreso ingreso = new Ingreso("Pepe", "corte de pelo", "87165583C", LocalDate.parse("02/05/2023", formato));

        /*when*/
        when(lista.getIngresos()).thenReturn(new ArrayList<>());
        boolean res = daoIngresosImp.nuevoIngreso(ingreso);

        /*then*/
        assertThat(res).isEqualTo(true);
    }

    @Test
    void nuevoIngresoNull() {
        /*given*/
        Ingreso ingreso = null;

        /*when*/
        when(lista.getIngresos()).thenReturn(new ArrayList<>());
        boolean res = daoIngresosImp.nuevoIngreso(ingreso);

        /*then*/
        assertThat(res).isEqualTo(true);

    }

    @Test
    void eliminarIngreso() {
        /*given*/
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Ingreso> listaIngresos = new ArrayList<>();
        Ingreso ingreso1 = new Ingreso("Zen", "cortar uñas", "333333333C", LocalDate.parse("10/03/2023",formato));
        Ingreso ingreso2 = new Ingreso("Olivia", "lavar", "42598136R", LocalDate.parse("25/02/2023",formato));
        listaIngresos.add(ingreso1);
        listaIngresos.add(ingreso2);

        /*when*/
        when(lista.getIngresos()).thenReturn(listaIngresos);
        daoIngresosImp.eliminarIngreso(ingreso1);

        /*then*/
        assertAll(
                () -> Assertions.assertThat(listaIngresos).doesNotContain(ingreso1),
                () -> Assertions.assertThat(listaIngresos).contains(ingreso2)
        );
        verify(lista, times(1)).getIngresos();
    }
}