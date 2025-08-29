package ejercicio1;

import java.util.ArrayList;

public class Encargado extends Empleado{
	
	private double porcentajeComision;
	
	ArrayList<Evento> eventos;
	
	public double getPagoEncargado() {
		double suma=0.0;
		for (Evento evento: eventos) {
			suma+= porcentajeComision * evento.getCostoEvento();
		}
		
		return suma;
	}
	
}
