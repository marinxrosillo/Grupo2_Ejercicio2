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
		
		//Metodo para mostrar el vehiculo mas barato
		public Vehiculo buscarVehiculoMasBarato() {
		    Vehiculo vehiculoMasBarato = null;
		    int precioMasBarato = Integer.MAX_VALUE;

		    for (Vehiculo vehiculo : inventario) {
		        if (!vehiculo.isEntregado() && vehiculo.getPrecio() < precioMasBarato) {
		            vehiculoMasBarato = vehiculo;
		            precioMasBarato = vehiculo.getPrecio();
		        }
		    }

		    return vehiculoMasBarato;
		}
		
		//Metodo para mostrar el vehiculo mas caro
		public Vehiculo buscarVehiculoMasCaro() {
		    Vehiculo vehiculoMasCaro = null;
		    int precioMasCaro = 0;

		    for (Vehiculo vehiculo : inventario) {
		        if (!vehiculo.isEntregado() && vehiculo.getPrecio() > precioMasCaro) {
		            vehiculoMasCaro = vehiculo;
		            precioMasCaro = vehiculo.getPrecio();
		        }
		    }

		    return vehiculoMasCaro;
		}
		
		//Metodo para devolver el mas caro y el más barato
		public void mostrarVehiculosCaroBarato() {
	        Vehiculo vehiculoMasBarato = buscarVehiculoMasBarato();
	        Vehiculo vehiculoMasCaro = buscarVehiculoMasCaro();

	        System.out.println("Vehículo más barato:");
            System.out.println(vehiculoMasBarato);

            System.out.println("Vehículo más caro:");
            System.out.println(vehiculoMasCaro);

	    }
		
		


	
}
