package ejercicio1;

import java.util.ArrayList;

public class ServicioPropio extends Servicio{

	private double costoFijo;
	
	ArrayList<Empleado> empleados;
	
	@Override
	public double getCostoServicio(double duracionHs){
		double suma = costoFijo;
		for (Empleado empleado: empleados) {
			suma += empleado.getSueldoHora()*duracionHs;
		}
		return suma;
	}
}
