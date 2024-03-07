package Control.funciones;

import java.awt.Rectangle;

import modelo.Variables;
import vista.*;

public class FuncionesPantallas {

	public static void cordenadas(Rectangle Cordenada) {
		Variables.cordX = (int)Cordenada.getX();
    	Variables.cordY = (int)Cordenada.getY();
	}
	
	public static void abrirMenuPrincipal() {
		MenuPrincipal principalPantalla = new MenuPrincipal();
		principalPantalla.setVisible(true);
	}

	public static void abrirOptions() {
		Options optionsPantalla = new Options();
		optionsPantalla.setVisible(true);
	}

	public static void abrirCarga() {
		Carga cargaPantalla = new Carga();
		cargaPantalla.setVisible(true);
	}	

}
