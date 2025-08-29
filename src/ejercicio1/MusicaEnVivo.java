package ejercicio1;

public class MusicaEnVivo extends Servicio{

	private double costoHora;
	private double gastosFijos;

	@Override
	public double getCostoServicio(double duracionHs){
		return (costoHora*duracionHs+gastosFijos);
	}
}
