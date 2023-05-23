package concesionario;

public class Camion extends Vehiculo{
	
	//Atributos
	private double carga;

	//Constructor
	public Camion(String marca, String modelo, String anyo, int precio, double carga) {
		super(marca, modelo, anyo, precio);
		this.carga = carga;
	}

	//Getters y Setters
	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	
}