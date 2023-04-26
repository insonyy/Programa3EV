package ui;

import java.util.Scanner;

public class MenuGestionAltasyBajas {
    public void menuGestionAltasyBajas() {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        do{
        	
            System.out.println("Escribe una de las opciones");
            System.out.println("1. Listar ingresos actuales");
            System.out.println("2. Ingresar/dar el alta a un paciente");
            System.out.println("3. Salir");


            opcion = sn.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Has seleccionado listar ingresos actuales");
                    break;
                case 2:
                    System.out.println("Has seleccionado ingresar/dar el alta a un paciente");
                    break;
                case 3:
                    salir=true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 3");
            }

        }while(!salir);
        sn.close();

    }
}
