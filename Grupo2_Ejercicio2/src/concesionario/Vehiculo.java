package concesionario;

import java.util.Objects;

public class Vehiculo implements Comparable<Vehiculo> {

	//Atributos
	private String marca;
	private String modelo;
	private String anyo;
	private int precio;
	
	//Constructor
	public Vehiculo(String marca, String modelo, String anyo, int precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anyo = anyo;
		this.precio = precio;
	}

	//Getters y Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnyo() {
		return anyo;
	}

	public void setAnyo(String anyo) {
		this.anyo = anyo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	//Metodos
	@Override
	public int compareTo(Vehiculo o) {
		return this.getPrecio() - o.getPrecio();
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + this.marca + ", modelo=" + this.modelo + ", anyo=" + this.anyo + ", precio=" + this.precio + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Vehiculo nuevo = (Vehiculo) obj;
		boolean result = false;
		
		if(this.getMarca().equals(nuevo) && this.getModelo().equals(nuevo) 
				&& this.anyo.equals(nuevo) && this.getPrecio() == nuevo.getPrecio()) {
			result = true;
		}
		return result;
	}
	
}