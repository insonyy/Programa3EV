package dao;

import domain.Animal;
import lombok.Data;
import lombok.extern.log4j.Log4j2;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


@Data
@Log4j2

public class DaoAnimalesFicheros {


    public static final String FicheroAnimales = "FicheroAnimales";


    public static boolean escribirFicheros(Set<Animal> list) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(FicheroAnimales);
            for (Iterator<Animal> iter = list.iterator(); iter.hasNext(); ) {
                Animal animal = iter.next();
                animal.toStringFichero();
                pw.println(animal);
            }
            pw.close();
        } catch (FileNotFoundException e) {
            log.error(e.getMessage(), e);
        }
        return true;
    }

    public static Set<Animal> readArrayList() {

        Set<Animal> lista = new HashSet<>();
        try {
            //File f = new File(FicheroAnimales);
            Scanner teclado = new Scanner(new File(FicheroAnimales));
            while (teclado.hasNextLine()) {
                String linea = teclado.nextLine();
                String sub[] = linea.split(",");
                Animal animal = new Animal(sub[0], sub[1], Integer.parseInt(sub[2]), sub[3]);
                lista.add(animal);
            }
            teclado.close();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return lista;
    }

    public static void readBuffered() {
        try (BufferedReader bf = new BufferedReader(new FileReader(FicheroAnimales))) {
            //File f = new File(FicheroAnimales);
            //FileReader fr = new FileReader(new File(FicheroAnimales));
            String cadena = null;
            do {
                cadena = bf.readLine();
                if (cadena != null) {
                    System.out.println(cadena);
                }
            } while (cadena != null);
        } catch (FileNotFoundException e) {
            Logger.getLogger(DaoEmpleadosFicheros.class.getName()).log(Level.SEVERE, null, e);
            log.error(e.getMessage(),e);
        } catch (IOException e) {
            Logger.getLogger(DaoEmpleadosFicheros.class.getName()).log(Level.SEVERE, null, e);
            log.error(e.getMessage(),e);
        }

    }


}
