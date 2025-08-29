package ejercicio1;

public class ServicioDeTerceros extends Servicio {

	private String proveedor;
	private String telefono;
	private double costoBase;

	@Override
	public double getCostoServicio(double duracionHs){
		return costoBase;
	}

}
