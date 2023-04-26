package main;

import ui.MenuGestionAnimales;
import ui.MenuGestionEmpleados;
import ui.MenuPrincipal;

public class Main {

	public static void main(String[] args) {
		MenuPrincipal mPrincipal=new MenuPrincipal();
		mPrincipal.menuPrincipal(new MenuGestionAnimales(), new MenuGestionEmpleados());
	}

}
