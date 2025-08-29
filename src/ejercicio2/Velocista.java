package ejercicio2;

import java.util.LinkedList;

public class Velocista {
	
	private String nombreCompleto;
	
	LinkedList<Prueba> pruebas;
	
	public Prueba mejorPrueba() {
		if (pruebas==null) {
			return null;
		}
		Prueba mejorPrueba = pruebas.get(0);
		
		for (int i = 1; i < pruebas.size(); i++) {
			Prueba prueba = pruebas.get(i);
			if (prueba.getTiempoSegundos() < mejorPrueba.getTiempoSegundos()) {
				mejorPrueba = prueba;
			}
		}
		
		return mejorPrueba;
	}
	
	
}
