package concesionario.clases;

import java.util.Set;
import java.util.TreeSet;

public class Concesionario {
	
	//Atributos
	private Set<Vehiculo> inventario;

	//Constructor
	public Concesionario(Set<Vehiculo> inventario) {
		super();
		this.inventario = new TreeSet<>();
	}

	//Getter y setter
	public Set<Vehiculo> getInventario() {
		return inventario;
	}

	public void setInventario(Set<Vehiculo> inventario) {
		this.inventario = inventario;
	}
	
	//Método agregar vehículo al inventario
	public void agregarVehiculo(Vehiculo vehiculo) {
		inventario.add(vehiculo);
	}
	
}
