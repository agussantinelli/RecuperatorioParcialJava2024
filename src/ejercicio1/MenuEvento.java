package ejercicio1;

public class MenuEvento {

	private int cantidad;
	
	private Menu menu;
	
	public double getCostoMenu(){
		
		return cantidad * menu.getValorUnitario();
		
	}
	
}
