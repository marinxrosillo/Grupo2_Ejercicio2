package concesionario.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import concesionario.comparadores.ComparadorPrecioAscendente;

public class Concesionario {

	// Atributos
	private Set<Vehiculo> inventario;

	// Constructor
	public Concesionario() {
		this.inventario = new TreeSet<>();
	}

	// Getter y setter
	public Set<Vehiculo> getInventario() {
		return inventario;
	}

	public void setInventario(Set<Vehiculo> inventario) {
		this.inventario = inventario;
	}

	// Metodo agregar vehiculo al inventario
	public void agregarVehiculo(Vehiculo vehiculo) {
		inventario.add(vehiculo);
	}

	// Metodo para mostrar la lista de vehiculos disponibles ordenados por precio ascendente
	public void mostrarVehiculosOrdenadosPrecio() {
		System.out.println("Vehículos disponibles ordenados por precio ascendente:");

		Set<Vehiculo> vehiculosOrdenados = new TreeSet<>(new ComparadorPrecioAscendente());
		vehiculosOrdenados.addAll(inventario);

		for (Vehiculo vehiculo : vehiculosOrdenados) {
			System.out.println(vehiculo.toString());
		}
	}

	// Metodo para buscar por marca
	public void buscarPorMarca(String marca) {
		List<Vehiculo> vehiculosPorMarca = new ArrayList<>();

		for (Vehiculo vehiculo : inventario) {
			if (vehiculo.getMarca().equalsIgnoreCase(marca)) {
				vehiculosPorMarca.add(vehiculo);
			}
		}

		if (vehiculosPorMarca.isEmpty()) {
			System.out.println("No se encontraron vehículos de la marca " + marca);
		} else {
			System.out.println("Se encontraron los siguientes vehículos de la marca " + marca + ":");
			for (Vehiculo vehiculoEncontrado : vehiculosPorMarca) {
				System.out.println(vehiculoEncontrado);
			}
		}
	}

	// Metodo para buscar por modelo
	public void buscarPorModelo(String modelo) {
		List<Vehiculo> vehiculosPorModelo = new ArrayList<>();

		for (Vehiculo vehiculo : inventario) {
			if (vehiculo.getModelo().equalsIgnoreCase(modelo)) {
				vehiculosPorModelo.add(vehiculo);
			}
		}

		if (vehiculosPorModelo.isEmpty()) {
			System.out.println("No se encontraron vehículos del modelo " + modelo);
		} else {
			System.out.println("Se encontraron los siguientes vehículos del modelo " + modelo + ":");
			for (Vehiculo vehiculoEncontrado : vehiculosPorModelo) {
				System.out.println(vehiculoEncontrado);
			}
		}
	}

	// Metodo para buscar por anyo
	public void buscarPorAnyo(String anyo) {
		List<Vehiculo> vehiculosPorAnyo = new ArrayList<>();

		for (Vehiculo vehiculo : inventario) {
			if (vehiculo.getAnyo().equalsIgnoreCase(anyo)) {
				vehiculosPorAnyo.add(vehiculo);
			}
		}

		if (vehiculosPorAnyo.isEmpty()) {
			System.out.println("No se encontraron vehículos del año " + anyo);
		} else {
			System.out.println("Se encontraron los siguientes vehículos del año " + anyo + ":");
			for (Vehiculo vehiculoEncontrado : vehiculosPorAnyo) {
				System.out.println(vehiculoEncontrado);
			}
		}
	}

	// Metodo para buscar por modelo, marca y anyo
	public void buscarGeneral(String marca, String modelo, String anyo) {
		List<Vehiculo> buscarGeneral = new ArrayList<>();

		for (Vehiculo vehiculo : inventario) {
			if (vehiculo.getMarca().equalsIgnoreCase(marca) && vehiculo.getModelo().equalsIgnoreCase(modelo)
					&& vehiculo.getAnyo().equals(anyo)) {
				buscarGeneral.add(vehiculo);
			}
		}

		if (buscarGeneral.isEmpty()) {
			System.out.println("No se encontraron los vehículos.");
		} else {
			System.out.println("Se encontraron los siguientes vehículos: ");
			for (Vehiculo vehiculoEncontrado : buscarGeneral) {
				System.out.println(vehiculoEncontrado);
			}
		}
	}

	// Metodo para mostrar el vehiculo mas barato
	public Vehiculo buscarVehiculoMasBarato() {
		Vehiculo vehiculoMasBarato = null;
		int precioMasBarato = Integer.MAX_VALUE;

		for (Vehiculo vehiculo : inventario) {
			if (vehiculo.isDisponible() && vehiculo.getPrecio() < precioMasBarato) {
				vehiculoMasBarato = vehiculo;
				precioMasBarato = vehiculo.getPrecio();
			}
		}
		return vehiculoMasBarato;
	}

	// Metodo para mostrar el vehiculo mas caro
	public Vehiculo buscarVehiculoMasCaro() {
		Vehiculo vehiculoMasCaro = null;
		int precioMasCaro = 0;

		for (Vehiculo vehiculo : inventario) {
			if (vehiculo.isDisponible() && vehiculo.getPrecio() > precioMasCaro) {
				vehiculoMasCaro = vehiculo;
				precioMasCaro = vehiculo.getPrecio();
			}
		}
		return vehiculoMasCaro;
	}

	// Metodo para devolver el mas caro y el mas barato
	public void mostrarVehiculosCaroBarato() {
		Vehiculo vehiculoMasBarato = buscarVehiculoMasBarato();
		Vehiculo vehiculoMasCaro = buscarVehiculoMasCaro();

		System.out.println("Vehículo más barato: " + vehiculoMasBarato);

		System.out.println("Vehículo más caro: " + vehiculoMasCaro);
	}

	// Metodo vender
	public void vender(Vehiculo vehiculo, Cliente cliente) {
		if (inventario.contains(vehiculo) && vehiculo.isDisponible()) {
			vehiculo.setDisponible(false);
			cliente.comprarVehiculo(vehiculo);
			inventario.remove(vehiculo);
			System.out.println(
					"El Vehiculo " + vehiculo.getMarca() + " ha sido vendido al Cliente " + cliente.getNombre());
		} else {
			throw new ArithmeticException("ERROR. No se puede vender ese vehículo.");
		}
	}
}