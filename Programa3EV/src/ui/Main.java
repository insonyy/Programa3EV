package ui;

import common.TipoException;
import dao.DaoEmpleadosImp;

public class Main {


	public static void main(String[] args) {
		DaoEmpleadosImp dei = new DaoEmpleadosImp();
		dei.map();
		MenuPrincipal mPrincipal = new MenuPrincipal();
		try {
			mPrincipal.menuPrincipal();
		} catch (TipoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
