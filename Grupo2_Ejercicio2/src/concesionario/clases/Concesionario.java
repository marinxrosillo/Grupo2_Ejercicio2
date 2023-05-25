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
	public Concesionario() {
		this.inventario = new TreeSet<>();
	}

	//Getter y setter
	public Set<Vehiculo> getInventario() {
		return inventario;
	}

	public void setInventario(Set<Vehiculo> inventario) {
		this.inventario = inventario;
	}
	
	//Metodo agregar vehiculo al inventario
	public void agregarVehiculo(Vehiculo vehiculo) {
		inventario.add(vehiculo);
	}
	
	//Metodo para mostrar la lista de vehiculos disponibles ordenados por precio ascendente
	public void mostrarVehiculosOrdenadosPrecio() {		
		System.out.println("Vehículos disponibles ordenados por precio ascendente:");
			
		Set<Vehiculo> vehiculosOrdenados = new TreeSet<>(new ComparadorPrecioAscendente());
		vehiculosOrdenados.addAll(inventario);
			
		for (Vehiculo vehiculo : vehiculosOrdenados) {
				System.out.println(vehiculo.toString());
		}
	}		
		
	//Metodo para buscar vehiculos por marca, modelo y anyo
	public void buscarVehiculos(String marca, String modelo, String anyo) {
		List<Vehiculo> vehiculosEncontrados = new ArrayList<>();

		for (Vehiculo vehiculo : inventario) {
			if (vehiculo.getMarca().equalsIgnoreCase(marca) &&
					vehiculo.getModelo().equalsIgnoreCase(modelo) &&
						vehiculo.getAnyo().equals(anyo)) {
		        	vehiculosEncontrados.add(vehiculo);
		        	System.out.println("Se ha encontrado el " + vehiculo);
		        	break;
		    } else  {
		    	System.out.println("No se ha encontrado el " + vehiculo);
		    }
		}
	}
		
	//Metodo para mostrar el vehiculo mas barato
	public Vehiculo buscarVehiculoMasBarato() {
		Vehiculo vehiculoMasBarato = null;
		int precioMasBarato = Integer.MAX_VALUE;

		for (Vehiculo vehiculo : inventario) {
			if (!vehiculo.isDisponible() && vehiculo.getPrecio() < precioMasBarato) {
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
			if (!vehiculo.isDisponible() && vehiculo.getPrecio() > precioMasCaro) {
				vehiculoMasCaro = vehiculo;
				precioMasCaro = vehiculo.getPrecio();
		        }
		    }
		return vehiculoMasCaro;
	}
		
	//Metodo para devolver el mas caro y el mas barato
	public void mostrarVehiculosCaroBarato() {
		Vehiculo vehiculoMasBarato = buscarVehiculoMasBarato();
		Vehiculo vehiculoMasCaro = buscarVehiculoMasCaro();

		System.out.println("Vehículo más barato: " + vehiculoMasBarato);

		System.out.println("Vehículo más caro: " + vehiculoMasCaro);
	}
	
	//Metodo vender
	public void vender(Vehiculo vehiculo, Cliente cliente) {
		if (inventario.contains(vehiculo) && vehiculo.isDisponible()) {
			vehiculo.setDisponible(false);
			cliente.comprarVehiculo(vehiculo);
			inventario.remove(vehiculo);
			System.out.println("El Vehiculo " + vehiculo.getMarca() + " ha sido vendido al Cliente " + cliente.getNombre());
		} else {
			throw new ArithmeticException("ERROR. No se puede vender ese vehículo.");
		}	
	}
}