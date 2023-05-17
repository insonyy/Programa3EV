package ui;

import common.TipoException;
import lombok.extern.log4j.Log4j2;
import service.ServicioGestion;

import java.io.IOException;

@Log4j2

public class Main {


	public static void main(String[] args){
//		DaoEmpleadosImp dei = new DaoEmpleadosImp();
//		dei.map();
		MenuPrincipal mPrincipal = new MenuPrincipal();

			try {
				mPrincipal.menuPrincipal();
			} catch (TipoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		ServicioGestion sg = new ServicioGestion();
			try {
				sg.escribirFicheroEmpleado(sg.getListaEmpleados());
			} catch (TipoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				sg.escribirFicheroAnimales(sg.getListaAnimales());
			} catch (TipoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

	}

}
