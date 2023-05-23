package concesionario.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import concesionario.comparadores.ComparadorPrecioAscendente;


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
	
	
	
	
	
	// Método para mostrar la lista de vehículos disponibles ordenados por precio ascendente
		public void mostrarVehiculosOrdenadosPrecio() {
			
			System.out.println("Vehículos disponibles ordenados por precio ascendente:");
			
			Set<Vehiculo> vehiculosOrdenados = new TreeSet<>(new ComparadorPrecioAscendente());
			vehiculosOrdenados.addAll(inventario);
			
			for (Vehiculo vehiculo : vehiculosOrdenados) {
				System.out.println(vehiculo);
			}
		}
		
		
		
		
		
		
		
		
		
		
		// Método para buscar vehículos por marca, modelo y año
		public List<Vehiculo> buscarVehiculos(String marca, String modelo, String anyo) {
		    List<Vehiculo> vehiculosEncontrados = new ArrayList<>();

		    for (Vehiculo vehiculo : inventario) {
		        if (vehiculo.getMarca().equalsIgnoreCase(marca) &&
		                vehiculo.getModelo().equalsIgnoreCase(modelo) &&
		                vehiculo.getAnyo().equals(anyo)) {
		            vehiculosEncontrados.add(vehiculo);
		        }
		    }

		    return vehiculosEncontrados;
		}
	
}
