package concesionario.clases;


import concesionario.interfaces.Entregable;

public class Camion extends Vehiculo implements Entregable{
	
	//Atributos
	private double carga;

	//Constructor
	public Camion(String marca, String modelo, String anyo, int precio, double carga, boolean disponible) {
		super(marca, modelo, anyo, precio, disponible);
		setCarga(carga);
	}

	//Getters y Setters
	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		if (carga > 0) {
			this.carga = carga;
		} else {
			throw new ArithmeticException("ERROR. La carga no puede ser inferior a 0");
		}
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
		if(super.equals(nuevo) && this.getCarga() == nuevo.getCarga() ) {
			result = true;
		}
		return result;
	}

	@Override
	public void entregar(Cliente cliente) {
	    for (Vehiculo c : cliente.getVehiculosComprados()) {
	        if (c.equals(this)) {
	            if (!this.isDisponible()) {
	                this.setDisponible(true);
	                System.out.println("El camión " + this + " ha sido entregado.");
	            } else {
	                System.out.println("El camión " + this + " ya estaba entregado.");
	            }
	        }
	    }
	}
	
	
}