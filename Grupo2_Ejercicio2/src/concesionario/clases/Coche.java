package concesionario.clases;

import concesionario.interfaces.Entregable;

public class Coche extends Vehiculo implements Entregable{
	
	//Atributos
	private String tipo;
	private int capacidad;
	
	//Constructor
	public Coche(String marca, String modelo, String anyo, int precio, String tipo, int capacidad) {
		super(marca, modelo, anyo, precio);
		setTipo(tipo);
		setCapacidad(capacidad);
	}

	//Getters y Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (!tipo.isEmpty()) {
			this.tipo = tipo;
		} else {
			throw new ArithmeticException("ERROR. El tipo no puede estar vacío.");
		}
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		if (capacidad > 0) {
			this.capacidad = capacidad;
		} else {
			throw new ArithmeticException("ERROR. La capacidad no puede ser inferior a 0");
		}
	}
	
	@Override
	public String toString() {
		return "Coche [tipo=" + this.tipo + ", capacidad=" + this.capacidad + ", marca= " + super.getMarca() + ", modelo=" + super.getModelo() + ", anyo=" + super.getAnyo() + ", precio=" + super.getPrecio() + ", entregado=" + super.isEntregado() + ", disponible=" + super.isDisponible() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Coche nuevo = (Coche) obj;
		boolean result = false;
		if(super.equals(nuevo) && this.getCapacidad() == nuevo.getCapacidad() && this.getTipo().equals(nuevo.getTipo())) {
			result = true;
		}
		return result;
	}

	@Override
	public void entregar(Cliente cliente) {
	    for (Vehiculo coche : cliente.getVehiculosComprados()) {
	        if (coche.equals(this)) {
	            if (!this.isEntregado() && !this.isDisponible()) {
	                setEntregado(true);
	                System.out.println("El coche " + this.getMarca() + " ha sido entregado al Cliente " + cliente.getNombre());
	            } else {
	                System.out.println("El coche " + this.getMarca() + " ya estaba entregado al Cliente " + cliente.getNombre());
	            }
	        }
	    }
	}
}