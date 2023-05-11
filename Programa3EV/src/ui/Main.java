package ui;

import common.TipoException;
import dao.DaoEmpleadosImp;
import service.ServicioGestion;

public class Main {


	public static void main(String[] args) {
		MenuPrincipal mPrincipal = new MenuPrincipal();
		try {
			mPrincipal.menuPrincipal();
			ServicioGestion sg = new ServicioGestion();
			//sg.escribirFicheroEmpleado(sg.getListaEmpleados());
			//sg.escribirFicheroAnimales(sg.getListaAnimales());
		} catch (TipoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
