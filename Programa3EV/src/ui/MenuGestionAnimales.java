package ui;

import java.util.Scanner;

public class MenuGestionAnimales {
    public void menuAnimales(){

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while(!salir){

            System.out.println("1. Exoticos");
            System.out.println("2. Mascotas");
            System.out.println("3. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Has seleccionado animales exóticos");
                    break;
                case 2:
                    System.out.println("Has seleccionado mascotas");
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
