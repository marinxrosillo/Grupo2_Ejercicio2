package concesionario.clases;

import concesionario.interfaces.Entregable;

public class Coche extends Vehiculo implements Entregable{
	
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
	@Override
	public String toString() {
		return "Coche [tipo=" + this.tipo + ", capacidad=" + this.capacidad +"marca= + " + super.getMarca() + ", modelo=" + super.getModelo() + ", anyo=" + super.getAnyo() + ", precio=" + super.getPrecio() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Coche nuevo = (Coche) obj;
		boolean result = false;
		if(super.equals(nuevo) && this.capacidad == nuevo.capacidad && this.tipo.equals(nuevo)) {
			result = true;
		}
		return result;
	}

	@Override
	public void entregar() {
		System.out.println("Coche entregado");
		
	}
	
	
	
	
	
	
	

}