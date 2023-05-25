package concesionario.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import concesionario.clases.*;

public class TestConcesionario {

	public static void main(String[] args) {
		
		Concesionario concesionario = new Concesionario();
		
		Vehiculo vehiculo1 = new Vehiculo("Ford", "Focus", "2003", 750);
		Vehiculo vehiculo2 = new Vehiculo("Nissan", "Micra", "2019", 13000);
		Vehiculo vehiculo3 = new Vehiculo("Mercedes", "ClaseA", "2022", 45000);
		
		Vehiculo vehiculo4 = new Camion("Volvo", "FH", "2010", 7000, 60);
		
		Vehiculo vehiculo5 = new Coche("Skoda", "Fabia", "2018", 9000, "Berlina", 5);
		
		Coche coche1 = new Coche("Audi", "A1", "2018", 9000, "Berlina", 5);
		
		concesionario.agregarVehiculo(vehiculo1);
		concesionario.agregarVehiculo(vehiculo2);
		concesionario.agregarVehiculo(vehiculo3);
		concesionario.agregarVehiculo(vehiculo4);
		concesionario.agregarVehiculo(vehiculo5);
		concesionario.agregarVehiculo(coche1);
		
		concesionario.mostrarVehiculosOrdenadosPrecio();
		
		concesionario.mostrarVehiculosCaroBarato();
		
		Cliente cliente = new Cliente("Vladi", "El Viso del Alcor");
		
		concesionario.vender(vehiculo1, cliente);
		
		concesionario.vender(coche1, cliente);
		
		concesionario.mostrarVehiculosOrdenadosPrecio();
		
		coche1.entregar(cliente);
		
		concesionario.buscarVehiculos("Nissan", "Micra", "2019");
		
		
		
	}
}