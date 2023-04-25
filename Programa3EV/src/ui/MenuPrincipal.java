package ui;

import java.util.Scanner;

public class MenuPrincipal {
    public void menuPrincipal(MenuGestionAnimales mga, MenuGestionEmpleados mge,MenuGestionAltasyBajas mgayb) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while(!salir){

            System.out.println("1. Animales");
            System.out.println("2. Empleados");
            System.out.println("3. Altas y bajas");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch(opcion){
                case 1:
                    mga.menuAnimales();
                    break;
                case 2:
                    System.out.println("Por favor introduzca contraseña para acceder a la gestion de empleados");
                    int contra = sn.nextInt();
                    System.out.println(contra);
                    if (contra == MenuGestionEmpleados.cont) {
                        mge.menuEmpleados();
                    } else {
                        System.out.println("Contraseña incorrecta");
                        System.out.println();
                    }
                    break;
                case 3:
                    mgayb.menuGestionAltasyBajas();
                    break;
                case 4:
                    salir=true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }

        }

    }
}
