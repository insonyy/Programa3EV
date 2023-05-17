package daoIngresos;

import daoEmpleados.DaoEmpleadosImp;
import domain.Ingreso;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
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
    void inicioTest(){
        System.out.println(">>Comienzo del test");
    }

    @AfterEach
    void finTest(){
        System.out.println("--Fin del test");
    }

    @InjectMocks
    DaoIngresosImp daoIngresosImp;

    @Mock Ingresos lista;

    @Test
    void getListaIngresos(){
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

}