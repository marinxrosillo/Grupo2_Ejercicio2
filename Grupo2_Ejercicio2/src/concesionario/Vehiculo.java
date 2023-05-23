package concesionario;

public class Vehiculo {

	//Atributos
	private String marca;
	private String modelo;
	private String anyo;
	private double precio;
	
	//Constructor
	public Vehiculo(String marca, String modelo, String anyo, double precio) {
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}