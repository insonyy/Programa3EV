package dao;

import domain.Empleado;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoEmpleadosFicheros implements Serializable {

    private static final String FicheroEmpleados = "FicheroEmpleados";

    public static boolean escribirFicherosEmpleados(List<Empleado> list){
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(FicheroEmpleados);
            for (int i = 0;i< list.size();i++){
                pw.println(list.get(i).toStringFicheroEmpleado());
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return true;
    }
    public static List<Empleado> leerArrayList(){

    List<Empleado> lista =new ArrayList<>();
    try{

        Scanner sc = new Scanner(new File(FicheroEmpleados));
        while (sc.hasNextLine()) {
            String linea = sc.nextLine();
            String division[] = linea.split(";");
            Empleado empleado = new Empleado(division[0],division[1],division[2],division[3]);
            lista.add(empleado);
        }
        sc.close();
        Collections.sort(lista);
    } catch (FileNotFoundException e) {

    }
    return lista;
    }

    public static void leerBuffered() {
    try(BufferedReader bf = new BufferedReader(new FileReader(FicheroEmpleados))) {
    String cadena = null;
        do {
            cadena = bf.readLine();
            if (cadena != null) {
                System.out.println(cadena);
            }
        } while (cadena != null);

    }
    catch (FileNotFoundException ex){
        Logger.getLogger(DaoEmpleadosFicheros.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (IOException ex) {
        Logger.getLogger(DaoEmpleadosFicheros.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
}
