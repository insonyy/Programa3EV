package ui;

import common.TipoException;
import lombok.extern.log4j.Log4j2;
import service.ServicioGestion;

@Log4j2

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
			log.error(e.getMessage(),e);
		}

	}

}
