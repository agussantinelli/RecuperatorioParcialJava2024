package ejercicio1;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Evento {
	
	private String nombre;
	private double duracionHs;
	private LocalDateTime fechaHora;
	
	ArrayList<MenuEvento> menuEventos;
	ArrayList<Servicio> servicios;


	
	public double getCostoEvento(){
		double suma=0.0;
		for (MenuEvento menuEvento: menuEventos) {
			 suma += menuEvento.getCostoMenu();
		}
		for (Servicio servicio: servicios) {
			suma += servicio.getCostoServicio(duracionHs);
		}
		return suma;
	}
		
	
	
}
