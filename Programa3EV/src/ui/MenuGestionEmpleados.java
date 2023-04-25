package ui;

import java.util.Scanner;

public class MenuGestionEmpleados {

    static final int cont = 2223;
    public void menuEmpleados() {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while(!salir){

            System.out.println("1. Veterinarios");
            System.out.println("2. Recepcionistas");
            System.out.println("3. Ayudantes");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Has seleccionado veterinarios");
                    break;
                case 2:
                    System.out.println("Has seleccionado recepcionistas");
                    break;
                case 3:
                    System.out.println("Has seleccionado ayudantes");
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
