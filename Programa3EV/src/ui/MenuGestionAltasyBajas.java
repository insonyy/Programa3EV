package ui;

import java.util.Scanner;

public class MenuGestionAltasyBajas {
    public void menuGestionAltasyBajas() {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while(!salir){

            System.out.println("1. Altas");
            System.out.println("2. Bajas");
            System.out.println("3. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Has seleccionado altas");
                    break;
                case 2:
                    System.out.println("Has seleccionado bajas");
                    break;
                case 3:
                    salir=true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 3");
            }

        }

    }
}
