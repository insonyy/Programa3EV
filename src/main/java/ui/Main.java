package ui;

import common.TipoException;
import lombok.extern.log4j.Log4j2;
import service.ServicioGestion;

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
