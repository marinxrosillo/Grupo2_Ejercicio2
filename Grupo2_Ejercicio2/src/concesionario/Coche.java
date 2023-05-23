package concesionario;

public class Coche extends Vehiculo {
	
	//Atributos
	private String tipo;
	private int capacidad;
	
	//Constructor
	public Coche(String marca, String modelo, String anyo, int precio, String tipo, int capacidad) {
		super(marca, modelo, anyo, precio);
		this.tipo = tipo;
		this.capacidad = capacidad;
		
	}

	//Getters y Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	
	
	
	
	
	
	

}