package dao;

import domain.Animal;

import java.io.*;
import java.util.*;

public class DaoAnimalesFicheros {


    public static final String FICHERO = "Fichero";


    public static boolean escribirFicheros(Set<Animal> list){
        PrintWriter pw = null;
        try{
            pw = new PrintWriter(FICHERO);
            for(Iterator <Animal>iter= list.iterator(); iter.hasNext();){
                Animal animal=iter.next();
                animal.toStringFichero();
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static Set<Animal> readArrayList(){

        Set<Animal> lista = new HashSet<>();
        try {
            Scanner teclado = new Scanner(new File(FICHERO));
            while (teclado.hasNextLine()){
                String linea = teclado.nextLine();
                String sub[] = linea.split(";");
                Animal animal = new Animal(sub[0],sub[1], Integer.parseInt(sub[2]),sub[3]);
                lista.add(animal);
            }
            teclado.close();
        }
        catch (Exception e){

        }
        return lista;
    }

    public static void readBuffered(){
        try (BufferedReader bf = new BufferedReader(new FileReader(FICHERO))){
            String cadena = null;
            do {
                cadena = bf.readLine();
                if (cadena != null){
                    System.out.println(cadena);
                }
            }while (cadena != null);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
