package daoIngresos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import daoEmpleados.DaoEmpleadosFicheros;
import daoIngresos.Ingresos;
import domain.Ingreso;
import java.util.Collections;

public class DaoIngresosFicheros {
	public static final String FicheroIngresos = "FicheroIngresos";


	public static boolean escribirFicheros(List<Ingresos> list) {
		PrintWriter pw = null;

		try {
			pw = new PrintWriter(FicheroIngresos);
			for (int i = 0; i < list.size(); i++) {
				pw.println(list.get(i).toString());
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public static List<Ingreso> readArrayList() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        List<Ingreso> lista = new ArrayList<>();
            File f = new File(FicheroIngresos);

			try {
	            Scanner sc;
				sc = new Scanner(new File(FicheroIngresos));
				 while (sc.hasNextLine()) {
		                String linea = sc.nextLine();
		                String division[] = linea.split(";");
		                Ingreso ingreso = new Ingreso(division[0], division[1], division[2], LocalDate.parse(division[3], formato));
		                lista.add(ingreso);
		                }
		            sc.close();

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        return lista;
	}

	public static void readBuffered() {
		try (BufferedReader bf = new BufferedReader(new FileReader(FicheroIngresos))) {
			File f = new File(FicheroIngresos);
			FileReader fr = new FileReader(new File(FicheroIngresos));
			String cadena = null;
			do {
				cadena = bf.readLine();
				if (cadena != null) {
					System.out.println(cadena);
				}
			} while (cadena != null);
		} catch (FileNotFoundException e) {
			Logger.getLogger(DaoEmpleadosFicheros.class.getName()).log(Level.SEVERE, null, e);
		} catch (IOException e) {
			Logger.getLogger(DaoEmpleadosFicheros.class.getName()).log(Level.SEVERE, null, e);
		}

	}

}
