package main;

import ui.MenuGestionAnimales;
import ui.MenuGestionEmpleados;
import ui.MenuPrincipal;

public class main {

	public static void main(String[] args) {
		MenuPrincipal mPrincipal=new MenuPrincipal();
		mPrincipal.menuPrincipal(new MenuGestionAnimales(), new MenuGestionEmpleados());
	}

}
