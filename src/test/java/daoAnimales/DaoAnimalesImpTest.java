package daoAnimales;

import domain.Animal;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class DaoAnimalesImpTest {

    @BeforeAll
    static void inicio(){
        System.out.println("Inicio de las pruebas para clase DaoAnimaleaImp");
    }

    @AfterAll
    static void fin(){
        System.out.println("Final de las pruebas para la clase DaoAnimaleaImp");
    }

    @BeforeEach
    void inicioTest(){
        System.out.println(">>Comienzo del test");
    }

    @AfterEach
    void finTest(){
        System.out.println("--Fin del test");
    }

    @InjectMocks DaoAnimalesImp daoAnimalesImp;
    @Mock Animales lista;

    @Test
    void getListaAnimales() {

        /*given*/

        //this.lista = lista;
        //this.lista = new Animales();
        Set<Animal> setAnimal = new HashSet<>();
        setAnimal.add(new Animal("Anchoa", "perro", "Collie", 3));
        setAnimal.add(new Animal("Will", "perro", "Golden", 5));

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
    void testGetListaAnimales() {
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
}