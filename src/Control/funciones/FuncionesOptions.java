package Control.funciones;

import modelo.Variables;

public class FuncionesOptions {

	public static void Resolucion() {
		if (Variables.indice == 1) {
			Variables.resolucionX = 600;
			Variables.resolucionY = 375;
		} else if (Variables.indice == 2) {
			Variables.resolucionX = 1200;
			Variables.resolucionY = 750;
		}
	}
	
}
