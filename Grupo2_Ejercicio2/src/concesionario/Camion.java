package concesionario;

import java.util.Objects;

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
	//Métodos

	@Override
	public String toString() {
		return "Camion [carga=" + this.carga +"marca= + " + super.getMarca() + ", modelo=" + super.getModelo() + ", anyo=" + super.getAnyo() + ", precio=" + super.getPrecio() + "]";
	}

	
	@Override
	public boolean equals(Object obj) {
		Camion nuevo = (Camion) obj;
		boolean result = false;
		if(super.equals(nuevo) && this.carga == nuevo.carga ) {
			result = true;
		}
		return result;
	}
	
	
}